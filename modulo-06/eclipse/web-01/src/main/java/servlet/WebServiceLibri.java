package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Libro;
import util.JpaUtilSingleton;

/**
 * Servlet implementation class WebServiceLibri
 */
@WebServlet("/ws/libri")
public class WebServiceLibri extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WebServiceLibri() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var em = JpaUtilSingleton.getInstance().getEntityManager();
		var libri = em.createQuery("select l from Libro l", Libro.class).getResultList();
		for(var l : libri) {
			response.getWriter().append(l.toString() + "\n");
		}
	}

}
