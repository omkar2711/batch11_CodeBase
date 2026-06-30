import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import NavBar from './component/NavBar'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div>
        <a href="https://upgrad.com">upgrad.com</a>
        <a href="https://example.com">Example</a>
      </div>
    </>
  )
}

export default App
