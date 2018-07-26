<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- On fait appel au fichiers CSS et Bootstrap-->
    <link href="Bootstrap/css/bootstrap.css" rel="stylesheet"/>
    <link href="CSS/styleIndex.css" rel="stylesheet"/>
  <!-- On fait appel au fichiers JavaScript -->
    <script type="text/javascript" src="JavaScript/indexJavaScript.js"></script>
  </head>

  <body>
  	<div class="vertical-center">
    	<div class="container">
			<header class="row">
 				<div class="col-lg-12">
      				<img id="LogoProxiBanque" class="img-responsive center-block" src="Img/LogoProxibanque.png" alt="Logo ProxiBanque">
  				</div>
			</header>
      		<div class="row">
				<form class="col-lg-4 align-self-center col-lg-offset-4" action="servletLogIn.jsp" method="post">
  					<legend>Identification</legend>
    				<div class="form-group">
      					<label for="texte">LogIn : </label>
      					<input id="text" type="text" class="form-control">
    				</div>
    				<div class="form-group">
     					<label for="texte">Password : </label>
     					<input id="password" type="password" name="password" class="form-control" maxlength="10">
    				</div>
    				<div class="form-group">
    					<input type="submit" value="Submit">
    				</div>
				</form>
			</div>
			<%@ include file="footer.jsp" %>
		</div>
    </div>
  </body>
</html>
