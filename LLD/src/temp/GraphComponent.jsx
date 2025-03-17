// GraphComponent.jsx
import React, { useState, useEffect } from "react";
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

const GraphComponent = ({ graphId }) => {
  const { getGraphState } = useGraphMediator();
  const [data, setData] = useState([]);
  const state = getGraphState(graphId);
  const [xAxisKey, setXAxisKey] = useState(null);
//   const [dummy, setDummy] = useState(false); // Dummy state for re-render

  useEffect(() => {
    state.getData().then((newData) => {
      setData(newData);
      if (newData.length > 0) {
        setXAxisKey(newData[0].date ? "date" : "month");
      }
    //   setDummy((prev) => !prev); // Force re-render
    });
  }, [state, graphId]);

  if (!xAxisKey) {
    return <div>Loading...</div>;
  }

  console.log("data ", graphId, data, xAxisKey);

  return (
      <LineChart width={500} height={300} data={data}>
        <XAxis dataKey={xAxisKey} />
        <YAxis />
        <Tooltip />
        <Legend />
        <Line type="monotone" dataKey="vast" stroke="#8884d8" name="VAST" />
        <Line
          type="monotone"
          dataKey="interface"
          stroke="#82ca9d"
          name="Interface"
        />
      </LineChart>
  );
};

export default GraphComponent;
