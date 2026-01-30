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
    let[errors,setErrors]=useState({
      pname:"",
      pqty:""
    });
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
          //console.log(error.response.data);
          // console.log(error.response.data.pname);
            //console.log(error.response.data.pqty);
           //setErrors(error.response.data);
           const err = error.response.data;
            console.log(typeof err); 
            console.log(err.pname);
            console.log(err.pqty);
            setErrors({
              pname:err.pname,
              pqty:err.pqty
            })
 /* Object.values(errors).forEach(message => {
    console.log(message);
    setErrors(message);
  })*/
           
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
          <h3>{errors.pname}</h3>
       <input type='text' className='form-control' value={product.pqty} placeholder='ENTER THE PRODUCT QUANTITY'
       onChange={(event)=>{
         setProduct({
            ...product,
           pqty:event.target.value
         })

       }}/>
       <h3>{errors.pqty}</h3>
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
       
       
    </div>
  )
}

export default AddProduct
