import SearchBar from './components/SearchBar/SearchBar.jsx'
import SideBar from './components/Sidebar/SideBar.jsx'
import Chips from './components/Chips/Chips.jsx'
import Card from './components/Card/Card.jsx'
import Data from './utils/data.js'
import './App.css'


function App() {

  return (
    <div id='app'>
      <SearchBar />
      <Chips />
      <div id='main'>
        <SideBar />
        <div id='cards'>
          {Data.map((item) => (
            <Card key={item.id} item={item} />
          ))}
        </div>
      </div>
    </div>
  )
}

export default App
