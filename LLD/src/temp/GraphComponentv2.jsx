// GraphComponent.jsx
import React, { useState, useEffect, useRef } from "react";
import { useGraphMediator } from "./GraphMediator.jsx";
import {
  LineChart,
  Line,
  XAxis,
  YAxis,
  CartesianGrid,
  Tooltip,
  Legend,
} from "recharts";

const GraphComponent = ({
  graphId,
  isSingleLine = false,
  dataKeys = ["vast", "interface"],
  apiEndpoint,
}) => {
  const { getGraphState, handleStateChange } = useGraphMediator();
  const [data, setData] = useState([]);
  const [xAxisKey, setXAxisKey] = useState(null);
  const getDataRef = useRef(null);

  useEffect(() => {
    getDataRef.current = getGraphState(graphId).getData;
  }, [graphId]);

  useEffect(() => {
    const state = getGraphState(graphId);
    if (state.data && state.data.length > 0) {
      // Data already in state, use it
      setData(state.data);
      if (state.data.length > 0) {
        setXAxisKey(state.data[0].date ? "date" : "month");
      }
    } else {
      // Data not in state, fetch from backend
      const fetchData = async () => {
        try {
          const response = await fetch(
            `${apiEndpoint}?isSingleLine=${isSingleLine}`
          );
          if (!response.ok) {
            throw new Error(`HTTP error! status: ${response.status}`);
          }
          const newData = await response.json();
          setData(newData);
          if (newData.length > 0) {
            setXAxisKey(newData[0].date ? "date" : "month");
          }
          // Update the graph state with the fetched data
          handleStateChange(graphId, {
            ...getGraphState(graphId),
            data: newData,
          });
        } catch (error) {
          console.error("Error fetching data:", error);
        }
      };
      fetchData();
    }
  }, [graphId, isSingleLine, apiEndpoint, handleStateChange, getGraphState]);

  if (!xAxisKey) {
    return <div>Loading...</div>;
  }

  return (
    <div style={{ width: "500px", height: "300px" }}>
      <LineChart width={500} height={300} data={data}>
        <CartesianGrid strokeDasharray="3 3" />
        <XAxis dataKey={xAxisKey} />
        <YAxis />
        <Tooltip />
        <Legend />
        {isSingleLine ? (
          <Line
            type="monotone"
            dataKey={dataKeys[0]}
            stroke="#8884d8"
            name={dataKeys[0]}
          />
        ) : (
          <>
            <Line
              type="monotone"
              dataKey={dataKeys[0]}
              stroke="#8884d8"
              name={dataKeys[0]}
            />
            <Line
              type="monotone"
              dataKey={dataKeys[1]}
              stroke="#82ca9d"
              name={dataKeys[1]}
            />
          </>
        )}
      </LineChart>
    </div>
  );
};

export default GraphComponent;
