package fr.gtm.projetproxibanquev2.dao;

import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.domaine.CompteEpargne;

public interface ICompteEpargneDAO {
	
	void createCompteEpargne(CompteEpargne compteEpargne);

	void updateCompteEpargne(CompteEpargne compteEpargne);

	CompteEpargne getCompteEpargneById(int id);

	void deleteCompteEpargne(CompteEpargne compteEpargne);

	ArrayList<CompteEpargne> getAllCompteEpargne();

}
