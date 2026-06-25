import './Card.css'
import { VerifiedIcon } from '../Icons/Icons.jsx'

const Card = ({ item }) => {
  const avatarLetter = item.channel ? item.channel.charAt(0).toUpperCase() : 'U'
  return (
    <article className='card' aria-label={item.title}>
      <div className='thumb-wrap'>
        <img src={item.tumbnail} alt="Thumbnail" className='thumb' />
        {item.badge && <span className='top-badge'>{item.badge}</span>}
        <span className='duration'>{item.duration}</span>
      </div>

      <div className='meta'>
        <div className='avatar' style={{ background: item.avatarColor }}>{avatarLetter}</div>
        <div className='text'>
          <h3 className='title'>{item.title}</h3>
          <p className='channel'>
            {item.channel}
            {item.verified && <VerifiedIcon className='verified' />}
          </p>
          <p className='stats'>{item.views} • {item.time}</p>
          {item.tags && item.tags.length > 0 && (
            <div className='tags'>
              {item.tags.map((tag) => <span key={tag} className='tag'>{tag}</span>)}
            </div>
          )}
        </div>
      </div>
    </article>
  )
}

export default Card
