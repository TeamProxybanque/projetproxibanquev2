package fr.gtm.projetproxibanquev2.presentation;

import fr.gtm.projetproxibanquev2.domaine.Client;
import fr.gtm.projetproxibanquev2.domaine.CompteCourant;
import fr.gtm.projetproxibanquev2.domaine.CompteEpargne;
import fr.gtm.projetproxibanquev2.domaine.Conseiller;
import fr.gtm.projetproxibanquev2.service.ConseillerService;

public class TestLanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		Conseiller conseiller1 = new Conseiller(1, "n", "p", "l", "p");
		CompteCourant compteCourant1 = new CompteCourant ();
		CompteEpargne compteEpargne1 = new CompteEpargne ();
		ConseillerService service1 = new ConseillerService ();
		Client client1 = new Client (1, "nnngggggg", "ppp", "@", "ad", conseiller1, compteCourant1, compteEpargne1);
		// System.out.println(client1);
		// service1.mettreAJourClient(client1);
		// System.out.println (service1.recupererListeClients());
		System.out.println (service1.listerCompteClient(client1));

	}

}
