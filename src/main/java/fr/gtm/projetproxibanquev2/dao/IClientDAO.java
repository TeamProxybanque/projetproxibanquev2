package fr.gtm.projetproxibanquev2.dao;

import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.domaine.Client;

public interface IClientDAO {

	void createClient(Client client);

	void updateClient(Client client);

	Client getClientById(int id);

	void deleteClient(Client client);

	ArrayList<Client> getAllClient();

}