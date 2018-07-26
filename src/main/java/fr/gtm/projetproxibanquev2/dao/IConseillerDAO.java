package fr.gtm.projetproxibanquev2.dao;

import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.domaine.Conseiller;

public interface IConseillerDAO {
	
	void createConseiller(Conseiller conseiller);

	void updateConseiller(Conseiller conseiller);

	Conseiller getConseillerById(int id);

	void deleteConseiller(Conseiller conseiller);

	ArrayList<Conseiller> getAllConseiller();

}
