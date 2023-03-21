import { Button } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';
import Header from './components/Header';
import Footer from './components/Footer';
import Favorites from './components/Favorites';
import "./App.css";
import { useState,useEffect } from 'react';
import axios from 'axios';
import Home from './components/Home';
import {Route,Routes,BrowserRouter as Router} from 'react-router-dom';
import Description from './components/Description';

function App() { 

  const[tyrs, setTyrs] = useState([])

  useEffect(() => {

    async function axiosData(){
      const tyrsData = await axios.get('https://640af10081d8a32198d4b2ab.mockapi.io/tyrs')

      setTyrs(tyrsData.data)
    }
    axiosData();
},[])

  return (
    <div>
      <Router>
        <Header/>
        <Routes>
          <Route path='/favorites' element={
            <Favorites />
          }/>
          <Route path='/' element={
            <Home
            item={tyrs}/>
          }/>
          <Route path='/description' element={
            <Description/>
          }/>
        </Routes>
      </Router>
      <Footer/>
    </div>
  );
}

export default App;
