// ControlPanel.jsx
import React, { useState } from "react";
import { useGraphMediator } from "./GraphMediator.jsx";
import {
  ThirtyDaysCommand,
  TwelveMonthsCommand,
  CustomDaysCommand,
} from "./GraphCommands.js";
import { DatePicker, Dropdown, Menu } from "antd";
import moment from "moment";

const { RangePicker } = DatePicker;

const ControlPanel = ({ graphId }) => {
  const { handleStateChange } = useGraphMediator();
  const [dateRange, setDateRange] = useState(null);
  const [showDatePicker, setShowDatePicker] = useState(false);

  const executeCommand = (command) => {
    command.execute();
    setShowDatePicker(false);
  };

  const handleCustom = () => {
    setShowDatePicker(true);
  };

  const handleDateChange = (dates) => {
    setDateRange(dates);
    if (dates && dates.length === 2) {
      const startDate = dates[0].toDate();
      const endDate = dates[1].toDate();
      const days = Math.ceil((endDate - startDate) / (1000 * 60 * 60 * 24)) + 1;
      new CustomDaysCommand(graphId, handleStateChange, days).execute();
    }
  };

  const menu = (
    <Menu>
      <Menu.Item
        key="30Days"
        onClick={() =>
          executeCommand(new ThirtyDaysCommand(graphId, handleStateChange))
        }
      >
        30 Days
      </Menu.Item>
      <Menu.Item
        key="12Months"
        onClick={() =>
          executeCommand(new TwelveMonthsCommand(graphId, handleStateChange))
        }
      >
        12 Months
      </Menu.Item>
      <Menu.Item key="Custom" onClick={handleCustom}>
        Custom
      </Menu.Item>
    </Menu>
  );

  return (
    <div>
      <Dropdown overlay={menu}>
        <a className="ant-dropdown-link" onClick={(e) => e.preventDefault()}>
          Select Graph State
        </a>
      </Dropdown>
      {showDatePicker && (
        <RangePicker
          value={dateRange}
          onChange={handleDateChange}
          format="YYYY-MM-DD"
        />
      )}
    </div>
  );
};

export default ControlPanel;
