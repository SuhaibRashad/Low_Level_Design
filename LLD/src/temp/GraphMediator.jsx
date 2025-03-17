// GraphMediator.jsx
import React, { createContext, useContext, useState } from "react";
import { ThirtyDaysState } from "./GraphState.jsx"; // Import needed state classes.

const GraphMediatorContext = createContext();

export const GraphMediatorProvider = ({ children }) => {
  const [graphStates, setGraphStates] = useState({
    1: new ThirtyDaysState(),
    2: new ThirtyDaysState(),
    3: new ThirtyDaysState(),
    4: new ThirtyDaysState(),
    5: new ThirtyDaysState(),
  });

  const handleStateChange = (graphId, newState) => {
    setGraphStates((prevStates) => ({
      ...prevStates,
      [graphId]: newState,
    }));
  };

  const getGraphState = (graphId) => {
    return graphStates[graphId];
  };

  const value = { getGraphState, handleStateChange };

  return (
    <GraphMediatorContext.Provider value={value}>
      {children}
    </GraphMediatorContext.Provider>
  );
};

export const useGraphMediator = () => useContext(GraphMediatorContext);
