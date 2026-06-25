import React from 'react'
import './ImageComp.css'

const ImageComp = ({ img }) => {
  return (
    <div>
        <img src={img} alt="Placeholder" />
        <img src={img} alt="Placeholder" />
    </div>
     
  )
}

export default ImageComp
