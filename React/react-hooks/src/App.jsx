import { useState, useEffect } from 'react' 
import './App.css'
import SideBar from './component/SideBar'
import NavBar from './component/NavBar'

function App() {

  const [count, setCount] = useState(0);
  const [showCounter, setShowCounter] = useState(true);

  useEffect(()=>{
    console.log('useEffect called');

  }, [count]);


  const increment = () => {
    setCount(prevCount => prevCount + 1);
    setCount(prevCount => prevCount + 1);
    setCount(prevCount => prevCount + 1);

  }

  const decrement = () => {
    setCount(count - 1);
  }

  const reset = () => {
    setCount(0);
  }

  return (
    <>
      <div className="App">
        <h1>Counter App</h1>
        <p>Count: {count}</p>

        <SideBar count={count} setCount={setCount} />
        <NavBar count={count} />
        <button onClick={increment}>Increment</button>
        <button onClick={decrement}>Decrement</button>
        <button onClick={reset}>Reset</button>

        {showCounter === true ? <h1>Counter is Visible</h1> : <h1>Counter is Hidden</h1>}
       
        <button onClick={() => setShowCounter(!showCounter)}>
          {showCounter ? 'Hide' : 'Show'} Counter
        </button>
      </div>
    </>
  )
}

export default App
