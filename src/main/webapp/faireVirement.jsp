<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- On fait appel au fichiers CSS et Bootstrap-->
    <link href="Bootstrap/css/bootstrap.css" rel="stylesheet"/>
    <link href="CSS/charteGraphique.css" rel="stylesheet"/>
    
<title>Effectuer un virement</title>
</head>
<body>
  	<div class="vertical-center">
    	<div class="container">
			<%@ include file="header.jsp" %>
      		<div class="row">
      			<div class="col-lg-12 align-self-center">
					<h1>Client N° -ID CLIENT- / Virement</h1>
    			</div>
    		</div><br>
    		<div class="row">
      			<div class="col-lg-6 align-self-center col-lg-offset-3">

					<section id="faireVirement">
						<form action="#">
					<!-- Menera à la servlet modifClient -->
							<fieldset class="form-group">
								<legend>Virement</legend>				
								<Label>Compte débité : </Label> 
					 			<select multiple class="form-control">
  									<option value="compteCourant">-NUM CPTE COURANT-</option>
  									<option value="compteEpargne">-NUM CPTE EPARGNE-</option>
  								</select> 
								<Label>Compte crédité : </Label> 
								<input class="form-control" type="text" name="num_compte_deb"></input> 
								<Label>Montant : </Label> 
								<input class="form-control" type="text" name="montant_vir"></input> 
								<br>	
								<div class="btnContainer text-center">
									<button class="btn btn-info type="submit">Valider</button>
									<a href="detailClient.jsp" class="btn btn-info">Annuler</a><br><br>
								</div>	
							</fieldset>
						</form>
					</section>
				</div>
			</div>
			<%@ include file="footer.jsp" %>
		</div>
	</div>
</body>
</html>