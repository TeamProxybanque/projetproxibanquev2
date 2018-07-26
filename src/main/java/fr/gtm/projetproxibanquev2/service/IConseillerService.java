package fr.gtm.projetproxibanquev2.service;

import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.domaine.Conseiller;

public interface IConseillerService {
	
	void creerConseiller(Conseiller conseiller);

	void modifierConseiller(Conseiller conseiller);

	Conseiller recupererConseillerById(int id);

	void supprimerConseiller(Conseiller conseiller);

	ArrayList<Conseiller> recupererListeAllConseiller();

}
