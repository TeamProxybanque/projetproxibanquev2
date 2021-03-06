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

import fr.gtm.projetproxibanquev2.domaine.Client;
import fr.gtm.projetproxibanquev2.domaine.Conseiller;
import fr.gtm.projetproxibanquev2.domaine.Gerant;
import fr.gtm.projetproxibanquev2.service.ConnexionService;
import fr.gtm.projetproxibanquev2.service.ConseillerService;
/**
 * Servlet permettant la connexion d'un conseiller ou d'un gerant
 * 
 * @author Severin
 *
 */
@WebServlet("/servletLogIn")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = -7277669181055215235L;

	public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		traitement(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		traitement(request, response);
	}

	/**
	 * Methode traitement qui va traiter les requetes HTTP et notamment recuperer le login et mot de passe d'une page JSP pour le rediriger
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void traitement(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("connexionRefusee.jsp");;		
		HttpSession maSession = request.getSession();
		
		// on recupere les info envoye par le formulaire
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		// on authentifie l'utilisateur avec la classe ConnexionService
		// et on met le gerant/conseiller en session
		// et on redispatche l'internaute vers la page qui va bien
		ConnexionService connexionService = new ConnexionService();	
		Gerant gerant = connexionService.verifSiGerant(login, password);
		Conseiller conseiller = connexionService.verifSiConseiller(login, password);
		
		// si login/password correspond a gerant
		if ( gerant != null ) {
			maSession.setAttribute("gerant", gerant);
			dispatcher = request.getRequestDispatcher("listeVirements");

		// si login/password correspond a conseiller
		} else if ( conseiller != null ) {
			maSession.setAttribute("conseiller", conseiller);
			// recuperer liste client (temporaire)
			ConseillerService conseillerService = new ConseillerService();
			ArrayList<Client> clients = conseillerService.recupererListeClients();
			// mettre la liste client en session
			maSession.setAttribute("listeClients", clients);
			// dispatcher vers la jsp listeClient.jsp
			dispatcher = request.getRequestDispatcher("listeClients.jsp");
		}	
		// si login/password correspond a rien, dispatcher reste a� connexionRefusee.jsp
		
		// renvoie vers une des trois directions
		dispatcher.forward(request, response);
		
		
	}

}
