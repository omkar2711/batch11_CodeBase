import React from 'react'
import { Link } from 'react-router-dom'

const LandingPage = () => {
  return (
    <div>
      <nav className="flex gap-4">
        <Link to="/">Home</Link>
        <Link to="/body-parts">Body Parts</Link>
        <Link to="/exercises">Exercises</Link>
      </nav>
    </div>
  )
}

export default LandingPage
