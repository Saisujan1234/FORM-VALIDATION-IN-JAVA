/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


<html>
<head>
<script>
function validateform(){
var uname=document.myform.uname.value;
var pwd=document.myform.pwd.value;
if(uname.length==0){

alert("Please enter a Username");
return false;
}
if(pwd.length<6){
alert("Password cannot less than 6 characters");
return false;
}
return true;
}
</script>
</head>
<body>
<h1> Login Form </h1>
<form name="myform" onsubmit="return validateform()">
<table>
<tr><td>Name:</td>
<td><input type="text" name="uname"></td>
</tr>
<tr><td>Password:</td>
<td><input type="Password" name="pwd"></td>
</tr>
<tr><td><input type="submit" value="submit"></td></tr>
</table>
</form>
</body>
</html>