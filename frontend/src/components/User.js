// src/App.js
import React, { useState } from 'react';
import './User.css';

function User() {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  const handleSubmit = (event) => {
    event.preventDefault();
    alert(`Username: ${username}\nPassword: ${password}`);
    // You can add your authentication logic here
  };

  return (
      <div className='container'>
        <div className='header'>
          <h1> Tracker Tracker Tracker Tracker Tracker </h1>
        </div>
        <div className='body'>
          <div className="login-container">
            <h2>Login</h2>
            <form className="login-form" onSubmit={handleSubmit}>
              <div className="form-group">
                <label htmlFor="username">Username:</label>
                <input
                  type="text"
                  id="username"
                  name="username"
                  value={username}
                  onChange={(e) => setUsername(e.target.value)}
                  required
                />
              </div>
              <div className="form-group">
                <label htmlFor="password">Password:</label>
                <input
                  type="password"
                  id="password"
                  name="password"
                  value={password}
                  onChange={(e) => setPassword(e.target.value)}
                  required
                />
              </div>
              <div className="form-group">
                <button type="submit">Login</button>
              </div>
            </form>
          </div>
        </div>
      </div>
  );
}

export default User;