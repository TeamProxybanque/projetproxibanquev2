<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modifier le client</title>
</head>
<body>
	<!-- Inclure le header -->

	<div>
		<h1>Client N° -ID CLIENT- / Modification</h1>

		<section id="modifClient">
			<form action="#">
				<!-- Menera à la servlet modifClient -->
				<Label>Nom : </Label> 
				<input type="text" name="nom_client"></input> 
				<Label>Prénom : </Label> 
				<input type="text" name="prenom_client"></input> 
				<Label>Email : </Label> 
				<input type="text" name="email_client"></input> 
				<Label>Adresse : </Label> 
				<input type="text" name="adresse_client"></input>
	
				<button type="submit">Valider les modifications</button>
				<a href="detailClient.jsp">Annuler</a>
			</form>
		</section>
	</div>


</body>
</html>