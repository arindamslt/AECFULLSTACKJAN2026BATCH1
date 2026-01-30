import React from 'react'
import "./Nav.css"
function Nav() {
  return (
    <div className='mConatianer'>
       
        <div className='lContainer'>
           <h2>TRAINING APP</h2>
        </div>
        <div className='rContainer'>
           <a href="/state">STATE</a>
           <a href="/profile">PROFILE</a>
           <a href="/props">PROPS</a>
           <a href="/pdrilling">PROPSDRILLING</a>
           <a href="/condrend">CONDREND</a>
           <a href="/context">CONTEXT</a>
           <a href="/axios">AXIOS</a>
           <a href="/useeffect">USEEFFECT</a>
           <a href="/preport">ProductReport</a>
           <a href="/addproduct">ADD PRODUCT</a>
            <a href="/delproduct">DELETE PRODUCT</a>
               <a href="/updproduct">UPDATE PRODUCT</a>
            <a href="/product">PRODUCT</a>
        </div>
    </div>
  )
}

export default Nav
