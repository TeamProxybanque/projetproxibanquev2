package fr.gtm.projetproxibanquev2.dao;

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
		
		ArrayList<Client> listeClient = new ArrayList<Client>();
		return listeClient; 
		
	}
	
}
