package fr.gtm.projetproxibanquev2.service;

import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.dao.ClientDAO;
import fr.gtm.projetproxibanquev2.domaine.Client;

public class ClientService implements IClientService {
	
	ClientDAO clientDAO = new ClientDAO();

	@Override
	public void creerClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client recupererClientById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Client> recupererListeClient() {
		// TODO Auto-generated method stub
		return null;
	}

}
