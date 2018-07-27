package projetproxibanquev2;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.gtm.projetproxibanquev2.domaine.Client;
import fr.gtm.projetproxibanquev2.domaine.CompteCourant;
import fr.gtm.projetproxibanquev2.domaine.CompteEpargne;
import fr.gtm.projetproxibanquev2.domaine.Conseiller;
import fr.gtm.projetproxibanquev2.service.ConseillerService;

public class TestModification {
	
	Conseiller conseiller1;
	ConseillerService service1;
	CompteCourant compteCourant1;
	CompteEpargne compteEpargne1;
	Client client1;
	
	
	@BeforeEach
	void init() {
		
	}
	
	@Test
	void testModifExist(){
		//fail("Echec de la méthode testModifExist");
		Conseiller conseiller1 = new Conseiller(1, "n", "p", "l", "p");
		ConseillerService service1 = new ConseillerService ();
		CompteCourant compteCourant1 = new CompteCourant (1, "6666", 500);
		CompteEpargne compteEpargne1 = new CompteEpargne (1, "7777", 800);
		Client client1 = new Client (1, "marx11", "kim", "@", "ad", conseiller1, compteCourant1, compteEpargne1);
		service1.mettreAJourClient(client1);
		assertTrue("modif", client1.getId() > 0);
		
	}
	
	@Test
	void testModifID(){
		//fail("Echec de la méthode testModifID");
		Conseiller conseiller1 = new Conseiller(1, "n", "p", "l", "p");
		ConseillerService service1 = new ConseillerService ();
		CompteCourant compteCourant1 = new CompteCourant (1, "6666", 500);
		CompteEpargne compteEpargne1 = new CompteEpargne (1, "7777", 800);
		Client client1 = new Client (1, "smith", "john", "@", "ad", conseiller1, compteCourant1, compteEpargne1);
		
		service1.mettreAJourClient(client1);
		
		assertEquals(1, client1.getId());
	}
	
	
	@Test
	void testModifNom(){
	
		
	}

}
