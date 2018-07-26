package fr.gtm.projetproxibanquev2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.domaine.CompteCourant;
import fr.gtm.projetproxibanquev2.domaine.CompteEpargne;

public class CompteEpargneDAO implements ICompteEpargneDAO {

	@Override
	public void createCompteEpargne(CompteEpargne compteEpargne) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCompteEpargne(CompteEpargne compteEpargne) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CompteEpargne getCompteEpargneById(int id) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proxibanquesgbd", "root", "");
			
			Statement stmt = con.createStatement();
			
			String requete = "SELECT * FROM compteepargne WHERE id = " + id + ";";
			// System.out.println(requete);
			
			ResultSet rs = stmt.executeQuery(requete);
			
			CompteEpargne compteEpargne = new CompteEpargne();
			
			rs.next();
			compteEpargne.setId(rs.getInt("id"));
			compteEpargne.setNumeroDeCompte(rs.getString("numeroDeCompte"));
			compteEpargne.setSolde(rs.getDouble("solde"));
			
			
			con.close();
			// System.out.println(compteEpargne);
			return compteEpargne;
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

	@Override
	public void deleteCompteEpargne(CompteEpargne compteEpargne) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<CompteEpargne> getAllCompteEpargne() {
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proxibanquesgbd", "root", "");
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM compteepargne;");
			
			ArrayList<CompteEpargne> listeCE = new ArrayList<CompteEpargne>();
			
			while(rs.next())
			{
				listeCE.add(new CompteEpargne(rs.getInt("id"), rs.getString("numeroDeCompte"), rs.getDouble("solde")));
			}
			
			return listeCE;
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
