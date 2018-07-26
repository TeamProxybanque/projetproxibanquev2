package fr.gtm.projetproxibanquev2.presentation;

import fr.gtm.projetproxibanquev2.dao.VirementDAO;

public class TestLanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----");

		VirementDAO virDaoTest = new VirementDAO();
		virDaoTest.getAllVirement();
		
	}

}
