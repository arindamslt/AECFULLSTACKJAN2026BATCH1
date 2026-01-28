import React from 'react'
import { Link, Outlet } from 'react-router-dom'

import "./Product.css"
function Product() {
  return (
    <div className='pmContainer'>
      <div className='plContainer'>
       <Link to="electronics">ELECTRONICS</Link>
        <Link to="garments">GARMENTS</Link>
         <Link to="jewellery">JEWELLERY</Link>
          <Link to="retails">RETAILS</Link>
      </div>
      <div className='prContainer'>
       <Outlet/>
      </div>
    </div>
  )
}

export default Product
