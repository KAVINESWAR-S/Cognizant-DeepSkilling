import React from "react";

function UserPage() {

  const bookTicket = () => {
    alert("Ticket booked successfully!");
  };

  return (
    <div>
      <h2>Flight Details</h2>

      <p>Airline: Air India</p>
      <p>From: Chennai</p>
      <p>To: Delhi</p>
      <p>Departure: 10:00 AM</p>

      <button onClick={bookTicket}>
        Book Ticket
      </button>
    </div>
  );
}

export default UserPage;