import React, { useContext } from "react";
import { Link, useNavigate } from "react-router-dom";
import AuthContext from "../context/AuthContext";

function AddNavBar() {
  const { isLoggedIn, setIsLoggedIn } = useContext(AuthContext);

  const navigate = useNavigate();

  const handleLogout = () => {
    setIsLoggedIn(false);
    navigate("/");
  };

  return (
    <nav>
      <Link to="/">Home</Link>{" | "}

      <Link to="/developers">Developers</Link>{" | "}

      {!isLoggedIn ? (
        <Link to="/login">Login</Link>
      ) : (
        <>
          <Link to="/add-developer">Add Developer</Link>{" | "}
          <button onClick={handleLogout}>
            Logout
          </button>
        </>
      )}
    </nav>
  );
}

export default AddNavBar;