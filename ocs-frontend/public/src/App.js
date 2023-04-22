import logo from './logo.svg';
import './App.css';
import { Routes ,Route} from 'react-router-dom';
import Home from './components/Home';
import Update from './components/Update';
import Delete from './components/Delete';
import Select from './components/Select';
import Add from './components/Add';

import Register from './components/Register';
import Header from './components/Header';
import Footer from './components/Footer';

import Reporter from './components/Reporter';
function App() {
  return (
    <div>
      
       {/* <Header/> */}
       {/* <Navbar/>    */}
     
      
<Routes>
<Route path='/' element={<Home/>}></Route>
<Route path='/register' element={<Register/>}></Route>
 

<Route path='/update' element={<Update/>}></Route>
<Route path='/delete' element={<Delete/>}></Route>
<Route path='/select' element={<Select/>}></Route>

<Route path='/add' element={<Add/>}></Route>
<Route path='/reporter' element={<Reporter/>}></Route>

</Routes>
{/* <Footer/> */}
    </div>
  );
}

export default App;
