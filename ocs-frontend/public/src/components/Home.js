import React, { useState } from "react";
import { Link } from "react-router-dom";
import axios from "axios";
import "./Home.css";
import Header from "./Header";
import Footer from "./Footer";
import { useNavigate } from "react-router-dom";

function Home() {
  const [userID, setUserID] = useState("");
  const [password, setPassword] = useState("");
  const [role, setRole] = useState("Admin");
  let cb = {};
  const [error, setError] = useState("");

  const nav = useNavigate();
  const handleSubmit = (e) => {
    e.preventDefault();
    const data = { userID, password };
    console.log(JSON.stringify(data));
    axios.get('http://localhost:8071/admin/selectUser/{$userID}/{$password}')
      .then((res) => {
        console.log(JSON.stringify(res.data));
    
    if (res.data === true) {
      console.log("Inside if");
      console.log(role);
    }
  })

      // console.log(userID + " " + password);
      if (userID === "AD-001" && password === "AD-001") {
        alert("Logged In Successfully! Welcome Administrator");
        nav("/add");
      } else if (userID === "AD-002" && password === "AD-002") {
        alert("Logged In Successfully! Welcome Administrator");
        nav("/select");
      } else if (userID === "AD-003" && password === "AD-003") {
        alert("Logged In Successfully! Welcome Administrator");
        nav("/update");
      } else if (userID === "AD-004" && password === "AD-004") {
        alert("Logged In Successfully! Welcome Administrator");
        nav("/delete");
      } else if (userID === "RE01" && password === "RE01") {
        nav("/reporter");
      } else {
        setError("Invalid credentials");
      }
    };

  
  

    return (
      <>
        <Header />
        <div className="homebackground" style={{}}>
          <div className="a" style={{ fontFamily: "cursive" }}>
            <div className="bg">
              <div style={{ marginTop: "8%" }}>
                <h1
                  style={{
                    fontFamily: "initial",
                    color: "blueviolet",
                    marginLeft: "45px",
                  }}
                >
                  Login
                </h1>
                <form
                  style={{
                    paddingTop: "20px",

                    marginLeft: "45px",
                  }}
                  onSubmit={handleSubmit}
                >
                  Select Your Role :{" "}
                  <select
                    className="select-option"
                    value={role}
                    onChange={(e) => {
                      setRole(e.target.value);
                    }}
                  >
                    <option value="Administrator">Administrator</option>
                    <option value="Reporter">Reporter</option>
                    <option value="Patient">Patient</option>
                  </select>
                  <br />
                  <label>UserID : </label>
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
                  <label>Password : </label>
                  <div>
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
                  <div
                    style={{
                      display: "flex",
                      marginTop: "25px",
                      justifyContent: "space-between",
                    }}
                  >
                    <button
                      style={{
                        paddingTop: "10px",

                        paddingBottom: "10px",
                        borderRadius: "10px",
                        paddingLeft: "30px",
                        paddingRight: "30px",
                        fontFamily: "inherit",
                        color: "white",

                        backgroundColor: "green",
                      }}
                    >
                      Login
                    </button>{" "}
                    <Link to="/register">
                      <button
                        style={{
                          paddingTop: "10px",
                          paddingBottom: "10px",
                          borderRadius: "10px",
                          paddingLeft: "20px",
                          paddingRight: "20px",
                          fontFamily: "inherit",
                          color: "white",
                          backgroundColor: "green",
                        }}
                      >
                        Register
                      </button>
                    </Link>
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>
        <Footer />
      </>
    );
  }


export default Home;
