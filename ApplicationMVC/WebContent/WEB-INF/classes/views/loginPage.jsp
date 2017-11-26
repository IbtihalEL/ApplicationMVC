<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Login</title>
      <link rel="stylesheet" href="/css/style.css">

</head>
<body>

<div style="box-shadow: 20px 10px 5px black;"class="container">
  <div style="background: white;" class="info">
    <h1>Login Form</h1><span style="background: white;"> </span>
  </div>
</div>
<div style="box-shadow: 20px 10px 5px black;"class="form">
  <div class="thumbnail"><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/169963/hat.svg"/></div>
 <c:if test="${!empty erreur}">
    <p class="alert-box error"><span>error: </span> ${ erreur}</p>
</c:if>
 
  <form method="post" action="login" class="login-form">
    <input type="text" placeholder="username" name="username"/>
    <input type="password" placeholder="password" name="password"/>
    <input type="submit" value="Login"/>
    
  </form>
</div>


</body>
</html>