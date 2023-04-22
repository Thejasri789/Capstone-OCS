import React, { useEffect, useState } from 'react'
import axios from 'axios'
import './Add.css'
import Header from './Header'
import Footer from './Footer'
function Add() {
    const [doctorID,setDoctorID]=useState('')
    const [doctorName,setDoctorName]=useState('')
    const[dateOfBirth,setDateOfBirth]=useState('')
    const[dateOfJoining,setDateOfJoining]=useState('')

    const[gender,setGender]=useState('')
    const[qualification,setQualification]=useState('')
    const[specialization,setSpecialization]=useState('')
    const[yearsOfExperience,setYearsOfExperience]=useState('')
    const[street,setStreet]=useState('')
    const[location,setLocation]=useState('')
    const[city,setCity]=useState('')
    const[state,setState]=useState('')
    const[pincode,setPincode]=useState('')
    const[contactNumber,setContactNumber]=useState('')
    const [emailID,setEmailID]=useState('');
    const [obj,setObj]=useState({});

    const handeSubmit=(e)=>{
     e.preventDefault();
     console.log(emailID);
     setObj({doctorID:doctorID,doctorName:doctorName,dateOfBirth:dateOfBirth,dateOfJoining:dateOfJoining,gender:gender,qualification:qualification,specialization:specialization,yearsOfExperience:yearsOfExperience,street:street,location:location,city:city,state:state,pincode:pincode,contactNumber:contactNumber,emailID:emailID})
    //    const ele=JSON.stringify(obj);
   
    
     axios.post('http://localhost:8071/admin/addDoctor',obj).then(rej=>(alert("Data is added")))

        }
  return (
    <>
      <Header />
      <div className="hom" style={{ fontFamily: "cursive" }}>
        <form
          className="aform"
          style={{ display: "flex", flexDirection: "column" }}
          onSubmit={handeSubmit}
        >
          <div style={{ display: "flex" }}>
            <div className="first">
              DoctorID :{" "}
              <div>
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
              DoctorName :{" "}
              <div>
                <input
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  type="text"
                  value={doctorName}
                  onChange={(e) => {
                    setDoctorName(e.target.value);
                  }}
                />
              </div>
              DateOfBirth :{" "}
              <div>
                <input
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  type="text"
                  value={dateOfBirth}
                  onChange={(e) => {
                    setDateOfBirth(e.target.value);
                  }}
                />
              </div>
              DateOfJoining :
              <div>
                {" "}
                <input
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  type="text"
                  value={dateOfJoining}
                  onChange={(e) => {
                    setDateOfJoining(e.target.value);
                  }}
                />
              </div>
              Gender :
              <div>
                {" "}
                <input
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  type="text"
                  value={gender}
                  onChange={(e) => {
                    setGender(e.target.value);
                  }}
                />
              </div>
              Qualification :{" "}
              <div>
                <input
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  type="text"
                  value={qualification}
                  onChange={(e) => {
                    setQualification(e.target.value);
                  }}
                />
              </div>
              Specialization :{" "}
              <div>
                <input
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  type="text"
                  value={specialization}
                  onChange={(e) => {
                    setSpecialization(e.target.value);
                  }}
                />
              </div>
            </div>

            <div
              className="mid"
              style={{ paddingRight: "30%", paddingLeft: "20%" }}
            >
              YearsOfExperience :{" "}
              <div>
                <input
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  type="text"
                  value={yearsOfExperience}
                  onChange={(e) => {
                    setYearsOfExperience(e.target.value);
                  }}
                />
              </div>
              street :{" "}
              <div>
                <input
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  type="text"
                  value={street}
                  onChange={(e) => {
                    setStreet(e.target.value);
                  }}
                />
              </div>
              Location :{" "}
              <div>
                <input
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  type="text"
                  value={location}
                  onChange={(e) => {
                    setLocation(e.target.value);
                  }}
                />
              </div>
              City :
              <div>
                {" "}
                <input
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  type="text"
                  value={city}
                  onChange={(e) => {
                    setCity(e.target.value);
                  }}
                />
              </div>
              State :
              <div>
                {" "}
                <input
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  type="text"
                  value={state}
                  onChange={(e) => {
                    setState(e.target.value);
                  }}
                />
              </div>
              Pincode :
              <div>
                {" "}
                <input
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  type="text"
                  value={pincode}
                  onChange={(e) => {
                    setPincode(e.target.value);
                  }}
                />
              </div>
              ContactNumber :{" "}
              <div>
                <input
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  type="text"
                  value={contactNumber}
                  onChange={(e) => {
                    setContactNumber(e.target.value);
                  }}
                />
              </div>
              EmailID :{" "}
              <div>
                <input
                  style={{
                    paddingTop: "5px",
                    paddingBottom: "5px",
                    borderRadius: "5px",
                  }}
                  type="text"
                  value={emailID}
                  onChange={(e) => {
                    setEmailID(e.target.value);
                  }}
                />
              </div>
            </div>
          </div>

          <button
            style={{
              paddingTop: "10px",
              paddingBottom: "10px",
              borderRadius: "5px",
              fontFamily: "inherit",
              color: "white",
              backgroundColor: "green",
            }}
            type="submit"
          >
            Add Doctor
          </button>
        </form>
      </div>
      <Footer/>
    </>
  );
}

export default Add
