package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.Libro;
import util.JpaUtilSingleton;

@WebServlet("/LibriServlet")
public class LibriServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LibriServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var em = JpaUtilSingleton.getInstance().getEntityManager();
		var libri = em.createQuery("select l from Libro l", Libro.class).getResultList();
		// utilizzo l'objectmapper di jackson databind per trasformare in JSON la lista di libri
		var om = new ObjectMapper();
		// devo impostare il content type per far capire al client che gli sto inviando del JSON
		response.setContentType("application/json");
		response.getWriter().append(om.writeValueAsString(libri));
		// chiudo l'entity manager
		em.close();
	}

}
