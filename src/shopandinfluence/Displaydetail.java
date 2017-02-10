package shopandinfluence;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Displaydetail
 */
@WebServlet("/Displaydetail")
public class Displaydetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Displaydetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @return 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//String sortby = request.getParameter("sortby");
		 String cid = request.getParameter("Category_id");
		 String i = request.getParameter("i");
		 String c= request.getParameter("c");
		 
		 RequestDispatcher rd = request.getRequestDispatcher("cate.jsp");
		 request.setAttribute("Category_id", cid);
		 request.setAttribute("i", i);
		 request.setAttribute("c", c);
		// request.setAttribute("sortby", sortby);
		 rd.forward(request, response);
		}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// String cid = request.getParameter("id");
		 
	}
	
}
