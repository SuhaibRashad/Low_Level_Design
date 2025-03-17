// App.jsx
import React from "react";
import { GraphMediatorProvider } from "./GraphMediator.jsx";
import GraphComponent from "./GraphComponent.jsx";
import ControlPanel from "./ControlPanel.jsx";

function App() {
  return (
    <GraphMediatorProvider>
      <div style={{ display: "flex", flexWrap:"wrap" }}>
        <div>
          <ControlPanel graphId={1} />
          <GraphComponent graphId={1} />
        </div>
        <div>
          <ControlPanel graphId={2} />
          <GraphComponent graphId={2} />
        </div>
        <div>
          <ControlPanel graphId={3} />
          <GraphComponent graphId={3} />
        </div>
        <div>
          <ControlPanel graphId={4} />
          <GraphComponent graphId={4} />
        </div>
        <div>
          <ControlPanel graphId={5} />
          <GraphComponent graphId={5} />
        </div>
      </div>
    </GraphMediatorProvider>
  );
}

export default App;
