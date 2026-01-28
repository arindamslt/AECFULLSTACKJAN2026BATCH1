import React from 'react'
import { useState } from 'react'
import axios from 'axios'
function AddProduct() {
    let[product,setProduct]=useState({
        pid:"",
        pname:"",
        pqty:"",
        price:""
    })
    let[msg,setMsg]=useState("");
    let[errors,setErrors]=useState("");
    const refreshData=()=>{
        setProduct({
            pid:"",
            pname:"",
            pqty:"",
            price:""
        })
        setMsg("");
        setErrors("");
    }
    const addData=()=>{
        axios.post("http://localhost:1004/product/add",product)
        .then((res)=>{
            console.log(res.data);
            setMsg(res.data);
        })
        .catch((error)=>{
           console.log(error.response.data.pname);
           setErrors(error.response.data.pname);
           
        })
        
    }
  return (
    <div style={{width:"30%",margin:"50px auto"}}>
      <h2 className='text-secondary'>PRODUCT ADD FORM</h2>
      <input type='text' className='form-control' value={product.pid} placeholder='ENTER THE PRODUCT ID'
       onChange={(event)=>{
         setProduct({
            ...product,
            pid:event.target.value
         })

       }}/>
      <input type='text' className='form-control' value={product.pname} placeholder='ENTER THE PRODUCT NAME'
       onChange={(event)=>{
         setProduct({
            ...product,
            pname:event.target.value
         })

       }}/>
       <input type='text' className='form-control' value={product.pqty} placeholder='ENTER THE PRODUCT QUANTITY'
       onChange={(event)=>{
         setProduct({
            ...product,
           pqty:event.target.value
         })

       }}/>
     <input type='text' className='form-control' value={product.price} placeholder='ENTER THE PRODUCT PRICE'
       onChange={(event)=>{
         setProduct({
            ...product,
            price:event.target.value
         })

       }}/>
       <button className='btn btn-outline-primary' onClick={addData}>ADD</button> &nbsp;&nbsp;
       <button className='btn btn-outline-secondary' onClick={refreshData}>REFRESH</button>
        <h3 className='text-warning'>{msg}</h3>
        <h3>{errors}</h3>
    </div>
  )
}

export default AddProduct
