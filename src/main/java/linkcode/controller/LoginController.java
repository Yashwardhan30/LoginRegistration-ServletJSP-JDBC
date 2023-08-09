package linkcode.controller;
import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import linkcode.dao.LoginDaoImpl;
import linkcode.model.User;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");

		LoginDaoImpl ldao=new LoginDaoImpl();
		User temp=ldao.searchRecord(uname);
		String msg=null;

		if(temp!=null) {
			if(pass.equals(temp.getPass())) {
				msg="Valid Username and Password";
				out.print("<h3>Login Successfull....</h3> \n<h1>Welcome User</h1>");
				HttpSession session0=request.getSession();
				session0.setAttribute("msg", msg);
				
				HttpSession session=request.getSession();
				session.setAttribute("user", temp);
				response.sendRedirect("Dashboard.jsp");
			}else {
				msg="Invalid Password";
				out.print("<h3>***..Invalid Password..***</h3>");
				HttpSession session0=request.getSession();
				session0.setAttribute("msg", msg);
				response.sendRedirect("Login.jsp");
			}
		}else {
			msg="Invalid Username";
			out.print("<h3>***..Invalid Username..***</h3>");
			HttpSession session0=request.getSession();
			session0.setAttribute("msg", msg);
			response.sendRedirect("Login.jsp");
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
