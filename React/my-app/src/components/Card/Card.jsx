import React from 'react'
import ImageComp from '../ImageComp/ImageComp.jsx'
import './Card.css'

const Card = ({ title, description, img }) => {
  return (
    <div id="card">
      <ImageComp img={img} />
      <h1 id="card-title">{title}</h1>
      <p id="card-description">{description}</p>
    </div>
  )
}

export default Card
