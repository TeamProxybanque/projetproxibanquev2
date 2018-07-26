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
		
		boolean mettreAJour = false;
		
		if (client.getId() == client.getConseiller().getId()) 
		{
			clientDAO.updateClient(client);
			mettreAJour = true;
		}
		
		
		return mettreAJour;
		
	}
	
	public ArrayList<Client> recupererListeClients() {
		
		
		return clientDAO.getAllClient();
	}
	
	public void listerCompteClient (Client client) {
		// Attention! Avec ArrayList - ne pas possible. Changer UML diagramme de class
		System.out.println(ccDAO.getCompteCourantById(client.getCompteCourant().getId()));
		System.out.println(ceDAO.getCompteEpargneById(client.getCompteEpargne().getId()));
		
	}

}
