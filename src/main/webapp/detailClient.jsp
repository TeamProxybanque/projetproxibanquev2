<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
						<h1>Client N°<c:out value="${client.id}" /></h1>
	
						<section id="detailClient">
						<form action ="modifClient.jsp">
							<fieldset class="form-group">
								<legend>Informations personnelles</legend>
								<Label>Nom : </Label>
								<Label>${client.getNom()}</Label><br>
								<Label>Prénom : </Label>
								<Label><c:out value="${client.prenom}" /></Label><br>
								<Label>Email : </Label>
								<Label><c:out value="${client.email}" /></Label><br>
								<Label>Adresse : </Label>
								<Label><c:out value="${client.adresse}" /></Label><br><br>	
					
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
							<Label>${client.getCompteCourant().getNumeroDeCompte()}</Label><br>
							<Label>Solde : </Label>
							<Label>${client.getCompteCourant().getSolde()}</Label><br>
							<Label>N° compte epargne : </Label>
							<Label>${client.getCompteEpargne().getNumeroDeCompte()}</Label><br>
							<Label>Solde : </Label>
							<Label>${client.getCompteEpargne().getSolde()}</Label>	<br><br>
				
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