import React from 'react'
import Childs from './Childs'
import { useState } from 'react'
function Parents() {
    let[state,setState]=useState("");
    const populateData=(event)=>{
     setState(event.target.value);
    }
  return (
    <div>
      <h2>PARENT COMPONENT</h2>
      <input type='text' placeholder='ENTER YOUR NAME' onChange={populateData}/>
       <Childs data={state}/>
    </div>
  )
}

export default Parents
