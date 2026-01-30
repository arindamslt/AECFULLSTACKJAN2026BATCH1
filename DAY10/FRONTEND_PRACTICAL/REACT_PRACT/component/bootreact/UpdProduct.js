import React from 'react'
import axios from 'axios'
import { useState } from 'react'
import Product from '../nestedrouting/Product';
function UpdProduct() {
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
        const updateData=(pid)=>{
            alert(pid);
        axios.put(`http://localhost:1004/product/upd/${pid}`,product)
        .then((res)=>{
            console.log(res.data);
            setMsg(res.data);
        })
        .catch((error)=>{
            console.log(error.response.data);
            alert("SOMETHING WENT WRONG TO UPDATE DATA");
        })
        }

  return (
    <div style={{width:"30%",margin:"50px auto"}}>
      <h2 className='text-success'>UPDATE PRODUCT FORM</h2>
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
       <button className='btn btn-outline-success' 
       onClick={()=>{
        updateData(product.pid)
       }}>UPDATE</button> &nbsp;&nbsp;
       <button className='btn btn-outline-success' onClick={refreshData}>REFRESH</button>
        <h3 className='text-success'>{msg}</h3>
    </div>
  )
}

export default UpdProduct
