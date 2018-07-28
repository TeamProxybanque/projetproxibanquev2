package fr.gtm.projetproxibanquev2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.domaine.Client;
import fr.gtm.projetproxibanquev2.domaine.CompteCourant;

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
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proxibanquesgbd", "root", "");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM client WHERE id = " + id + ";");
			System.out.println(rs);
			Client client = new Client();
			
			if(rs.next())
			{
				client.setId(id);
				client.setNom(rs.getString("nom"));
				client.setPrenom(rs.getString("prenom"));
				client.setEmail(rs.getString("email"));
				client.setAdresse(rs.getString("adresse"));
				//on recupere les comptes associes au clientEncours
				client.setCompteCourant(new CompteCourantDAO().getCompteCourantByClientId(id));
				client.setCompteEpargne(new CompteEpargneDAO().getCompteEpargneByClientId(id));	
				System.out.println(client);
				return client;
			}

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
				Client clientEncours = new Client();
				//Le client prend chaque donnees de la reponse : 
				clientEncours.setId(rs.getInt("id"));
				clientEncours.setNom(rs.getString("nom"));
				clientEncours.setPrenom(rs.getString("prenom"));
				clientEncours.setEmail(rs.getString("email"));
				clientEncours.setAdresse(rs.getString("adresse"));
				//on r�cup�re les comptes associes au clientEncours
				clientEncours.setCompteCourant(new CompteCourantDAO().getCompteCourantByClientId(clientEncours.getId()));
				clientEncours.setCompteEpargne(new CompteEpargneDAO().getCompteEpargneByClientId(clientEncours.getId()));				
				
				
				listeClient.add(clientEncours);
			}
			System.out.println(listeClient);
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
