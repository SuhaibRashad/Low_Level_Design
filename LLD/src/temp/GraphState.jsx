// GraphState.jsx
class ThirtyDaysState {
  getData() {
    // Mock data for 30 days
    const data = Array.from({ length: 30 }, (_, i) => ({
      date: `2023-10-${i + 1}`,
      vast: Math.floor(Math.random() * 100),
      interface: Math.floor(Math.random() * 80),
    }));
    return Promise.resolve(data);
  }
}

class TwelveMonthsState {
  getData() {
    const months = [
      "Jan",
      "Feb",
      "Mar",
      "Apr",
      "May",
      "Jun",
      "Jul",
      "Aug",
      "Sep",
      "Oct",
      "Nov",
      "Dec",
    ];
    const currentYear = new Date().getFullYear().toString().slice(-2); // Get last two digits of the current year.

    // Mock data for 12 months with MMM-YY format
    const data = Array.from({ length: 12 }, (_, i) => ({
      month: `${months[i]}-${currentYear}`,
      vast: Math.floor(Math.random() * 150),
      interface: Math.floor(Math.random() * 120),
    }));
    return Promise.resolve(data);
  }
}

class CustomDaysState {
  constructor(days) {
    this.days = days;
  }

  getData() {
    const today = new Date();
    const currentYear = today.getFullYear();
    const currentMonth = today.getMonth();

    const data = Array.from({ length: this.days }, (_, i) => {
      const date = new Date(
        currentYear,
        currentMonth,
        today.getDate() - (this.days - 1) + i
      );
      let formattedDate;

      if (this.days < 30) {
        const day = date.getDate().toString().padStart(2, "0");
        const month = (date.getMonth() + 1).toString().padStart(2, "0");
        formattedDate = `${day}-${month}`;
      } else {
        const month = date.getMonth() + 1;
        const year = date.getFullYear().toString().slice(-2);
        const months = [
          "Jan",
          "Feb",
          "Mar",
          "Apr",
          "May",
          "Jun",
          "Jul",
          "Aug",
          "Sep",
          "Oct",
          "Nov",
          "Dec",
        ];
        formattedDate = `${months[month - 1]}-${year}`;
      }

      return {
        date: formattedDate,
        vast: Math.floor(Math.random() * 120),
        interface: Math.floor(Math.random() * 90),
      };
    });

    return Promise.resolve(data);
  }
}


export { ThirtyDaysState, TwelveMonthsState, CustomDaysState };
