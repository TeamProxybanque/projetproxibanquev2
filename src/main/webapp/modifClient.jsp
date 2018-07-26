<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- On fait appel au fichiers CSS et Bootstrap-->
    <link href="Bootstrap/css/bootstrap.css" rel="stylesheet"/>
<title>Modifier le client</title>
</head>
<body>
	<%@ include file="header.jsp" %>

	<div>
		<h1>Client N° -ID CLIENT- / Modification</h1>

		<section id="modifClient">
			<form action="#">
			
				<!-- Menera à la servlet modifClient -->
				<fieldset>
					<legend>Informations personnelles</legend>
					<Label>Nom : </Label> 
					<input type="text" name="nom_client"></input> 
					<Label>Prénom : </Label> 
					<input type="text" name="prenom_client"></input> 
					<Label>Email : </Label> 
					<input type="text" name="email_client"></input> 
					<Label>Adresse : </Label> 
					<input type="text" name="adresse_client"></input>
				<br>	
				<div class="btnContainer">
					<button type="submit">Valider les modifications</button>
					<a href="detailClient.jsp">Annuler</a>
				</div>
				</fieldset>
			</form>
		</section>
	</div>

<%@ include file="footer.jsp" %>
</body>
</html>