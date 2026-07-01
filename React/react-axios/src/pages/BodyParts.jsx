import React , {useState} from 'react'
import { getBodyParts } from '../api/api.js'

const BodyParts = () => {

    const [bodyParts, setBodyParts ] = useState([]);

    const handleGetBodyParts = async() => {
        try{
            const data = await getBodyParts();
            setBodyParts(data);
        }
        catch(error){
            console.error('Error fetching body parts:', error);
        }
    }

  return (
    <div>
      <button className="bg-blue-500 text-white px-4 py-2 rounded" onClick={handleGetBodyParts}> Get Body Parts </button>

      {bodyParts.length === 0 ? <h2>No body parts found</h2> : 

        <ul>
            {bodyParts.map((part, index) => (
                <li key={index}>
                    {part}
                </li>
            ))}
        </ul>
        
      }
    </div>
  )
}

export default BodyParts
