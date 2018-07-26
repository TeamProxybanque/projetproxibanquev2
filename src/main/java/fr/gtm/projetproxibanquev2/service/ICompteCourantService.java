package fr.gtm.projetproxibanquev2.service;

import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.domaine.CompteCourant;

public interface ICompteCourantService {
	
	void creerCompteCourant(CompteCourant compteCourant);

	void modifierCompteCourant(CompteCourant compteCourant);

	CompteCourant recupererCompteCourantById(int id);

	void supprimerCompteCourant(CompteCourant compteCourant);

	ArrayList<CompteCourant> recupererListeCompteCourant();

}
