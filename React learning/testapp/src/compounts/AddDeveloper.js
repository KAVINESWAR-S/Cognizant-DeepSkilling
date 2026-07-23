import React, {useEffect,useState} from 'react';
import Developer from './Developer';
import 'bootstrap/dist/css/bootstrap.min.css';
import '../App.css';
import {useNavigate} from 'react-router-dom';

function AddDeveloper({ setDevelopers }){
  const navigate = useNavigate();
  const [name, setName] = useState('');
  const [role, setRole] = useState('');
  const [bio, setBio] = useState('');
  const[validationErrors, setValidationErrors] = useState(false);
  const[dirty, setDirty] = useState(false);
  const handleSubmit = (event) => {
    event.preventDefault();
    const newDev = {
    name: name,
    role: role,
    bio: bio
  };
    fetch("http://localhost:5000/developers",
    {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify(newDev),
    }
  )
  .then(response => response.json())
  .then(data => {
    if (setDevelopers) {
      setDevelopers(prev => [...prev, data]);
    }
    navigate('/developers');
  })
  .catch(error => console.error('Error adding developer:', error));
    //clearForm();
  }
  useEffect(() => {
    let nameValid=name?true:false;
    let roleValid=role?true:false;
    let bioValid=bio?true:false;
    let isValid=nameValid && roleValid && bioValid;
    let isdirty=nameValid || roleValid || bioValid;
    setValidationErrors(isValid);
    setDirty(isdirty);
  },[name,role,bio]);
  // const clearForm = () => {
  //   setName('');
  //   setRole('');
  //   setBio('');
  //   document.getElementById('addDeveloperForm').reset();
  // }
    return (
      <div>
        <h2>Add Developer</h2>
        <form id="addDeveloperForm" onSubmit={handleSubmit}>
            <label> 
                Name:
                <input type="text" name="name" value={name} className="form-control" onChange={(e) => setName(e.target.value)} />
            </label>
            <label> 
                Role:
                <input type="text" name="role" value={role} className="form-control" onChange={(e) => setRole(e.target.value)} />
            </label>
            <label> 
                Bio:
                <textarea name="bio" value={bio} className="form-control" onChange={(e) => setBio(e.target.value)} />
            </label>
            <button type="submit" disabled={!validationErrors}>Add Developer</button>
        </form>
        <div>
          {dirty && !validationErrors && <p className="error">Please fill in all fields before submitting.</p>}
        </div>
      </div>
    );
  }
export default AddDeveloper;