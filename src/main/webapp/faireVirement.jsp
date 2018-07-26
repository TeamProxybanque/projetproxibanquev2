<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- On fait appel au fichiers CSS et Bootstrap-->
    <link href="Bootstrap/css/bootstrap.css" rel="stylesheet"/>
    
<title>Effectuer un virement</title>
</head>
<body>
<%@ include file="header.jsp" %>

	<div>
		<h1>Client N° -ID CLIENT- / Virement</h1>

		<section id="faireVirement">
			<form action="#">
			<!-- Menera à la servlet modifClient -->
				<fieldset>
					<legend>Virement</legend>				
					<Label>Compte débité : </Label> 
					 <select>
  						<option value="compteCourant">-NUM CPTE COURANT-</option>
  						<option value="compteEpargne">-NUM CPTE EPARGNE-</option>
  					</select> 
					<Label>Compte crédité : </Label> 
					<input type="text" name="num_compte_deb"></input> 
					<Label>Montant : </Label> 
					<input type="text" name="montant_vir"></input> 
				<br>	
				<div class="btnContainer">
					<button type="submit">Valider</button>
					<a href="detailClient.jsp">Annuler</a>
				</div>
					
				</fieldset>
				
			</form>
		</section>
	</div>
<%@ include file="footer.jsp" %>
</body>
</html>