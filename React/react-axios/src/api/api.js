    import axios from "axios";

    const url = 'https://exercisedb.p.rapidapi.com/exercises';

    const headers = {
        'x-rapidapi-key': '964ab9bfbemshf7c3a95fc2524cep1f15dbjsnbed1d3d53735',
        'x-rapidapi-host': 'exercisedb.p.rapidapi.com',
        'Content-Type': 'application/json'
    }

    const getBodyParts = async () => {
        try {
            const response = await axios.get(`${url}/bodyPartList`, { headers });
            return response.data;
        } catch (error) {
            console.error('Error fetching body parts:', error);
            throw error;
        }
    }

    const getExercises = async () => {
        try {
            const response = await axios.get(`${url}`, { headers }, {
                sortMethod: 'bodyPart',
                offset: '0',
                limit: '10',
                sortOrder: 'ascending'
            });
            return response.data;
        } catch (error) {
            console.error('Error fetching exercises:', error);
            throw error;
        }
    }

    export { getBodyParts, getExercises };