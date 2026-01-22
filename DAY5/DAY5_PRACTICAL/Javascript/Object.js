var product={
    pid:'P1',
     pname:'TV',
     pqty:5,
     price:25000.00
}
console.log(product.pid,product.pname,product.pqty,product.price);
//ADD A ELEMENT INTO EXISTING OBJECT
product.company='SONY';
console.log(product.pid,product.pname,product.pqty,product.price,product.company);
//DELETE ELEMENT IN EXISTING OBJECT
delete product.company;
console.log(product);
//NESTED OBJECT
//OBJECT WITHIN OBJECT
var employee={
    eid:1,
    ename:'SUMIT',
    adrress:{
        plotno:'AD10',
        streetnm:'SALTLAKE CITY',
        area:{
            ps:"BIDHANNAGAR",
            dist:'24 PGS NORTH'
        }
    }
}
console.log(employee.eid,employee.ename,employee.adrress.plotno,employee.adrress.area.ps);
   