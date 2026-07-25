import React from "react";
import officeImage from "./office.jpg";

function App() {

  const element = "Office Space";

  const offices = [
    {
      id: 1,
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai"
    },
    {
      id: 2,
      Name: "Regus",
      Rent: 65000,
      Address: "Coimbatore"
    },
    {
      id: 3,
      Name: "WeWork",
      Rent: 55000,
      Address: "Bangalore"
    }
  ];

  const textRed = {
    color: "red"
  };

  const textGreen = {
    color: "green"
  };

  return (
    <div>

      <h1>
        {element}, at Affordable Range
      </h1>

      {offices.map((office) => (

        <div key={office.id}>

          <img
            src={officeImage}
            width="250"
            height="250"
            alt="Office Space"
          />

          <h1>
            Name: {office.Name}
          </h1>

          <h3
            style={
              office.Rent <= 60000
                ? textRed
                : textGreen
            }
          >
            Rent: Rs. {office.Rent}
          </h3>

          <h3>
            Address: {office.Address}
          </h3>

          <hr />

        </div>

      ))}

    </div>
  );
}

export default App;