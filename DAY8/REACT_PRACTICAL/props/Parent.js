import React from 'react'
import Child from './Child'
function Parent() {
  return (
    <div>
      <h2>PARENT COMPONENT</h2>
      <input type='text' placeholder='ENTER YOUR NAME'/>
      <Child/>
    </div>
  )
}

export default Parent
