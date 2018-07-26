package fr.gtm.projetproxibanquev2.domaine;

public class CompteCourant extends Compte {
	
	private Client client;

	public CompteCourant(int id, String numeroDeCompte, double solde) {
		super(id, numeroDeCompte, solde);
		// TODO Auto-generated constructor stub
	}

	public CompteCourant() {
		// TODO Auto-generated constructor stub
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	

}
