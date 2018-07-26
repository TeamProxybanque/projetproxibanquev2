package fr.gtm.projetproxibanquev2.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDao {

	private String url = "jdbc:mysql://localhost/proxibanquesgbd";
	private String login = "root";
	private String passwd = "";

	public Connection ouvrirConnectionBdd() {

		Connection cn = null;

		try {
			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			// Etape 2 : r�cup�ration de la connexion
			cn = DriverManager.getConnection(this.url, this.login, this.passwd);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return cn;
	}

	public void fermerConnectionEtStatement(Connection cn, Statement st) {
		try {
			// Etape 6 : lib�rer ressources de la m�moire.
			cn.close();
			st.close();
			// System.out.println("connection et statement ferm�s.");
		} catch (SQLException e) {
			// TODO: gestion erreur
			e.printStackTrace();
		}
	}

}
