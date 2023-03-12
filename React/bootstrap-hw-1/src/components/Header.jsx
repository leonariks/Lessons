import React from 'react'
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';


const Header = () => {
  return (
    <div>
       <Navbar bg="dark" variant="dark">
        <Container>
        <Nav className="me-auto">
            <Navbar.Brand href="#home">Header</Navbar.Brand>
          </Nav>
        </Container>
      </Navbar>
    </div>
  )
}

export default Header