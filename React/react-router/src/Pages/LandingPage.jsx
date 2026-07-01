import React from 'react'
import { Link } from 'react-router-dom'

const LandingPage = () => {

    const id = '12345';
  return (
    <div>
      <h1>LandingPage</h1>
      <nav className="flex gap-4">
        <Link to="/login">Login</Link>
        <Link to="/register">Register</Link>
        <Link to="/dashboard">Dashboard</Link>
        <Link to={`/product/${id}`}>Product</Link>
      </nav>
    </div>
  )
}

export default LandingPage
