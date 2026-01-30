import React from 'react'

function Login({username}) {
  return (
    <div style={{width:"30%",margin:"50px auto"}}>
  <h2 className='text-secondary'>LOGIN FORM</h2>
          <input type='text' className='form-control' placeholder='ENTER THE USERNAME' value={username}/>
          <input type='password' className='form-control' placeholder='ENTER THE PASSWORD'/>
        <button className='btn btn-outline-secondary'>LOGIN</button>
    </div>
  )
}

export default Login
