import React, { Component } from "react";

class CurrencyConvertor extends Component {

  constructor(props) {
    super(props);

    this.state = {
      amount: ""
    };

    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
    this.setState({
      amount: event.target.value
    });
  }

  handleSubmit(event) {
    event.preventDefault();

    const rupees = Number(this.state.amount);

    // Example conversion rate
    const euro = rupees / 90;

    alert(
      "Converting to Euro: €" + euro.toFixed(2)
    );
  }

  render() {
    return (
      <div>

        <h1 style={{ color: "green" }}>
          Currency Convertor!!!
        </h1>

        <form onSubmit={this.handleSubmit}>

          <label>Amount: </label>

          <input
            type="number"
            value={this.state.amount}
            onChange={this.handleChange}
          />

          <br /><br />

          <label>Currency: </label>

          <textarea value="Euro" readOnly />

          <br /><br />

          <button type="submit">
            Submit
          </button>

        </form>

      </div>
    );
  }
}

export default CurrencyConvertor;