import { Routes, Route } from 'react-router-dom'
import LandingPage from './Pages/LandingPage'
import LoginPage from './Pages/LoginPage'
import RegisterPage from './Pages/RegisterPage'
import Dashboard from './Pages/Dashboard'
import Profile from './Pages/Profile'
import Settings from './Pages/Settings'
import ProductPage from './Pages/ProductPage'

function App() {

  return (
    <Routes>
      <Route path="/" element={<LandingPage />} />
      <Route path="/login" element={<LoginPage />} />
      <Route path="/register" element={<RegisterPage />} />
    {/* Nested Routes */}
      <Route path="dashboard" element={<Dashboard />}>
        <Route path="profile" element={<Profile />} />
        <Route path="settings" element={<Settings />} />
      </Route>

      {/* Dynamic Route */}
      <Route path="/product/:productId" element={<ProductPage />} />
      <Route path="*" element={<h1>404 Page Not Found</h1>} />
    </Routes>
  )
}

export default App
