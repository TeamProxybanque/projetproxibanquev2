<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="fr" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Liste des clients du conseiller</title>
  </head>
  <body>
    <!--inclure le header-->
    <h1>Liste de vos clients : </h1>
    <table>
      <thead>
        <tr>
          <th>Nom</th>
          <th>Prénom</th>
          <th>N° compte épargne</th>
          <th colspan="2">Solde compte épargne</th>
          <th>N° compte courant</th>
          <th colspan="2">Solde compte courant</th>
          <th>Voir plus</th>
        </tr>
      </thead>
      <tbody>
      <!-- Le tableau ci-dessous dera créé dynamiquement à partir des données reçues de la bdd -->
        <tr>
          <td>Exemple Nom 1</td>
          <td>Exemple Prénom 1</td>
          <td>18457A</td>
          <td>50000</td>
          <td>€</td>
          <td>45621E</td>
          <td >1544</td>
          <td>€</td>
          <td><a href=detailClient.jsp>Voir plus</a></td>
        </tr>
        <tr>
          <td>Exemple Nom 2</td>
          <td>Exemple Prénom 2</td>
          <td>99999A</td>
          <td>50000</td>
          <td>€</td>
          <td>101111E</td>
          <td >1544</td>
          <td>€</td>
          <td><a href=detailClient.jsp>Voir plus</a></td>
        </tr>
      </tbody>
    </table>
    
    <a href="index.html">Se déconnecter</a> <!-- Le déconnexion mènera vers la servlet déconnexion  -->




    <!-- inclure le footer-->
  </body>
</html>
