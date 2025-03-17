// App.jsx
import React from "react";
import { GraphMediatorProvider } from "./GraphMediator.jsx";
import GraphComponent from "./GraphComponent.jsx";
import ControlPanel from "./ControlPanel.jsx";
import { ThirtyDaysState, TwelveMonthsState } from "./GraphState.jsx";

function App() {
  const graphs = [
    {
      id: 1,
      isSingleLine: false,
      dataKeys: ["sales", "customers"],
      apiEndpoint: "/api/sales",
      initialState: new ThirtyDaysState(),
    },
    {
      id: 2,
      isSingleLine: true,
      dataKeys: ["revenue"],
      apiEndpoint: "/api/revenue",
      initialState: new TwelveMonthsState(),
    },
    {
      id: 3,
      isSingleLine: false,
      dataKeys: ["downloads", "installs"],
      apiEndpoint: "/api/downloads",
      initialState: new ThirtyDaysState(),
    },
    {
      id: 4,
      isSingleLine: true,
      dataKeys: ["users"],
      apiEndpoint: "/api/users",
      initialState: new TwelveMonthsState(),
    },
  ];

  const initialGraphStates = graphs.reduce((acc, graph) => {
    acc[graph.id] = graph.initialState;
    return acc;
  }, {});

  return (
    <GraphMediatorProvider initialGraphStates={initialGraphStates}>
      <div style={{ display: "flex" }}>
        {graphs.map((graph) => (
          <div key={graph.id}>
            <ControlPanel graphId={graph.id} />
            <GraphComponent
              graphId={graph.id}
              isSingleLine={graph.isSingleLine}
              dataKeys={graph.dataKeys}
              apiEndpoint={graph.apiEndpoint}
            />
          </div>
        ))}
      </div>
    </GraphMediatorProvider>
  );
}

export default App;
