package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.rosuda.JRI.Rengine;



/**
 * Servlet implementation class home
 */
public class home extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
//	ServiceProxy proxy = new ServiceProxy();     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public home() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String qdone;
		
		System.out.println("In do post for get price");
		
			String user = request.getParameter("cname");
			
			String user0 = request.getParameter("pname");
			String user1 = request.getParameter("pf");
			String user2 = request.getParameter("pc");
			String user3 = request.getParameter("pq");
			String user4 = request.getParameter("ms");
			
			System.out.println("Mac Support "+user4);
			
			String user5 = request.getParameter("as");
			String user6 = request.getParameter("ws");
			
			System.out.println("Windows Support "+user6);
			
			String user7 = request.getParameter("bs");
			String user8 = request.getParameter("ds");
			String user9 = request.getParameter("dq");
			String user10 = request.getParameter("dsr");
			String user11 = request.getParameter("ram");
			String user12 = request.getParameter("rt");
			String user13 = request.getParameter("obm");
			String user14 = request.getParameter("em");
			String user15 = request.getParameter("bbk");
			String user16= request.getParameter("bbt");
			String user17 = request.getParameter("wgt");
			String user18 = request.getParameter("bcm");
			String user19 = request.getParameter("bc");
			String user20 = request.getParameter("fcm");
			String user21 = request.getParameter("fc");
			String user22 = request.getParameter("hs");
			String user23 = request.getParameter("ti");
			String user24 = request.getParameter("thk");
			String user25 = request.getParameter("dimn");
			String user26 = request.getParameter("wifi");
			String user27 = request.getParameter("wifiq");
			String user28 = request.getParameter("bts");
			String user29 = request.getParameter("btq");
			String user30 = request.getParameter("usbs");
			String user31 = request.getParameter("usbq");
			String user32 = request.getParameter("4gs");
			String user33 = request.getParameter("3gs");
			
	
	//		System.out.println(user2);
		System.out.println(user29);
			
			try{
//				proxy.setEndpoint("http://localhost:8080/ProductLaunchApp/services/Service");
//				qdone=proxy.rcall(user,user0,user1,user2,user3,user4,user5,user6,user7,user8,user9,user10,user11,user12,user13,user14,user15,user16,user17,user18,user19,user20,user21,user22,user23,user24,user25,user26,user27,user28,user29,user30,user31,user32,user33);
				
				RCall rc =  new RCall();
				
				qdone = rc.rcall(user,user0,user1,user2,user3,user4,user5,user6,user7,user8,user9,user10,user11,user12,user13,user14,user15,user16,user17,user18,user19,user20,user21,user22,user23,user24,user25,user26,user27,user28,user29,user30,user31,user32,user33);
				
				request.setAttribute("qdone2", qdone);
				
//				Rengine re=new Rengine(new String[2] , true, null);
//				
//				System.out.println("R-Engine Created successfully");
//				
//				re.eval("File <- read.csv('C:\\\\SJSU\\\\R\\\\FinalData.csv')");
//				
//				re.eval("results <- lm(PricewithLaunchPriceOneMinusBV ~ ProcessorFrequency+processorCores+MacSupport+AndroidSupport+Windowssupport+BlackberryOSSupport+Displaysize+Displayquality+RAM+OnBoardMemory+ExpandedMemoryCapable+BatteryBackup+Batteryreverse+weight+Camera1BackSide+Camera2FrontSide+Cameraquality+HDMISupport+Touchinput+Thickness+DimensionsLenghtInTOBreadth+WiFiQuality+USBSupport+USBQuality+FourGSupport,data=File)");
//				
				
				request.getRequestDispatcher("bev.jsp").forward(request,response);
				return;
		}
			 
	
		catch( Exception e)
		{
			e.printStackTrace();
		}
	}
}
