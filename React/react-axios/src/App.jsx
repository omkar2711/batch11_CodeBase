import { Routes, Route } from 'react-router-dom'
import {Link} from 'react-router-dom'
import LandingPage from './pages/LandingPage'
import ExcersicePage from './pages/ExcersicePage'
import BodyParts from './pages/BodyParts'



function App() {

  return (
    <Routes>
      <Route path="/" element={<LandingPage />} />
      <Route path="/body-parts" element={<BodyParts />} />
      <Route path="/exercises" element={<ExcersicePage />} />
    </Routes>
  )
}

export default App
