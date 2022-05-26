package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class food_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>LNM Talkies</title>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"user.jsp\" style=\"font-size: 40px;\"><b>Luminus Opera</b></a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<form action=\"food\" method=\"post\">\n");
      out.write("<div>\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <table class=\"table table-hover\">\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("            <th>Select</th>\n");
      out.write("                <th>Item</th>\n");
      out.write("                <th></th>\n");
      out.write("                <th>Price</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("        \n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"checkbox\" value=\"food1\" name=\"id\"></td>\n");
      out.write("                <td><img src=\"Images/2.jpg\" style=\"width: 150px; height: 150px;\"></td>\n");
      out.write("                <td style=\"margin-top: 100px;\">1 Coca Cola + 1 medium Popcorn</td>\n");
      out.write("                <td>100</td>\n");
      out.write("            </tr> \n");
      out.write("           <tr>\n");
      out.write("                <td><input type=\"checkbox\" value=\"food2\" name=\"id\"></td>\n");
      out.write("                <td><img src=\"Images/1.jpg\" style=\"width: 150px; height: 150px;\"></td>\n");
      out.write("                <td style=\"margin-top: 100px;\">1 Coca Cola + 1 Small Fries + 1 Veg Burger</td>\n");
      out.write("                <td>150</td>\n");
      out.write("            </tr>\n");
      out.write("           <tr>\n");
      out.write("                <td><input type=\"checkbox\" value=\"food3\" name=\"id\"></td>\n");
      out.write("                <td><img src=\"Images/3.jpg\" style=\"width: 150px; height: 150px;\"></td>\n");
      out.write("                <td style=\"margin-top: 100px;\">1 Coca Cola + 2 Medium fries + 2 Veg Burger</td>\n");
      out.write("                <td>200</td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("    <input type=\"submit\" value=\"Order\" class=\"btn btn-primary\">\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
