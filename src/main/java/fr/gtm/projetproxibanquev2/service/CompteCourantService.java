package fr.gtm.projetproxibanquev2.service;

import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.dao.CompteCourantDAO;
import fr.gtm.projetproxibanquev2.domaine.CompteCourant;

public class CompteCourantService implements ICompteCourantService {
	
	CompteCourantDAO compteCourantDAO = new CompteCourantDAO();

	@Override
	public void creerCompteCourant(CompteCourant compteCourant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierCompteCourant(CompteCourant compteCourant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CompteCourant recupererCompteCourantById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerCompteCourant(CompteCourant compteCourant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<CompteCourant> recupererListeCompteCourant() {
		// TODO Auto-generated method stub
		return null;
	}

}
