import { Button } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';
import Header from './components/Header';
import Slider from './components/Slider';
import CardItem from './components/cart/CartItem';
import Footer from './components/Footer';
import "./App.css";
import { useState,useEffect } from 'react';
import axios from 'axios';

function App() { 

  const[tyrs, setTyrs] = useState([])

  useEffect(() => {

    async function axiosData(){
      const tyrsData = await axios.get('https://640af10081d8a32198d4b2ab.mockapi.io/tyrs')

      setTyrs(tyrsData.data)
    }
},[])

  return (
    <div>
      <Header></Header>
      <Slider></Slider>
      <CardItem item={tyrs}/>
      <Footer/>
    </div>
   
  );
}

export default App;
