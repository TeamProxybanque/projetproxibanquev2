package fr.gtm.projetproxibanquev2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.domaine.Conseiller;

// @author severin
// J'ai fait a l'ancienne mais
// Cette classe dao devra etre optimisee
public class ConseillerDAO implements IConseillerDAO {
	
	// parametre de connexion a la base de donnee
	String url = "jdbc:mysql://localhost/proxibanquesgbd?autoReconnect=true&useSSL=false";
	String user = "root";
	String password = "";

	@Override
	public void createConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Conseiller getConseillerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Conseiller> getAllConseiller() {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = "";
		ArrayList<Conseiller> conseillers = new ArrayList<Conseiller>();

		try {

			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			// Etape 2 : creation d'une connexion
			connection = DriverManager.getConnection(url, user, password);

			// Etape 3 : Preparer la requete
			// table conseiller = id | nom     | prenom  | login  | password
			statement = connection.createStatement();
			sql = "SELECT * FROM conseiller";
			System.out.println(sql);

			// Etape 4 : execution requete
			// pour les insert, update, delete :
			// statement.executeUpdate(sql);
			// pour les select :
			resultSet = statement.executeQuery(sql);

			// Etape 5 : si resultSet, recuperation des donnees			
			while (resultSet.next()) {
				 conseillers.add(new Conseiller(
						 resultSet.getInt("id"), 
						 resultSet.getString("nom"), 
						 resultSet.getString("prenom"), 
						 resultSet.getString("login"), 
						 resultSet.getString("password")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (statement != null)
					statement.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// renvoyer la liste d'objet cree
		return conseillers;
	}

}
