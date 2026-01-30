//SPREAD OPERATOR
var obj1={
    id:1,
    deptnm:'MKTG',
    loc:'KOLKATA'
}
var obj2={
    ...obj1,
    loc:'DELHI'
}
console.log(obj1);
console.log(obj2);
//REST PARAMETER
function fn(x,y,...data)
{
    console.log(x,y,data);
}
fn(10,20,30,40);
//DESTRUCTING OF OBJECT
var employee={
     eid:1,
    ename:'AJOY',
    deptnm:'HR'
}
var{ename,deptnm}=employee;
console.log(ename,deptnm);
//ARROW FUNCTION
function fn()
{
    console.log("NORMAL FUNCTION");
}
fn();
const fn1=()=>{
    console.log("ARROW FUNCTION");
}
fn1();
var arr=[100,200,300];
arr.forEach(function(element,index){
console.log(index,element);
})
arr.forEach((element,index)=>{
    console.log(index,element);
})