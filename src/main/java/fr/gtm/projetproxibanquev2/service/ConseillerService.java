package fr.gtm.projetproxibanquev2.service;

import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.dao.ConseillerDAO;
import fr.gtm.projetproxibanquev2.domaine.Conseiller;

public class ConseillerService implements IConseillerService {
	
	ConseillerDAO conseillerDAO = new ConseillerDAO();

	@Override
	public void creerConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Conseiller recupererConseillerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Conseiller> recupererListeAllConseiller() {
		// TODO Auto-generated method stub
		return null;
	}

}
