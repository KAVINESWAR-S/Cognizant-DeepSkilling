import React, {useContext } from "react";
import AuthContext from "../context/AuthContext";
import { useNavigate } from "react-router-dom";

function Login() {
  const { isLoggedIn, setIsLoggedIn } = useContext(AuthContext);
   const navigate = useNavigate();

  const handleLogin = () => {
  setIsLoggedIn(true);
  navigate("/home");

};

  return (
    <div>
      <h2>"Logged In</h2>

      <button onClick={handleLogin}>
        Login
      </button>
    </div>
  );
}

export default Login;