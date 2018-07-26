package fr.gtm.projetproxibanquev2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.domaine.Client;

public class ClientDAO implements IClientDAO {
	
	/* (non-Javadoc)
	 * @see fr.gtm.projetproxibanquev2.dao.IClientDAO#createClient(fr.gtm.projetproxibanquev2.domaine.Client)
	 */
	@Override
	public void createClient(Client client) {
		
	}

	/* (non-Javadoc)
	 * @see fr.gtm.projetproxibanquev2.dao.IClientDAO#updateClient(fr.gtm.projetproxibanquev2.domaine.Client)
	 */
	@Override
	public void updateClient(Client client) {
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proxibanquesgbd", "root", "");
			
			Statement stmt = con.createStatement();	
			
			String requete = "UPDATE client SET nom = '" + client.getNom() + "', prenom = '"  + client.getPrenom() +  "', email = '"  + client.getEmail() + "', adresse = '"  + client.getAdresse() + "' WHERE id = " + client.getId() + ";";
			// System.out.println(requete);
			
			stmt.executeUpdate(requete);
			
			con.close();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
	
	/* (non-Javadoc)
	 * @see fr.gtm.projetproxibanquev2.dao.IClientDAO#getClientById(int)
	 */
	@Override
	public Client getClientById (int id) {
		
		Client client=null;
		return client;
	}
	
	/* (non-Javadoc)
	 * @see fr.gtm.projetproxibanquev2.dao.IClientDAO#deleteClient(fr.gtm.projetproxibanquev2.domaine.Client)
	 */
	@Override
	public void deleteClient (Client client) {
		
	}
	
	/* (non-Javadoc)
	 * @see fr.gtm.projetproxibanquev2.dao.IClientDAO#getAllClient()
	 */
	@Override
	public ArrayList<Client> getAllClient(){
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proxibanquesgbd", "root", "");
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM client;");
			
			ArrayList<Client> listeClient = new ArrayList<Client>();
			
			while(rs.next())
			{
				listeClient.add(new Client(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("email"), rs.getString("adresse")));
			}
			
			return listeClient;
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return null;
		
	}
	
}
