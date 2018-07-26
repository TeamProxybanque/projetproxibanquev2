package fr.gtm.projetproxibanquev2.domaine;

public abstract class Compte {
	
	private int id;
	private String numeroDeCompte;
	private double solde;
	
	
	@Override
	public String toString() {
		return "ID=" + id + ", numeroDeCompte=" + numeroDeCompte + ", solde=" + solde + "";
	}


	public Compte(int id, String numeroDeCompte, double solde) {
		super();
		this.id = id;
		this.numeroDeCompte = numeroDeCompte;
		this.solde = solde;
	}
	
	public Compte() {

	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNumeroDeCompte() {
		return numeroDeCompte;
	}


	public void setNumeroDeCompte(String numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}


	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	

}
