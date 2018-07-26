<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="fr.gtm.projetproxibanquev2.dao.VirementDAO"%>
<%@ page import="java.util.ArrayList"%>
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
							<tr>
								<td>22/06/2018</td>
								<td>11111A</td>
								<td>67890A</td>
								<td>450</td>
							</tr>
							<tr>
								<td>10/07/2018</td>
								<td>22222A</td>
								<td>33333A</td>
								<td>10000</td>
							</tr>
							<tr>
								<td>17/07/2018</td>
								<td>55555A</td>
								<td>66666A</td>
								<td>200</td>
							</tr>
							<tr>
								<td>21/07/2018</td>
								<td>12345A</td>
								<td>66666A</td>
								<td>3000</td>
							</tr>
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