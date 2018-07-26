package fr.gtm.projetproxibanquev2.service;

import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.dao.IVirementDAO;
import fr.gtm.projetproxibanquev2.dao.VirementDAO;
import fr.gtm.projetproxibanquev2.domaine.Virement;

public class VirementService implements IVirementService {
	
	VirementDAO virementDAO = new VirementDAO();

	@Override
	public void creerVirement(Virement virement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierVirement(Virement virement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Virement recupererVirementById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerVirement(Virement virement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Virement> recupererListeAllVirement() {
		
		return virementDAO.getAllVirement();
	}

}
