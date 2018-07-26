package fr.gtm.projetproxibanquev2.service;

import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.domaine.CompteEpargne;

public interface ICompteEpargneService {
	
	void creerCompteEpargne(CompteEpargne compteEpargne);

	void modifierCompteEpargne(CompteEpargne compteEpargne);

	CompteEpargne recupererCompteEpargneById(int id);

	void supprimerCompteEpargne(CompteEpargne compteEpargne);

	ArrayList<CompteEpargne> recupererListeCompteEpargne();

}
