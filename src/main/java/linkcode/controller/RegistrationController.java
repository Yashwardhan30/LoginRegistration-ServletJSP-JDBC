package linkcode.controller;
import java.io.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import linkcode.dao.RegistrationDaoImpl;
import linkcode.model.User;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
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

		int i=0;
		RegistrationDaoImpl udao=new RegistrationDaoImpl();
		User u=null;
		List<User> lst=new ArrayList<User>();

		int id=Integer.parseInt(request.getParameter("id"));
		String fname=request.getParameter("fname");
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String cpass=request.getParameter("cpass");
		double mno=Double.parseDouble(request.getParameter("mno"));
		double ramt=Double.parseDouble(request.getParameter("ramt"));
		String msg=null;
		
		if(pass.equals(cpass)) {
			u=new User(id, fname, uname, pass, mno, ramt);
			lst.add(u);
			i=udao.create(lst);
			
			if(i>0) {
				msg="Registration Successful";
				out.print("Record Saved");
				HttpSession session0=request.getSession();
				session0.setAttribute("msg", msg);
				response.sendRedirect("Login.jsp");
			}else {
				msg="Registration Failed.... Try again";
				out.print("Record NOT Saved");
				HttpSession session0=request.getSession();
				session0.setAttribute("msg", msg);
				response.sendRedirect("Registration.jsp");
			}
			
		}else {
			msg="Confirm Password doesnt match.... Try again";
			out.print("<h3>***..Confirm Password doesnt match..***</h3>");    		
			HttpSession session0=request.getSession();
			session0.setAttribute("msg", msg);
			response.sendRedirect("Registration.jsp");
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
