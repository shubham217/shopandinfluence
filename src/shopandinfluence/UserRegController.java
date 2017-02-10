package shopandinfluence;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;	

/**
 * Servlet implementation class UserRegController
 */
@WebServlet("/UserRegController")
public class UserRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String mobile=request.getParameter("mobile");
		String address=request.getParameter("address");
		User user=new User(email,password,name,mobile,address);
		
		if(new UserBuisenessMethod().registerUser(user))
		{
		RequestDispatcher rd=request.getRequestDispatcher("/register.jsp");
		request.setAttribute("msg", "registeration done");
		rd.forward(request, response);
		}
		else
			{
			RequestDispatcher rd=request.getRequestDispatcher("/register.jsp");
			request.setAttribute("msg", "registeration not valid");
			rd.forward(request, response);
		}
	}
	}


