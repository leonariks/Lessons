import { Button } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';
import Header from './components/Header';
import Slider from './components/Slider';
import CardItem from './components/CardItem';
import Footer from './components/Footer';
import "./App.css";


function App() { 
  return (
    <div>
      <Header></Header>
      <Slider></Slider>
      <CardItem/>
      <Footer/>
    </div>
   
  );
}

export default App;
