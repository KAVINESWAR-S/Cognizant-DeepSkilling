import React, { Component } from "react";

class EventExamples extends Component {

  constructor(props) {
    super(props);

    this.state = {
      counter: 0
    };

    this.increment = this.increment.bind(this);
    this.decrement = this.decrement.bind(this);
    this.sayHello = this.sayHello.bind(this);
  }

  // Increment counter
  increment() {
    this.setState({
      counter: this.state.counter + 1
    });

    // Calling another method
    this.sayHello();
  }

  // Static message
  sayHello() {
    alert("Hello Member1");
  }

  // Decrement counter
  decrement() {
    this.setState({
      counter: this.state.counter - 1
    });
  }

  // Function taking argument
  sayWelcome(message) {
    alert(message);
  }

  // Synthetic event
  onPress(event) {
    alert("I was clicked");
    console.log(event);
  }

  render() {
    return (
      <div>

        <h3>{this.state.counter}</h3>

        <button onClick={this.increment}>
          Increment
        </button>

        <br />

        <button onClick={this.decrement}>
          Decrement
        </button>

        <br />

        <button onClick={() => this.sayWelcome("Welcome")}>
          Say welcome
        </button>

        <br />

        <button onClick={(event) => this.onPress(event)}>
          Click on me
        </button>

      </div>
    );
  }
}

export default EventExamples;