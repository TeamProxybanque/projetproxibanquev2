<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- On fait appel au fichiers CSS et Bootstrap-->
<link href="Bootstrap/css/bootstrap.css" rel="stylesheet" />
<link href="CSS/styleIndex.css" rel="stylesheet" />
<!-- On fait appel au fichiers JavaScript -->
<script type="text/javascript" src="JavaScript/indexJavaScript.js"></script>
</head>

<body>

	<div class="vertical-center">

		<div class="container">

			<%@ include file="header.jsp"%>

			<div class="row">

				<section>
					<table  class="table table-striped table-dark">
						<tr>
							<th>Date</th>
							<th>Compte débité</th>
							<th>Compte crédité</th>
							<th>Montant</th>
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

			<%@ include file="footer.jsp"%>

		</div>

	</div>

</body>
</html>