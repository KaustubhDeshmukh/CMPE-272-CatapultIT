package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import connection.ServiceProxy;
/**
 * Servlet implementation class SignUp
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy = new ServiceProxy();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String qdone;
		try{
			
			String user = request.getParameter("email");
			
			String pass = request.getParameter("password");
			//
			
			proxy.setEndpoint("http://localhost:8080/ProductLaunchApp/services/Service");
			qdone=proxy.login(user,pass);
			
			//System.out.println("a="+a1);
			if(qdone.matches("true"))
			{
				System.out.println("invalid entry");
				response.sendRedirect("home.jsp");
			}
			
			else
			{
				response.sendRedirect("index.html");
			}
		}
		catch( Exception e)
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

//	private String toString(String login2) {
		// TODO Auto-generated method stub
	//	return null;
	//}

}
