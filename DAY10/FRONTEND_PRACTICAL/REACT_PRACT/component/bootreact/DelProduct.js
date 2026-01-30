import React from 'react'
import { useState } from 'react'
import axios from 'axios'
function DelProduct() {
      let[product,setProduct]=useState({
            pid:"",
            pname:"",
            pqty:"",
            price:""
        })
        let[msg,setMsg]=useState("");
        const refreshData=()=>{
        setProduct({
            pid:"",
            pname:"",
            pqty:"",
            price:""
        })
        setMsg("");
    }
        const deleteData=(pid)=>{
         alert(pid);
         axios.delete(`http://localhost:1004/product/del/${pid}`)
         .then((res)=>{
            console.log(res.data);
            setMsg(res.data);
         })
         .catch((error)=>{
            console.log(error);
         })
        }
  return (
    <div style={{width:"30%",margin:"50px auto"}}>
      <h2 className='text-danger'>DELETE PRODUCT FORM</h2>
       <input type='text' className='form-control' value={product.pid} placeholder='ENTER THE PRODUCT ID'
       onChange={(event)=>{
         setProduct({
            ...product,
            pid:event.target.value
         })

       }}/>
       <button className='btn btn-outline-danger' 
       onClick={()=>{
        deleteData(product.pid)
       }}>DELETE</button>
       <button  className='btn btn-outline-danger' onClick={refreshData}>REFRESH</button>
       <h3>{msg}</h3>
    </div>
  )
}

export default DelProduct
