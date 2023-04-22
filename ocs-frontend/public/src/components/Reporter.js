import React, { useState } from 'react';
 import './Reporter.css'; 
import axios from 'axios';
import Header from './Header';
import Footer from './Footer';

function Reporter() {
  const [leaveID, setLeaveID] = useState('');
  const [reporterID, setReporterID] = useState('');
  const [reporterName, setReporterName] = useState('');
  const [leaveFrom, setLeaveFrom] = useState('');
  const [leaveTo, setLeaveTo] = useState('');
  const [reason, setReason] = useState('');
  const [status, setStatus] = useState('');

  const handleSubmit=(e)=>{
    e.preventDefault();
   console.log( leaveID+"" +reporterID+" "+reporterName+" "+leaveFrom+""+leaveTo+""+reason+""+status);
   const obj={leaveID:leaveID,reporterName:reporterName,leaveFrom:leaveFrom,leaveTo:leaveTo,reason:reason,status:status}
  console.log(obj)
   axios.post('http://localhost:8071/reporter/addReporter',obj).then(
       alert('Reporter added successfully')
   ).catch((e)=>console.log(e))
} 

  return (
    <>
      <Header />
      <div className="reporter-page">
        <h1
          className="hea"
          style={{
            paddingLeft: "40%",
            fontFamily: "inherit",
            color: "whitesmoke",
          }}
        >
          Report Doctor
        </h1>
        <br></br>
        <div>
          <form className="repform" onSubmit={handleSubmit}>
            <div
              className="formd"
              style={{ paddingLeft: "40%", fontFamily: "cursive" }}
            >
              <label htmlFor="leaveID">Leave ID: </label>{" "}
              <div>
                <input
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  type="text"
                  id="leaveID"
                  value={leaveID}
                  onChange={(event) => setLeaveID(event.target.value)}
                />
              </div>
              <label htmlFor="reporterID">Reporter ID: </label>{" "}
              <div>
                <input
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  type="text"
                  id="reporterID"
                  value={reporterID}
                  onChange={(event) => setReporterID(event.target.value)}
                />
              </div>
              <label htmlFor="reporterName">Reporter Name: </label>{" "}
              <div>
                <input
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  type="text"
                  id="reporterName"
                  value={reporterName}
                  onChange={(event) => setReporterName(event.target.value)}
                />
              </div>
              <label htmlFor="leaveFrom">Leave From: </label>{" "}
              <div>
                <input
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  type="date"
                  id="leaveFrom"
                  value={leaveFrom}
                  onChange={(event) => setLeaveFrom(event.target.value)}
                />
              </div>
              <label htmlFor="leaveTo">Leave To: </label>{" "}
              <div>
                <input
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  type="date"
                  id="leaveTo"
                  value={leaveTo}
                  onChange={(event) => setLeaveTo(event.target.value)}
                />
              </div>
              <label htmlFor="reason">Reason: </label>{" "}
              <div>
                <textarea
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  id="reason"
                  value={reason}
                  onChange={(event) => setReason(event.target.value)}
                ></textarea>
              </div>
              <label htmlFor="status">Status: </label>{" "}
              <div>
                <input
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  type="text"
                  id="status"
                  value={status}
                  onChange={(event) => setStatus(event.target.value)}
                />
              </div>
            </div>
            <div
              className="sub" style={{display:"flex", justifyContent:"center", marginTop:"25px"}}
              
            >
              <button
                style={{
                  paddingTop: "10px",
                  paddingBottom: "10px",
                  paddingLeft: "10px",
                  paddingRight: "10px",
                  borderRadius: "10px",
                  fontFamily: "inherit",
                  color: "white",
                  backgroundColor: "green",
                }}
                type="submit"
              >
                Submit
              </button><br/>
              <button
                style={{
                  paddingTop: "10px",
                  paddingBottom: "10px",
                  paddingLeft: "10px",
                  paddingRight: "10px",
                  borderRadius: "10px",
                  fontFamily: "inherit",
                  color: "white",
                  backgroundColor: "green",
                }}
              >
                {" "}
                View All AvailableDoctors
              </button>
              <br></br>
              <button
                style={{
                  paddingTop: "10px",
                  paddingBottom: "10px",
                  paddingLeft: "10px",
                  paddingRight: "10px",
                  borderRadius: "10px",
                  fontFamily: "inherit",
                  color: "white",
                  backgroundColor: "green",
                }}
              >
                IntimateAdmin
              </button>
            </div>
          </form>
        </div>
       
      </div>
      <Footer/> 
    </>
  );
}

export default Reporter;