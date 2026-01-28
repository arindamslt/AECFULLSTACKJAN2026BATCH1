import React from 'react'
import axios from 'axios'
import { useEffect } from 'react'
import { useState } from 'react'
function ProductReport() {
    let[product,setProduct]=useState([]);
    useEffect(()=>{ 
        axios.get("http://localhost:1004/product/fetch")
        .then((res)=>{
            console.log(res.data);
            setProduct(res.data);
        })
        .catch((error)=>{
            console.log(error);
            alert("SOMETHING WENT WRONG FOR FETCHING DATA ");
        })
    },[])
  return (
    <div>
      <h2 className='text-primary'>LIST OF PRODUCTS AVAILABLE</h2>
      {
        product.length>0 ? 
        <div style={{width:"30%",margin:"50px auto"}}> 
          <table className='table table-hover table-striped'>
           <thead className='table table-dark'>
             <tr>
                <th>PRODUCT ID</th>
                <th>PRODUCT NAME</th>
                <th>QUANTITY</th>
                <th>PRICE</th>
             </tr>
           </thead>
           <tbody>
            {
                product.map((element,index)=>{
                    return(
                        <tr>
                            <td>{element.pid}</td>
                            <td>{element.pname}</td>
                             <td>{element.pqty}</td>
                                <td>{element.price}</td>
                        </tr>
                    )
                })
            }
           </tbody>
          </table>
        </div>
         :<h2>NO PRODUCT AVILABLE</h2>
      }
    </div>
  )
}

export default ProductReport
