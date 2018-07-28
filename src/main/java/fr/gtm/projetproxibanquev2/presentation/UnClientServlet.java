package fr.gtm.projetproxibanquev2.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.gtm.projetproxibanquev2.domaine.Client;
import fr.gtm.projetproxibanquev2.service.ClientService;

/**
 * Servlet effectuant la mise en session d'un client et le renvoi vers la page
 * detailClient.jsp 
 * 
 * @author Severin
 */

@WebServlet("/UnClientServlet")
public class UnClientServlet extends HttpServlet {
	private static final long serialVersionUID = 6530913586597886287L;

	public UnClientServlet() {
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

		// On recuper l'id du client a afficher en detail
		// Donc on recupere les infos envoye par l'URL ?id=
		// int idClient = Integer.parseInt(request.getParameter("id"));
		String idString = request.getParameter("id");
		int idClient = Integer.parseInt(idString);
		
		// On cree l'objet client correspondant a cet id
		ClientService clientService = new ClientService();
		Client client = clientService.recupererClientById(idClient);
		
		// On met ce client dans la session
		HttpSession session = request.getSession();
		session.setAttribute("client", client);
		
		// On renvoi vers la page detailClient.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("detailClient.jsp");
		dispatcher.forward(request, response);
		
	}

}
