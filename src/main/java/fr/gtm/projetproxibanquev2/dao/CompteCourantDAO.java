package fr.gtm.projetproxibanquev2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.domaine.Client;
import fr.gtm.projetproxibanquev2.domaine.CompteCourant;

public class CompteCourantDAO implements ICompteCourantDAO {

	@Override
	public void createCompteCourant(CompteCourant compteCourant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCompteCourant(CompteCourant compteCourant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CompteCourant getCompteCourantById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCompteCourant(CompteCourant compteCourant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<CompteCourant> getAllCompteCourant() {
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proxibanquesgbd", "root", "");
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM comptecourant;");
			
			ArrayList<CompteCourant> listeCC = new ArrayList<CompteCourant>();
			
			while(rs.next())
			{
				listeCC.add(new CompteCourant(rs.getInt("id"), rs.getString("numeroDeCompte"), rs.getDouble("solde")));
			}
			
			return listeCC;
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
