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
 * Servlet implementation class Cookielog
 */
@WebServlet("/Cookielog")
public class Cookielog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cookielog() {
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
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		Cookie c = new Cookie(id,pass);
		c.setMaxAge(60*2);
		response.addCookie(c);
		Cookie data[]= request.getCookies();
		for(int i = 0 ;i<data.length;i++)
		{
			String name = data[i].getName();
			String value = data[i].getValue();
		if(name.equals("abc") && value.equals("123"))
		{
			//response.sendRedirect("welcome.html");
			HttpSession session = request.getSession(true);
			session.setAttribute("id", id);
			response.sendRedirect("welcome1.jsp");
		}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
