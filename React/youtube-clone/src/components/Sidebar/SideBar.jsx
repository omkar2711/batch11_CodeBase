import { useState } from 'react'
import './SideBar.css'
import {
  HomeIcon, ShortsIcon, ChevronDownIcon, VideoIcon, HistoryIcon,
  PlaylistIcon, ClockIcon, ThumbUpIcon, DownloadIcon,
} from '../Icons/Icons.jsx'

const subscriptions = [
  { name: 'CodeCraft Daily', color: '#ef4444', live: true },
  { name: 'Design Mode', color: '#8b5cf6' },
  { name: 'Frontend Focus', color: '#0ea5e9' },
  { name: 'Dev Stack', color: '#22c55e' },
  { name: 'Build Better', color: '#f59e0b' },
  { name: 'Layout Lab', color: '#ec4899' },
  { name: 'Component Club', color: '#14b8a6' },
]

const youItems = [
  { label: 'Your channel', Icon: VideoIcon },
  { label: 'History', Icon: HistoryIcon },
  { label: 'Playlists', Icon: PlaylistIcon },
  { label: 'Watch later', Icon: ClockIcon },
  { label: 'Liked videos', Icon: ThumbUpIcon },
  { label: 'Downloads', Icon: DownloadIcon },
]

const SideBar = () => {
  const [showAll, setShowAll] = useState(false)
  const visibleSubs = showAll ? subscriptions : subscriptions.slice(0, 5)

  return (
    <div id='sidebar'>
      <div className='section'>
        <ul>
          <li className='active'><HomeIcon className='item-icon' /><span>Home</span></li>
          <li><ShortsIcon className='item-icon' /><span>Shorts</span></li>
        </ul>
      </div>

      <hr />

      <div className='section'>
        <ul>
          {visibleSubs.map((sub) => (
            <li key={sub.name}>
              <span className='sub-avatar' style={{ background: sub.color }}>{sub.name.charAt(0)}</span>
              <span>{sub.name}</span>
              {sub.live && <span className='live-dot' aria-label='live' />}
            </li>
          ))}
          <li className='show-more' onClick={() => setShowAll((v) => !v)}>
            <span className='item-icon chevron-wrap'><ChevronDownIcon className={showAll ? 'flip' : ''} /></span>
            <span>{showAll ? 'Show less' : 'Show more'}</span>
          </li>
        </ul>
      </div>

      <hr />

      <div className='section'>
        <p className='section-title'>You</p>
        <ul>
          {youItems.map(({ label, Icon }) => (
            <li key={label}><Icon className='item-icon' /><span>{label}</span></li>
          ))}
        </ul>
      </div>
    </div>
  )
}

export default SideBar
