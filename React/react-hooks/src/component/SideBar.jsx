import React from 'react'

const SideBar = ({count, setCount}) => {
  return (
    <div>
      <h1>SideBar</h1>
        <p>Count from App: {count}</p>
        <button onClick={() => setCount(count + 1)}>Increment from SideBar</button>
    </div>
  )
}

export default SideBar
