package fr.gtm.projetproxibanquev2.domaine;

import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.domaine.Client;

public class Conseiller extends Utilisateur {
	
	private ArrayList<Client> listeClientsConseiller;
	
	public Conseiller() {
		
	}

	public Conseiller(int id, String nom, String prenom, String login, String password) {
		super(id, nom, prenom, login, password);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Client> getListeClientsConseiller() {
		return listeClientsConseiller;
	}

	public void setListeClientsConseiller(ArrayList<Client> listeClientsConseiller) {
		this.listeClientsConseiller = listeClientsConseiller;
	}

	public Conseiller(int id, String nom, String prenom, String login, String password,
			ArrayList<Client> listeClientsConseiller) {
		super(id, nom, prenom, login, password);
		this.listeClientsConseiller = listeClientsConseiller;
	}
	
	

}
