package fr.gtm.projetproxibanquev2.dao;

import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.domaine.Virement;

public interface IVirementDAO {
	
	void createVirement(Virement virement);

	void updateVirement(Virement virement);

	Virement getVirementById(int id);

	void deleteVirement(Virement virement);

	ArrayList<Virement> getAllVirement();

}
