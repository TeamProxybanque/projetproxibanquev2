package fr.gtm.projetproxibanquev2.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.gtm.projetproxibanquev2.domaine.Conseiller;
import fr.gtm.projetproxibanquev2.domaine.Gerant;
import fr.gtm.projetproxibanquev2.service.ConnexionService;

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

	protected void traitement(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher;		
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
		if ( gerant != null ) {
			System.out.println(gerant);
			maSession.setAttribute("gerant", gerant);
			dispatcher = request.getRequestDispatcher("listeVirements");
		} else if ( conseiller != null ) {
			System.out.println(conseiller);
			maSession.setAttribute("conseiller", conseiller);
			dispatcher = request.getRequestDispatcher("listeClients.jsp");
		} else {
			dispatcher = request.getRequestDispatcher("erreurPage.jsp");
		}
		dispatcher.forward(request, response);
		
		
	}

}
