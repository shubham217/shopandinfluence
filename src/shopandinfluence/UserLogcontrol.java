package shopandinfluence;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserLogcontrol
 */
@WebServlet("/UserLogcontrol")
public class UserLogcontrol extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLogcontrol() {
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
		doGet(request, response);
		String id=request.getParameter("email");
		String password=request.getParameter("password");
		String f=new UserLoginmethod().checkUser(id, password);
		if(!f.equals("err")&&!f.equals("na"))
		{
			HttpSession session=request.getSession(true);
			session.setAttribute("id", f);
			String msg="login sucessful";
//			String val=request.getParameter("test");
//			Cookie  ob=new Cookie("log", val);
//			ob.setMaxAge(100*);
//			response.addCookie(ob);
			request.setAttribute("login", msg);
			response.sendRedirect("index.jsp");
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("/register.jsp");
			request.setAttribute("msgs", "Enter correct ID or password");
			rd.forward(request, response);
		}
	}

	}


