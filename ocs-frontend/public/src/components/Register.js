import React, { useState } from 'react'
import axios from 'axios'
import Header from './Header'
import Footer from './Footer'
import './Register.css'
function Register() {
    const[userID,setUserID]=useState('')
    const[password,setPassword]=useState('')
    const[userType,setUserType]=useState('')
    const handleSubmit=(e)=>{
        e.preventDefault();
        let obj={"userID":userID,"password":password,"loginStatus":0,"userType":userType}
      console.log(obj)
         axios.post('http://localhost:8056/admin/registerUser',obj).then(rej=>(alert("User is added")))
           
           }
  return (
    <>
      <Header />
      <div className="regbg">
        <h1 style={{display:"flex", justifyContent:"center"}}>Register page</h1>
        <div
          className="reg"
          style={{
            fontFamily: "cursive",
            display: "flex",
            justifyContent: "center",
          }}
        >
          <form onSubmit={handleSubmit}>
            UserID :{" "}
            <div>
              <input
                style={{
                  paddingTop: "5px",
                  paddingBottom: "5px",
                  borderRadius: "5px",
                }}
                type="text"
                value={userID}
                onChange={(e) => {
                  setUserID(e.target.value);
                }}
              />
            </div>
            Password :
            <div>
              {" "}
              <input
                style={{
                  paddingTop: "5px",
                  paddingBottom: "5px",
                  borderRadius: "5px",
                }}
                type="text"
                value={password}
                onChange={(e) => {
                  setPassword(e.target.value);
                }}
              />
            </div>
            UserType :
            <div>
              {" "}
              <input
                style={{
                  paddingTop: "5px",
                  paddingBottom: "5px",
                  borderRadius: "5px",
                }}
                type="text"
                value={userType}
                onChange={(e) => {
                  setUserType(e.target.value);
                }}
              />
            </div>
            <button
              style={{
                paddingTop: "10px",
                paddingBottom: "10px",
                borderRadius: "5px",
                paddingLeft: "20px",
                paddingRight: "20px",
                fontFamily: "sans-serif",
                color: "white",
                backgroundColor: "green",
              }}
            >
              Register
            </button>
          </form>
        </div>
      </div>
      <Footer />
    </>
  );
}

export default Register
