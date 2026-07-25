import React, { Component } from "react";

import LoginButton from "./LoginButton";
import LogoutButton from "./LogoutButton";
import Greeting from "./Greeting";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

class App extends Component {

  constructor(props) {
    super(props);

    this.state = {
      isLoggedIn: false
    };

    this.handleLoginClick =
      this.handleLoginClick.bind(this);

    this.handleLogoutClick =
      this.handleLogoutClick.bind(this);
  }

  handleLoginClick() {
    this.setState({
      isLoggedIn: true
    });
  }

  handleLogoutClick() {
    this.setState({
      isLoggedIn: false
    });
  }

  render() {

    const isLoggedIn = this.state.isLoggedIn;

    let button;
    let page;

    if (isLoggedIn) {
      button = (
        <LogoutButton
          onClick={this.handleLogoutClick}
        />
      );

      page = <UserPage />;
    } else {
      button = (
        <LoginButton
          onClick={this.handleLoginClick}
        />
      );

      page = <GuestPage />;
    }

    return (
      <div>
        <Greeting isLoggedIn={isLoggedIn} />

        {button}

        {page}
      </div>
    );
  }
}

export default App;