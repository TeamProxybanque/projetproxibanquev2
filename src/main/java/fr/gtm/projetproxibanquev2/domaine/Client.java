package fr.gtm.projetproxibanquev2.domaine;

public class Client {
	
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	
	private Conseiller conseiller;
	private CompteCourant compteCourant;
	private CompteEpargne compteEpargne;
	
	@Override
	public String toString() {
		return "ID=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", adresse=" + adresse
				+ "";
	}


	public Client(int id, String nom, String prenom, String email, String adresse, Conseiller conseiller,
			CompteCourant compteCourant, CompteEpargne compteEpargne) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.conseiller = conseiller;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
	}


	public Client(String nom, String prenom, String email, String adresse, Conseiller conseiller,
			CompteCourant compteCourant, CompteEpargne compteEpargne) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.conseiller = conseiller;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
	}


	public Client(int id, String nom, String prenom, String email, String adresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
	}
	
	public Client() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public Conseiller getConseiller() {
		return conseiller;
	}


	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}


	public CompteCourant getCompteCourant() {
		return compteCourant;
	}


	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}


	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}


	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}
	
	
	

}
