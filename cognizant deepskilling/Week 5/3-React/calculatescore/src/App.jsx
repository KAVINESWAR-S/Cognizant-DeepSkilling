import './App.css'
import React from 'react'
import Score from './components/Score'

function App() {
  return (
    <>
      <Score name="John Doe" school="ABC High School" score={85} goal={100} />
    </>
  )
}

export default App
