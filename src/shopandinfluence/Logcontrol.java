package shopandinfluence;
	
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logcontrol
 */
@WebServlet("/Logcontrol")
public class Logcontrol extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Logcontrol() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		String password=request.getParameter("pass");
		String f=new Loginmethods().checkUser(id,password);
		if(!f.equals("err")&&!f.equals("na"))
	{
			HttpSession session=request.getSession(true);
			session.setAttribute("id", f);
			//String val=request.getParameter("test");//cookie value
			//Cookie ob=new Cookie("log",val);//cookie
			//ob.setMaxAge(60*2);
			//response.addCookie(ob);//cookie
			response.sendRedirect("Welcome.jsp");
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("/adminlogin.jsp");
			request.setAttribute("msg","Enter correct ID or Password");
			rd.forward(request,response);
		}
		
//		doGet(request, response);
	}

}
