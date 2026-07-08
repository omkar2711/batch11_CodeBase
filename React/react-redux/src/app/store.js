import { configureStore } from '@reduxjs/toolkit'
import counterReducer from '../features/Counter/CounterSlice'
// import { CartReducer } from '../features/Cart/CartSlice'

export const store = configureStore({
  reducer: {
    counter: counterReducer
    // cart: CartReducer
  }
})