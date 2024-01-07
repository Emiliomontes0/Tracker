import './App.css';
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import Navbar from './layout/NavBar';
import Home from './pages/Home';
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";

function App() {
  return (
    <Router>
      <div className="App">
        <Navbar/>
        <Routes>
          <Route exact path="/" element={<Home />} />
        </Routes>
     </div>
    </Router>
  );
}

export default App;
