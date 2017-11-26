<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Livre</title>
<link rel="stylesheet" href="css/cssf.css">

</head>
<body>

<div class="form-style-10">
<h1>Ajouter un livre</h1>

<form method="post" action="AjouterLivre">
    <div class="section">formulaire</div>
    <div class="inner-wrap">
        <label>Titre <input type="text" name="titre" placeholder="titre du livre"/></label>
        <label>Nombre d'exemplaires <input type="number" name="nombreExemplaire" /></label>
        <label>domaine <input type="text" name="domaine" placeholder="domaine du livre"/></label>
        <label>prix <input type="number" name="prix"/></label>
        
		
          </label>
          
	
    </div>
  </br>
    <div >
    <tr>

     <input type="submit" name="ajouter" value="Ajouter" />
     
    </div>
</form>
</div>

</body>
</html>