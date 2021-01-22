package servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimaServlet
 */
// qui decido quale URL devo digitare nel browser per raggiungere questa classe (servlet)
@WebServlet("/PrimaServlet")
public class PrimaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimaServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    // doGet è il metodo che verrà eseguito se la richiesta dal browser è di tipo "GET"
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// nel metodo sono disponibili due oggetti che vengono dai parametri del metodo
		// - request: la richiesta che arriva dal browser
		// - response: la risposta che questo programma darà al browser
		for(int i = 0; i < 20; i++) {
			response.getWriter().println("<h1>" + i + ". " + new Date().toString() + "</h1>");
		}
	}

}
