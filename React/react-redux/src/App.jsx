import React, {useState} from 'react'
import Comp1 from './components/Comp1'
import Comp2 from './components/Comp2'
import { useSelector, useDispatch } from 'react-redux'
import { increment, decrement, incrementByAmount } from './features/Counter/CounterSlice'

const App = () => {

  const dispatch = useDispatch()
  const count = useSelector((state) => state.counter.value)
  
  return (
    <div className="flex flex-col items-center justify-center gap-4 p-4">
      <h1>My App</h1>
      <h1>Count : {count}</h1>

      <button onClick={() => dispatch(increment())} className="bg-blue-500 text-white px-4 py-2 rounded">Increment</button>
      <button onClick={() => dispatch(decrement())} className="bg-red-500 text-white px-4 py-2 rounded">Decrement</button>
      <button onClick={() => dispatch(incrementByAmount(10))} className="bg-green-500 text-white px-4 py-2 rounded">Increment By 5</button>

      <Comp1 />
      <Comp2 />
      

     
    </div>
  )
}

export default App
