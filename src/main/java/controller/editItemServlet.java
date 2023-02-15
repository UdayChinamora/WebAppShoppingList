package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListItem;

/**
 * Servlet implementation class editItemServlet
 */
@WebServlet("/editItemServlet")
public class editItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public editItemServlet() {
        super();
    }
    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ListItemHelper dao = new ListItemHelper();

		String store = request.getParameter("store");
		String item = request.getParameter("item");
		Integer tempId = Integer.parseInt(request.getParameter("id"));

		ListItem itemToUpdate = dao.searchForItemById(tempId);
		itemToUpdate.setItem(item);
		itemToUpdate.setStore(store);

		dao.updateItem(itemToUpdate);

		getServletContext().getRequestDispatcher("/ViewAllItemsServlet").forward(request, response);

}
}