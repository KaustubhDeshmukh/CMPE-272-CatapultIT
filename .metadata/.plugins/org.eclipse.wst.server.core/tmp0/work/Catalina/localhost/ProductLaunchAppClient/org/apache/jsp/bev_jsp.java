package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bev_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, minimum-scale=1.0, maximum-scale=1.0\">\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script src=\"//html5shiv.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!-- END OF DON'T TOUCH -->\r\n");
      out.write("\r\n");
      out.write("<!-- Website Title -->\r\n");
      out.write("<title>Product Launch</title>\r\n");
      out.write("<!-- END OF Website Title -->\r\n");
      out.write("\r\n");
      out.write("<!--  Website description - Change the 'content' section to whatever you want -->\r\n");
      out.write("<meta name=\"description\" content=\"Replace this text with a summary of your website. i.e. John Smith - Web Developer and Photographer - Welcome to my portfolio website! Here you will find all of my latest work. Enjoy!\">\r\n");
      out.write("<!-- END OF Website description -->\r\n");
      out.write("\r\n");
      out.write("<!-- DON'T TOUCH THIS SECTION -->\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Lato:300,400,700|Cookie' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"scripts/jquery.carouFredSel-5.5.2.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/jquery.easing.1.3.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/jquery.form.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/scripts.js\"></script> \r\n");
      out.write("</head>\r\n");
      out.write("<!-- END OF DON'T TOUCH -->\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\t<div id=\"top\">\r\n");
      out.write("        <div id=\"logo\">\r\n");
      out.write("          <img src=\"images/logo.png\" alt=\"logo\" width=\"118\" height=\"139\" id=\"logoimage\">\t<!-- Logo image -->\r\n");
      out.write("            <h1 id=\"logotitle\">Product Launch App...</h1>\t\r\n");
      out.write("            <!-- Logo text -->\r\n");
      out.write("        </div><!--/logo-->\r\n");
      out.write("    \r\n");
      out.write("        <nav>\t<!-- Navigation Start -->\r\n");
      out.write("            <ul>\r\n");
      out.write("            \t<li><a href=\"#top\">HOME</a></li>\r\n");
      out.write("                <li><a href=\"#about\">About</a></li>\r\n");
      out.write("                <li><a href=\"#work\">Work</a></li>\r\n");
      out.write("                <li><a href=\"#footer\">Contact</a></li>\r\n");
      out.write("        \r\n");
      out.write("            </ul>      \r\n");
      out.write("        </nav>\t<!-- Navigation End -->\r\n");
      out.write("       \r\n");
      out.write("    \r\n");
      out.write("    </div><!--/top-->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <hr/><!-- Horizontal Line -->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  \r\n");
      out.write(" <!--  <section id=\"slideshow\">\t<!-- Slideshow Start ->\r\n");
      out.write("        <div class=\"html_carousel\">\r\n");
      out.write("\t\t\t<div id=\"slider\">\r\n");
      out.write("            \r\n");
      out.write("\t\t\t\t<div class=\"slide\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/slideshow/sliderimage1.jpg\" width=\"3000\" height=\"783\" alt=\"image 1\"/><!-- Replace these images with your own but make sure they are 3000px wide and 783px high or the same ration -->\r\n");
      out.write("\t\t\t\t</div><!--/slide ->\r\n");
      out.write("                \r\n");
      out.write("\t\t\t\t<div class=\"slide\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/slideshow/sliderimage2.jpg\" width=\"3000\" height=\"783\" alt=\"image 2\"/><!-- Replace these images with your own but make sure they are 3000px wide and 783px high or the same ration -->\r\n");
      out.write("\t\t\t\t</div><!--/slide ->\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"slide\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/slideshow/sliderimage3.jpg\" width=\"3000\" height=\"783\" alt=\"image 3\"/><!-- Replace these images with your own but make sure they are 3000px wide and 783px high or the same ration -->\r\n");
      out.write("\t\t\t\t</div><!--/slide ->\r\n");
      out.write("                \r\n");
      out.write("\t\t\t</div><!--/slider ->\r\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t</div><!--/html_carousel ->\r\n");
      out.write("    </section>\t<!-- Slideshow End  -->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("<!-- TO MAKE THE PHP FORM WORK, ALL YOU NEED TO DO IS OPEN UP THE FILE CALLED 'submitemail.php' AND CHANGE WHERE IT SAYS 'your email goes here' -->\r\n");
      out.write("\r\n");
      out.write("<!-- DON'T TOUCH THIS SECTION -->\r\n");
      out.write("\r\n");
      out.write("<footer id=\"footer\">\r\n");
      out.write("\t<div>\r\n");
      out.write("    \t<section class=\"left\">\r\n");
      out.write("    \t<h4>Break Even Point </h4>\r\n");
      out.write("            <div  id=\"formwrap\">\r\n");
      out.write("            \r\n");
      out.write("         <!--  ");
// String s = request.getAttribute("qdone2").toString(); 
      out.write("  -->\r\n");
      out.write(" \r\n");
      out.write("  <form method=\"post\" id=\"submitform2\" action=\"bev\">\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<table >\r\n");
      out.write("<tr>\r\n");
      out.write("<td> <font color='white'>Your Product price is(USD) </td> <td> <input type=\"text\" id=\"ab\" value=");
      out.print( request.getAttribute("qdone2").toString() );
      out.write(" /> </td> \r\n");
      out.write("</tr>\r\n");
      out.write("<tr></tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td> <font color='white'>Advertising Budget(USD) </td> <td> <input type=\"text\" name=\"ab\" /> </td> \r\n");
      out.write("</tr>\r\n");
      out.write("<tr></tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td> <font color='white'>Consumer & Trade Promotion Budget(USD)</td> <td> <input type = \"text\" name = \"cpb\" /> </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr></tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><font color='white'>Sales Force Budget(USD)</td> <td> <input type = \"text\" name = \"sfb\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><font color='white'>General and Other Budget(USD)</td> <td> <input type = \"text\" name = \"gb\" /></td>\r\n");
      out.write("</table>\r\n");
      out.write("<table width='1000'>\r\n");
      out.write("<tr height='50'></tr>\r\n");
      out.write("<tr align=\"center\"><td width='1000'>\r\n");
      out.write("<input type = \"submit\" value = \"Get Break Even Point\">\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("     \r\n");
      out.write(" ");
if("true".equals(request.getAttribute("hide")))
 { 
	 
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t <div style=\"color: red\"> Break Event Point <input type = \"text\" name = \"cpb\" value='");
      out.print( request.getAttribute("bev").toString());
      out.write("'/>\r\n");
      out.write("\t");
} 
	 
      out.write("            \r\n");
      out.write("\r\n");
      out.write("             \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"clearfix\"></div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("<!-- SLIDESHOW SCRIPT START \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(\"#slider\").carouFredSel({\r\n");
      out.write("\tresponsive\t: true,\r\n");
      out.write("\tscroll\t\t: {\r\n");
      out.write("\t\t//fx\t\t\t: \"crossfade\",\r\n");
      out.write("\t\t//easing\t\t: \"swing\",\r\n");
      out.write("\t\t//duration\t: 1000,\r\n");
      out.write("\t\t\r\n");
      out.write("\t},\r\n");
      out.write("\titems\t\t: {\r\n");
      out.write("\t\tvisible\t\t: 1,\r\n");
      out.write("\t\theight\t\t: \"27%\"\r\n");
      out.write("\t}\r\n");
      out.write("});\r\n");
      out.write("</script>-->\r\n");
      out.write("<!-- SLIDESHOW SCRIPT END -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
