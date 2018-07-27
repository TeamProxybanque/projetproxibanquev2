package fr.gtm.projetproxibanquev2.dao;

import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.domaine.CompteCourant;

public interface ICompteCourantDAO {
	
	void createCompteCourant(CompteCourant compteCourant);

	void updateCompteCourant(CompteCourant compteCourant);

	CompteCourant getCompteCourantById(int id);

	void deleteCompteCourant(CompteCourant compteCourant);

	ArrayList<CompteCourant> getAllCompteCourant();


}
