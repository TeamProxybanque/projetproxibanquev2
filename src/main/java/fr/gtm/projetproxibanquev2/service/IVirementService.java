package fr.gtm.projetproxibanquev2.service;

import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.domaine.Virement;

public interface IVirementService {
	
	void creerVirement(Virement virement);

	void modifierVirement(Virement virement);

	Virement recupererVirementById(int id);

	void supprimerVirement(Virement virement);

	ArrayList<Virement> recupererListeAllVirement();

}
