package fr.gtm.projetproxibanquev2.domaine;

import java.time.LocalDate;

public class Virement {
	
	private int id;
	private LocalDate dateVirement;
	private String numeroCompteDebiteur;
	private String numeroCompteCrediteur;
	private double montant;
	
	@Override
	public String toString() {
		return "ID=" + id + ", dateVirement=" + dateVirement + ", numeroCompteDebiteur="
				+ numeroCompteDebiteur + ", numeroCompteCrediteur=" + numeroCompteCrediteur + ", montant=" + montant
				+ "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDateVirement() {
		return dateVirement;
	}

	public void setDateVirement(LocalDate dateVirement) {
		this.dateVirement = dateVirement;
	}

	public String getNumeroCompteDebiteur() {
		return numeroCompteDebiteur;
	}

	public void setNumeroCompteDebiteur(String numeroCompteDebiteur) {
		this.numeroCompteDebiteur = numeroCompteDebiteur;
	}

	public String getNumeroCompteCrediteur() {
		return numeroCompteCrediteur;
	}

	public void setNumeroCompteCrediteur(String numeroCompteCrediteur) {
		this.numeroCompteCrediteur = numeroCompteCrediteur;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Virement(int id, LocalDate dateVirement, String numeroCompteDebiteur, String numeroCompteCrediteur,
			double montant) {
		super();
		this.id = id;
		this.dateVirement = dateVirement;
		this.numeroCompteDebiteur = numeroCompteDebiteur;
		this.numeroCompteCrediteur = numeroCompteCrediteur;
		this.montant = montant;
	}

	public Virement(LocalDate dateVirement, String numeroCompteDebiteur, String numeroCompteCrediteur, double montant) {
		super();
		this.dateVirement = dateVirement;
		this.numeroCompteDebiteur = numeroCompteDebiteur;
		this.numeroCompteCrediteur = numeroCompteCrediteur;
		this.montant = montant;
	}

	public Virement() {
		
	}
	
	
	
	

}
