<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- On fait appel au fichiers CSS et Bootstrap-->
    <link href="Bootstrap/css/bootstrap.css" rel="stylesheet"/>
<title>Détail client</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	
	<div id="contenuClient">
		<h1>Client N° -ID CLIENT-</h1>
	
		<section id="detailClient">
			<form action ="modifClient.jsp">
				<fieldset>
					<legend>Informations personnelles</legend>
					<Label>Nom : </Label>
					<Label>-NOM DU CLIENT-</Label>
					<Label>Prénom : </Label>
					<Label>-PRENOM DU CLIENT-</Label>
					<Label>Email : </Label>
					<Label>-EMAIL DU CLIENT-</Label>
					<Label>Adresse : </Label>
					<Label>-ADRESSE DU CLIENT-</Label>	
					
					<button type="submit">Modifier les données</button>	
				</fieldset>
			</form>
			
				
		</section>
		
		<section id="detailComptesClient">
		
		<form action = "faireVirement.jsp""> <!-- menera vers la servlet virement -->
			<fieldset>
				<legend>Comptes</legend>
				<Label>N° compte courant : </Label>
				<Label>-NUM CPTE COURANT-</Label>
				<Label>Solde : </Label>
				<Label>-SOLDE CPTE COURANT-</Label>
				<Label>N° compte epargne : </Label>
				<Label>-NUM CPTE EPARGNE-</Label>
				<Label>Solde : </Label>
				<Label>-SOLDE CPTE EPARGNE-</Label>	
				
				<button type="submit">Faire un virement</button>
			</fieldset>
			</form>
		
		</section>
		
		<a href="listeClients.jsp">Retour à la liste des clients</a>
		
	
	</div>
	
	
	<%@ include file="footer.jsp" %>
</body>
</html>