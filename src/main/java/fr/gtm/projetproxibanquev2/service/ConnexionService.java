package fr.gtm.projetproxibanquev2.service;

import java.util.ArrayList;

import fr.gtm.projetproxibanquev2.dao.ConseillerDAO;
import fr.gtm.projetproxibanquev2.dao.GerantDAO;
import fr.gtm.projetproxibanquev2.domaine.Conseiller;
import fr.gtm.projetproxibanquev2.domaine.Gerant;

/**
 * @author Severin
 * @version 0.1
 * La classe ConnexionService offre des methodes permettant de verifier
 * que le login et le password corresponde a un gerant, un conseiller, ou rien 
 * 
 * Attention, ces methodes peuvent renvoyer null, et quand c'est le cas pour a la
 * fois le gerant et le conseiller, cela signifie que la connexion a ete refusee
 * 
 */
public class ConnexionService {
	
	/** 
	 * @param login
	 * @param password
	 * @return null si pas de gerant trouve, objet Gerant si trouve
	 */
	public Gerant verifSiGerant(String login, String password) {
		
		// recuperer l'arraylist de gerant
		GerantDAO gerantDao = new GerantDAO();
		ArrayList<Gerant> gerants = gerantDao.getAllGerant();
		Gerant gerantTrouve = null;
		
		// debut du foreach sur l'arraylist de gerant
		for (Gerant gerant : gerants) {
				
		// comparer les logins
			if ( login.equals(gerant.getLogin()) ) {
				
				// si login correspond, comparer le password
				if ( password.equals(gerant.getPassword()) ) {
					gerantTrouve = gerant;
				}
			}
		}
		System.out.println(gerantTrouve);
		return gerantTrouve;
	}
	
	/** 
	 * @param login
	 * @param password
	 * @return null si pas de conseiller trouve, objet Conseiller si trouve
	 */
	public Conseiller verifSiConseiller(String login, String password) {
				
		// recuperer l'arraylist de conseillers
		ConseillerDAO conseillerDao = new ConseillerDAO();
		ArrayList<Conseiller> conseillers = conseillerDao.getAllConseiller();
		Conseiller conseillerTrouve = null;
				
		// debut du foreach sur l'arraylist de conseillers
		for (Conseiller conseiller : conseillers) {
				
		// comparer les logins
			if ( login.equals(conseiller.getLogin()) ) {
				
				// si login correspond, comparer le password
				if ( password.equals(conseiller.getPassword()) ) {
					conseillerTrouve = conseiller;
				}
			}
		}
		return conseillerTrouve;
	}
	
}
