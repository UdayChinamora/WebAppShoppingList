package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListItem;

/**
 * Servlet implementation class addServlet
 */
@WebServlet("/addItemServlet")
public class addItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public addItemServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String store = request.getParameter("store");
		String item = request.getParameter("item");
		if (store.isEmpty() || item.isEmpty() || store == null || item == null) {
			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		} else {
			ListItem li = new ListItem(store, item);
			ListItemHelper dao = new ListItemHelper();
			dao.insertItem(li);

			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		}
	}

}

