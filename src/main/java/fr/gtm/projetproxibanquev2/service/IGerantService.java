package fr.gtm.projetproxibanquev2.service;

import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.domaine.Gerant;

public interface IGerantService {
	
	void creerGerant(Gerant gerant);

	void modifierGerant(Gerant gerant);

	Gerant recupererGerantById(int id);

	void supprimerGerant(Gerant gerant);

	ArrayList<Gerant> recupererListeAllGerant();

}
