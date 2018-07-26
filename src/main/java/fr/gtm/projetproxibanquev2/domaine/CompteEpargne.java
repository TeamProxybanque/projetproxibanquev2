package fr.gtm.projetproxibanquev2.domaine;

public class CompteEpargne extends Compte {
	
	public CompteEpargne(int id, String numeroDeCompte, double solde, Client client) {
		super(id, numeroDeCompte, solde);
		this.client = client;
	}

	private Client client;

	public CompteEpargne(int id, String numeroDeCompte, double solde) {
		super(id, numeroDeCompte, solde);
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne() {
		// TODO Auto-generated constructor stub
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	

}
