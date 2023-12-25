// src/App.js
import React, { useState } from 'react';
import './AppbarStyle.css';

function Appbar() {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  const handleSubmit = (event) => {
    event.preventDefault();
    alert(`Username: ${username}\nPassword: ${password}`);
    // You can add your authentication logic here
  };

  return (
    <div className='body-container'>
        <div className='header'>
            <h2> hello </h2>
        </div> 
        
    </div>
  );
}

export default Appbar;
