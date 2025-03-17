// GraphCommands.js
import {
  ThirtyDaysState,
  TwelveMonthsState,
  CustomDaysState,
} from "./GraphState.jsx";

export class ThirtyDaysCommand {
  constructor(graphId, handleStateChange) {
    this.graphId = graphId;
    this.handleStateChange = handleStateChange;
  }

  execute() {
    this.handleStateChange(this.graphId, new ThirtyDaysState());
  }
}

export class TwelveMonthsCommand {
  constructor(graphId, handleStateChange) {
    this.graphId = graphId;
    this.handleStateChange = handleStateChange;
  }

  execute() {
    this.handleStateChange(this.graphId, new TwelveMonthsState());
  }
}

export class CustomDaysCommand {
  constructor(graphId, handleStateChange, inputValue) {
    this.graphId = graphId;
    this.handleStateChange = handleStateChange;
    this.inputValue = inputValue;
  }

  execute() {
    this.handleStateChange(this.graphId, new CustomDaysState(this.inputValue));
  }
}


export class ResetDataCommand {
  constructor(graphId, handleStateChange) {
    this.graphId = graphId;
    this.handleStateChange = handleStateChange;
  }

  execute() {
    // Create a new default state object (e.g., all 0s)
    
    this.handleStateChange(this.graphId, new ThirtyDaysState());
  }
}