package fr.gtm.projetproxibanquev2.presentation;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.gtm.projetproxibanquev2.domaine.Virement;
import fr.gtm.projetproxibanquev2.service.VirementService;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/listeVirements")
public class ListeVirementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListeVirementServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		traitement(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		traitement(request, response);
	}
	
	protected void traitement(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// Etape 1 : R�cup�ration des donn�es depuis la bdd :
		VirementService virementService = new VirementService();
		ArrayList<Virement> listeVirements = virementService.recupererListeAllVirement();
		//pour debug : 
		//System.out.println("liste vir depuis servlet : " + listeVirements);
	
		
		// Etape 2 : Soumettre les param�tres de la requ�te � la couche service et pr�parer en fonction la r�ponse � envoyer
		RequestDispatcher dispatcher;
		
		/*-------------------
		 * mise en place de la session
		 * ------------------*/
		//cr�ation de la session
		HttpSession maSession = request.getSession();	
		
		//mise en session de l'utilisateur.
		maSession.setAttribute("listeVirements", listeVirements);
	
		
		
		//redirection
		dispatcher = request.getRequestDispatcher("listeVirements.jsp");
		

		// Etape 3 : envoyer la R�ponse � l'utilisateur
		dispatcher.forward(request, response);

	}

}
