import Card from './components/Card/Card.jsx';
import './App.css';


const data = [
  {
    title: 'Product 1',
    description: 'This is the description for Product 1.',
    img: 'https://dummyimage.com/500x300/000/fsadas',
  },
  {
    title: 'Product 2',
    description: 'This is the description for Product 2.',
    img: 'https://dummyimage.com/500x300/000/BE1A1A',
  },
  {
    title: 'Product 3',
    description: 'This is the description for Product 3.',
    img: 'https://dummyimage.com/500x300/000/293681',
  },
  {
    title: 'Product 4',
    description: 'This is the description for Product 4.',
    img: 'https://dummyimage.com/500x300/000/fff',
  },
  {
    title: 'Product 5',
    description: 'This is the description for Product 5.',
    img: 'https://dummyimage.com/500x300/000/fff',
  },
  {
    title: 'Product 6',
    description: 'This is the description for Product 6.',
    img: 'https://dummyimage.com/500x300/000/fff',
  }
];  

function App() {
  

  return (
     <>
      <h1>E-commerce</h1>
      <div id="product-container">
        {data.map((product, index) => (
          <Card key={index} title={product.title} description={product.description} img={product.img} />
        ))}
      </div>
     </>
  )
}

export default App
