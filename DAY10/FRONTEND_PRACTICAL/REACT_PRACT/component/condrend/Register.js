import React from 'react'

function Register({setState,setUsername,username}) {
  return (
    <div style={{width:"30%",margin:"50px auto"}}>
          <h2 className='text-primary'>REGISTRATION</h2>
          <input type='text' className='form-control' placeholder='ENTER THE USERNAME'
          onChange={(event)=>{
             setUsername(event.target.value)
          }}/>
          <input type='password' className='form-control' placeholder='ENTER THE PASSWORD'/>
          <input type='text' className='form-control' placeholder='ENTER THE NAME'/>
          <input type='text' className='form-control' placeholder='ENTER THE PHONE NUMBER'/>
          <button className='btn btn-outline-primary'
          onClick={()=>
             {
                setState(true) 

             }}>REGISTER</button>
    </div>
  )
}

export default Register
