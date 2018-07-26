<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- On fait appel au fichiers CSS et Bootstrap-->
    <link href="Bootstrap/css/bootstrap.css" rel="stylesheet"/>
    <link href="CSS/charteGraphique.css" rel="stylesheet"/>
<title>Détail client</title>
</head>
<body>
  	<div class="vertical-center">
    	<div class="container">
			<%@ include file="header.jsp" %>
      		<div class="row">
      			<div class="col-lg-8 align-self-center col-lg-offset-2">
					<div id="contenuClient">
						<h1>Client N° -ID CLIENT-</h1>
	
						<section id="detailClient">
						<form action ="modifClient.jsp">
							<fieldset class="form-group">
								<legend>Informations personnelles</legend>
								<Label>Nom : </Label>
								<Label>-NOM DU CLIENT-</Label><br>
								<Label>Prénom : </Label>
								<Label>-PRENOM DU CLIENT-</Label><br>
								<Label>Email : </Label>
								<Label>-EMAIL DU CLIENT-</Label><br>
								<Label>Adresse : </Label>
								<Label>-ADRESSE DU CLIENT-</Label><br><br>	
					
								<button type="submit" class="btn btn-info">Modifier les données</button>	
							</fieldset>
						</form>	
						</section>
					</div>
				</div>
			</div>
			<div class="row">
      			<div class="col-lg-8 align-self-center col-lg-offset-2">
		
					<section id="detailComptesClient">
		
					<form action = "faireVirement.jsp""> <!-- menera vers la servlet virement -->
						<fieldset class="form-group">
							<legend>Comptes</legend>
							<Label>N° compte courant : </Label>
							<Label>-NUM CPTE COURANT-</Label><br>
							<Label>Solde : </Label>
							<Label>-SOLDE CPTE COURANT-</Label><br>
							<Label>N° compte epargne : </Label>
							<Label>-NUM CPTE EPARGNE-</Label><br>
							<Label>Solde : </Label>
							<Label>-SOLDE CPTE EPARGNE-</Label>	<br><br>
				
							<button type="submit" class="btn btn-info">Faire un virement</button>
						</fieldset>
					</form>
					</section>
					<div class="text-center">
						<a href="listeClients.jsp" class="btn btn-info">Retour à la liste des clients</a><br><br>
					</div>	
				</div>
			</div>
		<%@ include file="footer.jsp" %>
	</div>
</body>
</html>