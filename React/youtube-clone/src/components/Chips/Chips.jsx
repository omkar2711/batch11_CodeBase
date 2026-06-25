import { useState } from 'react'
import './Chips.css'
import { ChevronRightIcon } from '../Icons/Icons.jsx'

const categories = [
  'All', 'Gaming', 'Disha Vakani', 'Podcasts', 'Thrillers', 'AI',
  'Union Public Service Commission', 'Esports', 'FIFA World Cup',
  'Finals', 'Masala films', 'Valorant', 'Live', 'Comedy', 'Music',
]

const Chips = () => {
  const [active, setActive] = useState('All')

  return (
    <div id='chips'>
      <div className='chips-track'>
        {categories.map((category) => (
          <button
            key={category}
            className={`chip${active === category ? ' active' : ''}`}
            onClick={() => setActive(category)}
          >
            {category}
          </button>
        ))}
      </div>
      <button className='scroll-btn' aria-label='scroll categories'>
        <ChevronRightIcon />
      </button>
    </div>
  )
}

export default Chips
