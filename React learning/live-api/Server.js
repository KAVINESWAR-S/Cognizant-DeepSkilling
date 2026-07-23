const express = require('express');
const cors = require('cors');

const app = express();
const PORT = 5000;

app.use(cors());
app.use(express.json());

let developers = [
  {
    id: 1,
    name: 'Alice',
    role: 'Frontend Developer',
    bio: 'Loves React and UI design.'
  },
  {
    id: 2,
    name: 'Bob',
    role: 'Backend Developer',
    bio: 'Works with Node.js and databases.'
  }
];

app.get('/', (req, res) => {
  res.json({ message: 'API is running' });
});

app.get('/developers', (req, res) => {
  res.json(developers);
});

app.get('/developers/:id', (req, res) => {
  const id = Number(req.params.id);
  const developer = developers.find((d) => d.id === id);

  if (!developer) {
    return res.status(404).json({ message: 'Developer not found' });
  }

  res.json(developer);
});

app.post('/developers', (req, res) => {
  const { name, role, bio } = req.body;

  if (!name || !role || !bio) {
    return res.status(400).json({ message: 'name, role, and bio are required' });
  }

  const newDeveloper = {
    id: Date.now(),
    name,
    role,
    bio
  };

  developers.push(newDeveloper);
  res.status(201).json(newDeveloper);
});

app.put('/developers/:id', (req, res) => {
  const id = Number(req.params.id);
  const developer = developers.find((d) => d.id === id);

  if (!developer) {
    return res.status(404).json({ message: 'Developer not found' });
  }

  const updatedDeveloper = {
    ...developer,
    ...req.body,
    id: developer.id
  };

  developers = developers.map((d) => (d.id === id ? updatedDeveloper : d));
  res.json(updatedDeveloper);
});

app.listen(PORT, () => {
  console.log(`API running on http://localhost:${PORT}`);
});