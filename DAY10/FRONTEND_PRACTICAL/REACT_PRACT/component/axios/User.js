import React from 'react'
import axios from 'axios'
import { useState } from 'react'
function User() {
    let[user,setUser]=useState([]);
    let[data,setData]=useState([]);
    const filterData=(event)=>{
      if(event.target.value==='male')
       {
         setUser(data.filter((element,index)=>{
            return element.gender==='male'
         }))
       }
       else if(event.target.value==='female')
       {
          setUser(data.filter((element,index)=>{
            return element.gender==='female'
         }))
       }
       else{
        setUser(data);
       }
    }
    const getData=()=>{
        axios.get("https://randomuser.me/api/?results=20")
        .then((res)=>
{
       console.log(res.data.results);
       setUser(res.data.results);
       setData(res.data.results);
 }
)
.catch((error)=>
{ 
    console.log(error);
    alert("SOME THING WENT WRONG FOR FETCHING THE DATA");
})
    }
  return (
    <div>
      <h2>USER INFORMATION</h2>
      <button className='btn btn-outline-success' onClick={getData}>GET DATA</button>
       {
         user.length>0 &&(
            <div>
                <input type="radio" name="gender" value='all' onChange={filterData} defaultChecked/>ALL
                 <input type="radio" name="gender" value='male' onChange={filterData} />MALE
                  <input type="radio" name="gender" value='female' onChange={filterData} />FEMALE
                </div>
         )
       }
       {
          user.length>0 ? 
          <div style={{width:"50%",margin:"50px auto "}}> 
            <table className='table table-hover'>
             <thead className='table table-dark'>
               <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>IMAGE</th>
                <th>GENDER</th>
                <th>EMAIL</th>
                <th>CITY</th>
               </tr>
             </thead>
             <tbody>
                {
                    user.map((element,index)=>{
                        return(
                            
                                <tr>
                                   <td>{index+1}</td> 
                                   <td>{element.name.first}</td>
                                   <td><img src={element.picture.medium} height={80} width={80}/></td>
                                   <td>{element.gender}</td>
                                   <td>{element.email}</td>
                                   <td>{element.location.city}</td>
                                </tr>
                           
                        )
                    })
                }
             </tbody>
            </table>
          </div> 
          :<h2 style={{color:"red"}}>NO USER INFORMATION</h2>
       }
    </div>
  )
}

export default User
