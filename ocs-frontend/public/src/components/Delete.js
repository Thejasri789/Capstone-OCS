import { setSelectionRange } from '@testing-library/user-event/dist/utils';
import axios from 'axios';
import './Delete.css'
import Header from './Header';
import React, { useState } from 'react'
import Footer from './Footer';

function Delete() {
    const [doctorID,setDoctorID]=useState(0);
    const handleSubmit=(e)=>{
        e.preventDefault();
              axios.delete(`http://localhost:8071/admin/deletedoctor/`+doctorID).then(res=>alert("Data is Deleted"))
        console.log('Doctor Deleted successfully...'+doctorID)
    }
  return (
    <>
      <Header />
      <div
        className="del"
        style={{
          fontFamily: "cursive",
          display: "flex",
          flexDirection: "column",
          justifyContent: "center",
          alignItems: "center",
        }}
      >
        <h1 style={{ marginBottom: "35px" }}> Delete Doctor</h1>
        <div className='delform'> 
          <form onSubmit={handleSubmit}>
            Enter Doctor ID :
            <div>
              {" "}
              <input
                style={{
                  paddingTop: "5px",
                  paddingBottom: "5px",
                  borderRadius: "5px",
                }}
                type="text"
                value={doctorID}
                onChange={(e) => {
                  setDoctorID(e.target.value);
                }}
              />
            </div>
            <br />
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
              Delete Doctor
            </button>
          </form>
        </div>
      </div>
      <Footer />
    </>
  );
}

export default Delete;