package fr.gtm.projetproxibanquev2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.domaine.Gerant;

// @author severin
// J'ai fait a l'ancienne mais
// Cette classe dao devra etre optimisee
public class GerantDAO implements IGerantDAO {
	
	// parametre de connexion a la base de donnee
	String url = "jdbc:mysql://localhost/proxibanquesgbd?autoReconnect=true&useSSL=false";
	String user = "root";
	String password = "";

	@Override
	public void createGerant(Gerant gerant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGerant(Gerant gerant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Gerant getGerantById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteGerant(Gerant gerant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Gerant> getAllGerant() {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql = "";
		ArrayList<Gerant> gerants = new ArrayList<Gerant>();

		try {

			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			// Etape 2 : creation d'une connexion
			connection = DriverManager.getConnection(url, user, password);

			// Etape 3 : Preparer la requete
			// table gerant = id | nom    | prenom  | login  | password
			statement = connection.createStatement();
			sql = "SELECT * FROM gerant";
			System.out.println(sql);

			// Etape 4 : execution requete
			// pour les insert, update, delete :
			// statement.executeUpdate(sql);
			// pour les select :
			resultSet = statement.executeQuery(sql);

			// Etape 5 : si resultSet, recuperation des donnees			
			while (resultSet.next()) {
				 gerants.add(new Gerant(
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
		return gerants;
	
	}

}
