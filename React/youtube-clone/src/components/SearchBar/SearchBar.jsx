import './SearchBar.css'
import { MenuIcon, SearchIcon, MicIcon, VideoIcon, BellIcon } from '../Icons/Icons.jsx'

const SearchBar = () => {
  return (
    <header id='search-bar' role="banner">
      <div className='left'>
        <button className='icon-btn menu' aria-label='menu'><MenuIcon /></button>
        <a className='brand' href="/">
          <svg className='play-logo' viewBox="0 0 28 20" width="28" height="20">
            <path d="M27.4 3.1A3.5 3.5 0 0 0 24.9.6C22.7 0 14 0 14 0S5.3 0 3.1.6A3.5 3.5 0 0 0 .6 3.1 36 36 0 0 0 0 10a36 36 0 0 0 .6 6.9 3.5 3.5 0 0 0 2.5 2.5C5.3 20 14 20 14 20s8.7 0 10.9-.6a3.5 3.5 0 0 0 2.5-2.5A36 36 0 0 0 28 10a36 36 0 0 0-.6-6.9z" fill="#ff0000" />
            <path d="M11.2 14.3 18.5 10l-7.3-4.3z" fill="#fff" />
          </svg>
          <span className='wordmark'>YouTube<sup>IN</sup></span>
        </a>
      </div>

      <div className='center'>
        <div id='search'>
          <input id='search-input' type="text" placeholder='Search' defaultValue='upgrad learning' />
          <button id='search-button' aria-label='search'>
            <SearchIcon />
          </button>
        </div>
        <button className='icon-btn mic' aria-label='search with voice'><MicIcon /></button>
      </div>

      <div className='right'>
        <button className='create-btn'>
          <VideoIcon width="20" height="20" />
          <span>Create</span>
        </button>
        <button className='icon-btn' aria-label='notifications'>
          <BellIcon />
          <span className='badge'>9+</span>
        </button>
        <div className='avatar'>U</div>
      </div>
    </header>
  )
}

export default SearchBar
