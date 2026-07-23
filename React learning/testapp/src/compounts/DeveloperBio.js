import React, { useContext, useEffect } from "react";
import PropTypes from "prop-types";
import { connect } from "react-redux";

import AuthContext from "../context/AuthContext";
import DeveloperBio from "./DeveloperBio";
import * as devActions from "../actions/devActions";

function DisplayBios(props) {
  const { isAdmin } = useContext(AuthContext);

  useEffect(() => {
    props.addDevsToStore();
  },[]);

  return (
    <div>
      {props.developers.map((dev) => (
        <DeveloperBio
          key={dev.id}
          developer={dev}
          isAdmin={isAdmin}
        />
      ))}
    </div>
  );
}

DisplayBios.propTypes = {
  developers: PropTypes.array,
  addDevsToStore: PropTypes.func,
};

const mapStateToProps = ({ developers, myOtherStuff }) => ({
  developers: developers,
  message: myOtherStuff,
});

const mapDispatchToProps = {
  addDevsToStore: devActions.getAllBiosRequestActionCreator,
};

export default connect(
  mapStateToProps,
  mapDispatchToProps
)(DisplayBios);