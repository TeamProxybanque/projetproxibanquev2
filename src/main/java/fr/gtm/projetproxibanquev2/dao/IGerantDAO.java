package fr.gtm.projetproxibanquev2.dao;

import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.domaine.Gerant;

public interface IGerantDAO {
	
	void createGerant(Gerant gerant);

	void updateGerant(Gerant gerant);

	Gerant getGerantById(int id);

	void deleteGerant(Gerant gerant);

	ArrayList<Gerant> getAllGerant();

}
