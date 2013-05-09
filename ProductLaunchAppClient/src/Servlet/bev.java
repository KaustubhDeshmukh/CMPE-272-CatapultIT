package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection.ServiceProxy;

/**
 * Servlet implementation class bev
 */
public class bev extends HttpServlet {
	private static final long serialVersionUID = 1L;
	      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bev() {
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
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String user1 = request.getParameter("ab");
		String user2 = request.getParameter("cpb");
		System.out.println("CPB "+user2);
		String user3 = request.getParameter("sfb");
		System.out.println("sfb "+user3);
		String user4 = request.getParameter("gb");
		
		try{
//			proxy.setEndpoint("http://localhost:8080/ProductLaunchApp/services/Service");
//			qdone=proxy.bev(user1,user2,user3,user4);
			
			RCall rc = new RCall();
			
			String qdone1 = rc.bev(user1, user2, user3, user4);
		System.out.println(qdone1);
			request.setAttribute("hide", "true");
			request.setAttribute("bev", qdone1);
			//request.getSession().setAttribute("bev", qdone1);
			request.setAttribute("qdone2", RCall.lastPrice);
			
			request.getRequestDispatcher("bev.jsp").forward(request, response);
	return;
		}

		catch( Exception e)
		{
			e.printStackTrace();
		}
	}

}
