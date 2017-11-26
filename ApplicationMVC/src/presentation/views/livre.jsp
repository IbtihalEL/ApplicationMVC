<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Livres</title>
      
      <link rel="stylesheet" href="css/stylee.css">
  
</head>

<body>


<h1 style="color:white ; text-align: center";>Livres</h1>
<form class="form" method="post" action="AjouterLivre">
    
    <input class="form" type="submit" name="ajouterLivre" value="ajouter un livre" />
  </form>
  </br>  
    
  <div class="table">
    
    <div class="row header green">
     <div class="cell">
        Titre du livre
      </div>
      <div class="cell">
        Nombre d'exemplaire
      </div>
      <div class="cell">
        Domaine
      </div>
      <div class="cell">
       Prix
      </div>
      
     
   </div>
    
   <c:set var="i" value="0" />
    <c:forEach var="livre" items="${livre }">
    <c:if test="${!empty livre}">
     <c:set var="i" value="${i + 1}" />

    <div class="row">
     
    	 
      <div class="cell">
		<c:out value="${livre.titre }" />
      </div>
      
      <div class="cell">
        <c:out value="${livre.nombreExemplaire }" />
      </div>
      
    
      <div class="cell">
        <c:out value="${livre.domaine }" />
      </div>
      
     
      <div class="cell">
        <c:out value="${livre.prix }" />
      </div>
      
      
     
    
</div>

</c:if>
</c:forEach>   
             
    </div>
   
</body>
</html>
