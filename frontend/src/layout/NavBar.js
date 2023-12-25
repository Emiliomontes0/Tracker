import React from "react";
import { Link } from "react-router-dom";
import './NavBarStyle.css';

export default function Navbar() {
  return (
    <div className="containter-nav">
      <nav className="navbar navbar-expand-lg navbar-dark bg-primary">
        <div className="container-fluid">
          <a className="navbar-brand" href="#"> FullStackApplication</a> 
          <button
            className="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent"
            aria-expanded="false"
            aria-label="Toggle navigation">
            <span className="navbar-toggler-icon"></span>
          </button>

          <button className="btn btn-outline-light">Add product</button>
        </div>
      </nav>
    </div>
  );
}