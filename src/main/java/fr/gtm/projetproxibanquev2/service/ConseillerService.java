package fr.gtm.projetproxibanquev2.service;

import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.dao.ClientDAO;
import fr.gtm.projetproxibanquev2.dao.CompteCourantDAO;
import fr.gtm.projetproxibanquev2.dao.CompteEpargneDAO;
import fr.gtm.projetproxibanquev2.dao.ConseillerDAO;
import fr.gtm.projetproxibanquev2.domaine.Client;
import fr.gtm.projetproxibanquev2.domaine.Compte;
import fr.gtm.projetproxibanquev2.domaine.CompteCourant;
import fr.gtm.projetproxibanquev2.domaine.CompteEpargne;
import fr.gtm.projetproxibanquev2.domaine.Conseiller;

public class ConseillerService implements IConseillerService {
	
	ConseillerDAO conseillerDAO = new ConseillerDAO();
	ClientDAO clientDAO = new ClientDAO();
	CompteCourantDAO ccDAO = new CompteCourantDAO();
	CompteEpargneDAO ceDAO = new CompteEpargneDAO();

	@Override
	public void creerConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Conseiller recupererConseillerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Conseiller> recupererListeAllConseiller() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean mettreAJourClient(Client client) {
	// TODO	Mettre a jour le client en DB
		boolean mettreAJour = false;
		
		if (client.getId() == client.getConseiller().getId()) 
			/**
			 * C
			 */
			
		{
			clientDAO.updateClient(client);
			mettreAJour = true;
		}
		
		
		return mettreAJour;
		
	}
	/**
	 * Méthode permettant à une entité Conseiller de récupérer la liste des clients
	 * @return
	 */
	public ArrayList<Client> recupererListeClients() {
		// TODO Tous cliens de BD 
		
		return clientDAO.getAllClient();
	}
	
	/**
	 * Methode permettant à une entité Conseiller de récupérer la liste des comptes associé à un client
	 * @param client
	 */
	public void listerCompteClient (Client client) {
		// TODO 2 comptes pour le client: compte courant et compte epargne 
 
		System.out.println(ccDAO.getCompteCourantById(client.getCompteCourant().getId()));
		System.out.println(ceDAO.getCompteEpargneById(client.getCompteEpargne().getId()));
		
	}

}
