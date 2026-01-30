import React from 'react'
import B from './B'
import { useState } from 'react'
function A() {
    let[state,setState]=useState();
    const populateData=(event)=>{
   setState(event.target.value);
    }
  return (
    <div>
      <h2>A COMPONENT</h2>
      <input type='text' placeholder='ENTER YOUR NAME' onChange={populateData}/>
      <B data={state}/>
    </div>
  )
}

export default A
