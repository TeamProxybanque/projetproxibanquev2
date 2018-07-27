<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="fr.gtm.projetproxibanquev2.dao.VirementDAO"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="fr.gtm.projetproxibanquev2.domaine.Virement"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- On fait appel au fichiers CSS et Bootstrap-->
	<link href="Bootstrap/css/bootstrap.css" rel="stylesheet" />
    <link href="CSS/charteGraphique.css" rel="stylesheet"/>
    <link href="CSS/styleListeVirements.css" rel="stylesheet"/>
<!-- On fait appel au fichiers JavaScript -->
	<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript" src="JavaScript/listeVirementsJavaScript.js"></script>
</head>

<body>

  	<div class="vertical-center">
    	<div class="container-fluid">
			<%@ include file="header.jsp" %>
      		<div class="row">
      			<div class="col-lg-7 align-self-center">
					<section>
						<table class="table table-striped">
							<tr>
								<th scope="col">Date</th>
								<th scope="col">Compte débité</th>
								<th scope="col">Compte crédité</th>
								<th scope="col">Montant</th>
							</tr>
					
						<c:forEach items="${listeVirements}" var="vir">     
  							<tr>
    							<td>${vir.getDateVirement()}</td>
    							<td>${vir.getNumeroCompteDebiteur()}</td>
    							<td>${vir.getNumeroCompteCrediteur()}</td>
    							<td>${vir.getMontant()}</td>
    							
  							</tr>
						</c:forEach>						
						
						
						
						</table>
					</section>
				</div>
				<div class="col-lg-5 align-self-center">
					<h1>Histogramme de virements</h1>
					<div id="histogrammeVirements">
					</div>
					</canvas>
				</div>
			</div><br><br>
			<%@ include file="footer.jsp" %>
		</div>
	</div>
	<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
</body>
</html>