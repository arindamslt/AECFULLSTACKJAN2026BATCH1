var arr=[100,200,300];
console.log(arr);
//ADD A ELEMENT AT LAST
arr.push(400);
console.log(arr);
//REMOVE THE LAST ELEMENT IN ARRAY
arr.pop();
console.log(arr);
//ADD THE ELEMNT IN FIRST POSTION
arr.unshift(50);
console.log(arr);
//REMOVE THE FIRST ELEMENT
arr.shift();
console.log(arr);
//DELETE SPECIFIC POSITION
arr.splice(2,1);
console.log(arr);
//ADD SPECIFIC POSITION
arr.splice(2,0,300);
console.log(arr);
//forEach
arr.forEach(function(element,index){
console.log(index,element);
})
//map return new array after doing some business logic
var newarr=arr.map(function(element,index){
return(element*10);
})
console.log(newarr);
//FILTER FUNCTION
//BASED ON CERTAIN CONDITION FECTH THE DATA AND STORE INTO THE NEW ARRY
var newaar1=arr.filter(function(element,index){
return element >200;
})
console.log(newaar1);