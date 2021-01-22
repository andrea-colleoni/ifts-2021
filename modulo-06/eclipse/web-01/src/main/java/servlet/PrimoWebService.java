package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Persona;

/**
 * Servlet implementation class PrimoWebService
 */
@WebServlet("/ws/primo")
public class PrimoWebService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimoWebService() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Persona p = new Persona();
		p.setNome("Andrea");
		p.setCognome("Colleoni");
		p.setEmail("andrea@colleoni.info");
		
		response.getWriter().append(p.toString());
	}

}
