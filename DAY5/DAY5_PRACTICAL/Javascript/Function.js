//NORMAL FUNCTION
function fn1()
{
    console.log("NORMAL FUNCTION");
 }
 fn1();
 //PARAMETESIED FUNCTION
 function fn2(x,y)
 { 
    console.log(x,y);
 }
 fn2(10,20);
 //FUNCTION WITH RETURN CSSLayerStatementRule
 function fn3(a,b)
 {
    return(a+b);
  }
  var res=fn3(25,40);
  console.log(res);
  //ANNONYMOUS FUNCTION(FUNCTION WITHOUT NAME)
  function fn4(f)
  {
    f();
    console.log(f);
   }
   fn4(function(){ 
    state='WB';
    console.log(state);
   })
   //HIGER ORDER FUNCTION AND CALLBACK FUNCTION
   function print()
   { 
    var city='KOLKATA';
    console.log(city);
   }
   function fn5(f)
   { 
    f();
    console.log(f);
   }
   fn5(print);//HERE fn5 is higher order function and print is callback function
   //FUNCTION EXPRESSION
   var res=function(){ 
    var dist="24 PGS NORTH";
    console.log(dist);
}
res();