package fr.gtm.projetproxibanquev2.service;

import fr.gtm.projetproxibanquev2.dao.ClientDAO;
import fr.gtm.projetproxibanquev2.domaine.Client;

import java.util.ArrayList;


public interface IClientService {
	
	void creerClient(Client client);

	void modifierClient(Client client);

	Client recupererClientById(int id);

	void supprimerClient(Client client);

	ArrayList<Client> recupererListeClient();

}
