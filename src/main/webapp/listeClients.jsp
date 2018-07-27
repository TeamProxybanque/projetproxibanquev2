<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="fr.gtm.projetproxibanquev2.domaine.Client"%>
<%@ page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="fr" dir="ltr">
  <head>
    <meta charset="utf-8">
    <!-- On fait appel au fichiers CSS et Bootstrap-->
    <link href="Bootstrap/css/bootstrap.css" rel="stylesheet"/>
    <link href="CSS/charteGraphique.css" rel="stylesheet"/>
    <title>Liste des clients du conseiller</title>
  </head>
  <body>
  	<div class="vertical-center">
    	<div class="container">
			<%@ include file="header.jsp" %>
      		<div class="row">
      			<div class="col-lg-12 align-self-center">
    				<h1>Liste de vos clients : </h1>
    			</div>
    		</div>
    		
    		<div class="row">
      			<div class="col-lg-12 align-self-center">
    				<table class="table table-striped">
     					 <thead>
        					<tr>
          						<th scope="col">Nom</th>
          						<th scope="col">Prénom</th>
          						<th scope="col">N° compte courant</th>
          						<th scope="col">Solde compte courant</th>
          						<th scope="col">N° compte épargne</th>
          						<th scope="col">Solde compte épargne</th>
          						<th scope="col">Voir plus</th>
        					</tr>
      					</thead>
      				<tbody>
      <!-- Le tableau ci-dessous dera créé dynamiquement à partir des données reçues de la bdd -->
      					<c:forEach items="${listeClients}" var="client"> 
  							<tr>
    							<td>${client.getNom()}</td>
    							<td>${client.getPrenom()}</td>
    							<td>${client.getCompteCourant()}</td>
    							<td>${client.getCompteCourant().getSolde()}</td>
    							<td>${client.getCompteEpargne()}</td>
    							<td>${client.getCompteEpargne().getSolde()}</td>
    							<td><a href=detailClient.jsp>Voir plus</a></td>
  							</tr>
						</c:forEach>

      				</tbody>
    			</table><br>
    			<div class="text-center">
					<a href="index.jsp" class="btn btn-info">Se déconnecter</a><br><br>  <!-- Le déconnexion mènera vers la servlet déconnexion  -->
				</div>	
    		</div>
   		</div>

		<%@ include file="footer.jsp" %>
	</div>
  </body>
</html>
