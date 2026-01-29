//import logo from './logo.svg';
import './App.css';
import FunctionalComponent from './component/FunctionalComponent';
import StateDemo from './component/state/StateDemo';
import Profile from './component/state/Profile';
import Parent from './component/props/Parent';
import Parents from './component/prop/Parents';
import A from './component/propsdrilling/A';
import Parent1 from './component/contextapi/Parent1';
import "bootstrap/dist/css/bootstrap.css";
import Main from './component/condrend/Main';
import User from './component/axios/User';
import UserInfo from './component/useeffect/UserInfo';
import Nav from './component/route/Nav';
import { Route,Routes } from 'react-router-dom';
import Jewellery from './component/nestedrouting/Jewellery';
import Garments from './component/nestedrouting/Garments';
import Retails from './component/nestedrouting/Retails';
import Electronics from './component/nestedrouting/Electronics';
import Product from './component/nestedrouting/Product';
import ProductReport from './component/bootreact/ProductReport';
import AddProduct from './component/bootreact/AddProduct';
import DelProduct from './component/bootreact/DelProduct';
import UpdProduct from './component/bootreact/UpdProduct';
function App() {
  return (
    <div className="App">
     <h2>REACT APP</h2>  
     <Nav/>
    
     <Routes>
      <Route path="/state" element={<StateDemo/>}/>
       <Route path="/profile" element={<Profile/>}/>
        <Route path="/props" element={<Parents/>}/>
         <Route path="/pdrilling" element={<A/>}/>
          <Route path="/condrend" element={<Main/>}/>
          <Route path="/context" element={<Parent1/>}/>
          <Route path="/axios" element={<User/>}/>
          <Route path="/useeffect" element={<UserInfo/>}/>
          <Route path="/preport" element={<ProductReport/>}/>
          <Route path="/addproduct" element={<AddProduct/>}/>
          <Route path="/delproduct" element={<DelProduct/>}/>
           <Route path="/updproduct" element={<UpdProduct/>}/>
           <Route path="/product" element={<Product/>}>
                <Route path="electronics" element={<Electronics/>}/>
                 <Route path="garments" element={<Garments/>}/>
                  <Route path="jewellery" element={<Jewellery/>}/>
                   <Route path="retails" element={<Retails/>}/>
           </Route>
     </Routes>
    </div>
  );
}

export default App;
