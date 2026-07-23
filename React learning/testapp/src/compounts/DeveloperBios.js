const DeveloperBios = (props) => {
  return (
   <ul>
      {props.developers.map((dev, index) => (
        <li key={dev.id || index}>
          <h3>{dev.name}</h3>
          <p>{dev.role}</p>
          <p>{dev.bio}</p>
        </li>
      ))}
    </ul>
  );
};

export default DeveloperBios;