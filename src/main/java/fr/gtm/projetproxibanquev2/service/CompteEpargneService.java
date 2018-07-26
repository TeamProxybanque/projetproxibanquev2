package fr.gtm.projetproxibanquev2.service;

import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.dao.CompteEpargneDAO;
import fr.gtm.projetproxibanquev2.domaine.CompteEpargne;

public class CompteEpargneService implements ICompteEpargneService {
	
	CompteEpargneDAO compteEpargneDAO = new CompteEpargneDAO();

	@Override
	public void creerCompteEpargne(CompteEpargne compteEpargne) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierCompteEpargne(CompteEpargne compteEpargne) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CompteEpargne recupererCompteEpargneById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerCompteEpargne(CompteEpargne compteEpargne) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<CompteEpargne> recupererListeCompteEpargne() {
		// TODO Auto-generated method stub
		return null;
	}

}
