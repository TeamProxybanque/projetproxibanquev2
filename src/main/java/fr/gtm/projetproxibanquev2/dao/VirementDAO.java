package fr.gtm.projetproxibanquev2.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import fr.gtm.projetproxibanquev2.domaine.Virement;

public class VirementDAO implements IVirementDAO {
	private Connection connect = null;
	private Statement statement = null;
	private Virement virement = null;

	@Override
	public void createVirement(Virement virement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateVirement(Virement virement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Virement getVirementById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteVirement(Virement virement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Virement> getAllVirement() {
		ArrayList<Virement> listeVirements = new ArrayList<Virement>();
		virement = new Virement();
		// ouvrir la connection
		connect = new ConnectDao().ouvrirConnectionBdd();

		try {
			// preparer la requete (statement)
			statement = connect.createStatement();
			// executer la requete
			String requeteSql = "SELECT * FROM `virement`";
			// System.out.println(requeteSql);

			// r�cup du r�sultat
			ResultSet res = statement.executeQuery(requeteSql);
			// parcours du r�sultat

			while (res.next()) {
				Virement virementEnCours = new Virement();
				virementEnCours.setId(res.getInt("id"));
				 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				 LocalDate dateV = LocalDate.parse(res.getString("dateVirement"), formatter);
				
				virementEnCours.setDateVirement(dateV);
							
				virementEnCours.setNumeroCompteDebiteur(res.getString("numeroCompteDebiteur"));
				virementEnCours.setNumeroCompteCrediteur(res.getString("numeroCompteCrediteur"));
				virementEnCours.setMontant(res.getDouble("montant"));
				
				// ajout a la liste
				listeVirements.add(virementEnCours);
			

			}

		} catch (SQLException e) {

			System.out.println("SQL exception : " + e);
			
		} finally {
			// fermer la connection et le statement
			//new ConnectDao().fermerConnectionEtStatement(connect, statement);
		}
		System.out.println("depuis dao" + listeVirements);
		return listeVirements;
	}

}
