import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { increment, decrement } from '../features/Counter/CounterSlice'


const Comp1 = () => {

  const dispatch = useDispatch()
  const count = useSelector((state) => state.counter.value)
  return (
    <div className="border border-black p-4 rounded h-[200px] w-full" >
      <h3>Component 1</h3>
      <h1>Count : {count}</h1>
      <button onClick={() => dispatch(increment())} className="bg-blue-500 text-white px-4 py-2 rounded">Increment</button>
      <button onClick={() => dispatch(decrement())} className="bg-red-500 text-white px-4 py-2 rounded">Decrement</button>
    </div>
  )
}

export default Comp1
