package fr.gtm.projetproxibanquev2.service;

import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.dao.GerantDAO;
import fr.gtm.projetproxibanquev2.domaine.Gerant;

public class GerantService implements IGerantService {
	
	GerantDAO gerantDAO = new GerantDAO();

	@Override
	public void creerGerant(Gerant gerant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierGerant(Gerant gerant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Gerant recupererGerantById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerGerant(Gerant gerant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Gerant> recupererListeAllGerant() {
		// TODO Auto-generated method stub
		return null;
	}

}
