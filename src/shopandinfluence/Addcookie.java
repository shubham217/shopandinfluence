package shopandinfluence;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Addcookie
 */
@WebServlet("/Addcookie")
public class Addcookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addcookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/jsp");
		System.out.println("errort");
		String id = request.getParameter("id");
		String productname = request.getParameter("name");
		Cookie c = new Cookie(id,"cart");
		c.setMaxAge(60*60*60*2);
		response.addCookie(c);
		response.sendRedirect("cart.jsp");

	//	Cookie data[]= request.getCookies();
//		for(int i = 0 ;i<data.length;i++)
//		{
//			String name = data[i].getName();
//			String value = data[i].getValue();

//		if(name.equals(id) && value.equals("cart"))
//		{
//			//response.sendRedirect("welcome.html");
//			HttpSession session = request.getSession(true);
//			System.out.println(c);
//			session.setAttribute("id",id);
//			session.setAttribute("productname", productname);
//			System.out.println(productname);
//		}
	//	}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
