<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- On fait appel au fichiers CSS et Bootstrap-->
    <link href="Bootstrap/css/bootstrap.css" rel="stylesheet"/>
    <link href="CSS/charteGraphique.css" rel="stylesheet"/>
    <link href="CSS/styleErreur.css" rel="stylesheet"/>

  </head>
  
  <body>
  	<div class="vertical-center">
    	<div class="container">
			<%@ include file="header.jsp" %>
      		<div class="row">
      			<div class="col-lg-6 align-self-center col-lg-offset-3"> 
      			   	<div class="text-center">
      			     <p> Impossible d'afficher la page que vous demandez.</p> </br>
						<a href="index.jsp" class="btn btn-info">Revenir à la page d'accueil</a>
					</div>
				</div>
			</div>
			<%@ include file="footer.jsp" %>
		</div>
    </div>
  </body>
</html>