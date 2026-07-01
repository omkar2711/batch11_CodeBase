import React , {useState} from 'react'
import { getExercises } from '../api/api.js'

const ExcersicePage = () => {

    const [Excercises, setExercises] = useState([]);

    const handleGetExercises = async () => {
        try {
            const data = await getExercises();
            setExercises(data);
        }
        catch (error) {
            console.error('Error fetching exercises:', error);
        }
    }


  return (
    <div>
      <button onClick={handleGetExercises} className="bg-green-500 text-white px-4 py-2 rounded">Get Exercises</button>

      {Excercises.length === 0 ? <h2>No exercises found</h2> :
      
        <ul>
            {Excercises.map((exercise, index) => (
                <li key={index}>
                    <div className="border p-4 rounded shadow-md mb-4">
                        <h3> Excercise : {exercise.name}</h3>
                        <p> Body Part : {exercise.bodyPart}</p>
                        <p> Target : {exercise.target}</p>
                        <p> Equipment : {exercise.equipment}</p>
                        <p>Secondary Muscles : {exercise.secondaryMuscles.join(', ')}</p>
                        <div className="flex flex-col items-center">
                            <p> Instructions : {exercise.instructions.join(', ')}</p>
                        </div>
                    </div>
                   
                </li>
            ))}
        </ul>
      }
    </div>
  )
}

export default ExcersicePage
