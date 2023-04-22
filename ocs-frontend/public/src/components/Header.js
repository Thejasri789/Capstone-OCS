import React from 'react'
import './Header.css'
import { Link } from 'react-router-dom'

function Header() {
  return (
    <div className='head' style={{color:"#fff",
  display:"flex",
  alignItems:"center",
  justifyContent:"space-around",
    fontFamily:"monopoly",
    fontSize:"30px",
    fontWeight:"bolder"}}>
      <div className='log'>
      FT Clinical Service
      </div>
      <Link to='/' className='link' style={{textDecoration:"none",color:"whitesmoke"}}>Home</Link>
    </div>
  )
}

export default Header
