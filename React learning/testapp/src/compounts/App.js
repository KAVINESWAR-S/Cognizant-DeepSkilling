import React, { useState, useEffect, useContext } from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";

import AddDeveloper from "./AddDeveloper";
import AddNavBar from "./addNavBar";
import Home from "./Home";
import DisplayBios from "./DeveloperBio";

import AuthContext from "../context/AuthContext";

function App() {
  const { isLoggedIn } = useContext(AuthContext);

  const [developers, setDevelopers] = useState([]);

  useEffect(() => {
    fetch("http://localhost:5000/developers")
      .then((response) => response.json())
      .then((data) => setDevelopers(data))
      .catch((error) => console.error(error));
  }, []);

  return (
    <Router>
      <AddNavBar />

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/developers" element={<AddDeveloper />} />
        <Route path="/display-developers" element={<DisplayBios />} />
      </Routes>
    </Router>
  );
}

export default App;