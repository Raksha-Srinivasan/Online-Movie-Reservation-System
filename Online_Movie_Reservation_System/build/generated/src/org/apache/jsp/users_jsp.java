package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.*;

public final class users_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>User Page</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\" style=\"margin-bottom:0px;\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"users.jsp\" style=\"font-size: 40px;\"><b>LUMINUS OPERA</b></a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      <!-- <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Admin</a></li> -->\n");
      out.write("      <li><a data-toggle=\"modal\" data-target=\"#myModal\"><span class=\"glyphicon glyphicon-user\"></span><b> Admin</b></a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <!-- Modal -->\n");
      out.write("    <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("      <div class=\"modal-dialog\">\n");
      out.write("        <!-- Modal content-->\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("          <div class=\"modal-header\">\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("            <h4 class=\"modal-title\">Admin Login</h4>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"modal-body\">\n");
      out.write("            \n");
      out.write("            <form action=\"login\" method=\"POST\">\n");
      out.write("        <input type=\"text\" name=\"Username\" placeholder=\"Username\">\n");
      out.write("        &nbsp\n");
      out.write("        <input type=\"password\" name=\"Password\" placeholder=\"Password\">\n");
      out.write("        <input type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <div class=\"modal-footer\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("<div id=\"carousel-example-generic\" class=\"carousel slide container-fluid\" data-ride=\"carousel\">\n");
      out.write("  <!-- Indicators -->\n");
      out.write("  <ol class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"3\"></li>\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"4\"></li>\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"5\"></li>\n");
      out.write("  </ol>\n");
      out.write("\n");
      out.write("  <!-- Wrapper for slides -->\n");
      out.write("  <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("    <div class=\"item active\">\n");
      out.write("      <img src=\"Images/mo3.jpg\" alt=\"...\" style=\"width:800px; height:500px;\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <b>Movie 1</b>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"item\">\n");
      out.write("      <img src=\"Images/mo2.jpg\" alt=\"...\" style=\"width:800px;height:500px;\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("       <b>Movie 2</b>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"item\">\n");
      out.write("      <img src=\"Images/mo1.jpg\" alt=\"...\" style=\"width:800px;height:500px;\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("      <b>Movie 3</b>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("      <div class=\"item\">\n");
      out.write("      <img src=\"Images/mo4.jpg\" alt=\"...\" style=\"width:800px;height:500px;\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("      <b>Movie 4</b>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("      <div class=\"item\">\n");
      out.write("      <img src=\"Images/mo5.jpg\" alt=\"...\" style=\"width:800px;height:500px;\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("      <b>Movie 5</b>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("      <div class=\"item\">\n");
      out.write("      <img src=\"Images/mo6.jpg\" alt=\"...\" style=\"width:800px;height:500px;\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("      <b>Movie 6</b>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Controls -->\n");
      out.write("  <a class=\"left carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"prev\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"sr-only\">Previous</span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"right carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"next\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"sr-only\">Next</span>\n");
      out.write("  </a>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<form action=\"book\" method=\"post\">\n");
      out.write("<div>\n");
      out.write("\n");
      out.write("  <div class=\"container\" style=\"float:left; margin-left:150px;\">\n");
      out.write("    <table class=\"table table-hover\">\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("            <th>Select</th>\n");
      out.write("                <th>Movie</th>\n");
      out.write("                <th>Show Slot</th>\n");
      out.write("                <th>Duration</th>\n");
      out.write("                <th>Screen No.</th>\n");
      out.write("                <th>Available</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = null;
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "Abitarak@123");
                Statement stmt = null;
                Statement stmt2 = null;
                stmt = conn.createStatement();
                stmt2 = conn.createStatement();
                String query = "select * from shows";
                ResultSet rs = null;
                rs = stmt.executeQuery(query);
                while(rs.next()){
            
      out.write("\n");
      out.write("            \n");
      out.write("                ");

                    
                    int id = rs.getInt("id");
                  int movieId = rs.getInt("movieId");
                  int screen = rs.getInt("screen");
                  int slot = rs.getInt("slot");
                  int avail = rs.getInt("booked");
                  String query2 = "select title, duration from moviedatabase where id="+movieId;
                  ResultSet rs2 = null;
                    rs2 = stmt2.executeQuery(query2);
                    String moviename=null;
                    int duration=0;
                    boolean a=true;
                    while(a && rs2.next()){
                      moviename = rs2.getString("title");
                      duration= rs2.getInt("duration");
                      a=false;
                    }
                    int start=0, end=0;
                    if(slot==1){
                      start=9;
                      end=1;
                    }
                    else if(slot==2){
                      start=1;
                      end=5;
                    }
                    else if(slot==3){
                      start=5;
                      end=9;
                    }
                    if(screen==1){
                    	avail=100-avail;
                    }
                    if(screen==2){
                    	avail=150-avail;
                    }
                    if(screen==3){
                    	avail=200-avail;
                    }
                
                
      out.write("\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                <td><input type=\"radio\" value=");
      out.print(id );
      out.write(" name=\"id\"></td>\n");
      out.write("                <td>");
      out.print(moviename );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(start );
      out.write(" to ");
      out.print(end );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(duration );
      out.write(" minutes</td>\n");
      out.write("                <td>");
      out.print(screen );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(avail );
      out.write("</td>\n");
      out.write("            </tr>               \n");
      out.write("\n");
      out.write("            ");
      
                }
            
      out.write("\n");
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"testbox3\"  style=\"float:right; margin-right:150px;\">\n");
      out.write("        <h1>Book Movie</h1>\n");
      out.write("       \n");
      out.write("\n");
      out.write("          <input type=\"number\" name=\"num\" placeholder=\"No. Of Seats\">\n");
      out.write("          <br />\n");
      out.write("          <select name=\"class\"\">\n");
      out.write("              <option value=\"silver\">Silver - Rs.100</option>\n");
      out.write("              <option value=\"gold\">Gold - Rs.150</option>\n");
      out.write("              <option value=\"platinum\">Platinum - Rs.200</option>\n");
      out.write("        </select>\n");
      out.write("          <br /><br />\n");
      out.write("          <input class=\"btn btn-primary\" type=\"submit\" value=\"BOOK NOW\">\n");
      out.write("      \n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("      /* NOTE: The styles were added inline because Prefixfree needs access to your styles and they must be inlined if they are on local disk! */\n");
      out.write("body, div, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre, form, fieldset, input, textarea, p, blockquote, th, td { \n");
      out.write("  padding:0;\n");
      out.write("  margin:0;}\n");
      out.write("\n");
      out.write("body,\n");
      out.write("input,\n");
      out.write("textarea,\n");
      out.write("select {\n");
      out.write("  font-family: 'Open Sans', sans-serif;\n");
      out.write("  font-size: 16px;\n");
      out.write("  color: #4c4c4c;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("  font-size: 32px;\n");
      out.write("  font-weight: 300;\n");
      out.write("  color: #4c4c4c;\n");
      out.write("  text-align: center;\n");
      out.write("  padding-top: 10px;\n");
      out.write("  margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".testbox3 {\n");
      out.write("  /*margin: 20px auto;*/\n");
      out.write("  width: 300px; \n");
      out.write("  /*height: 330px;*/ \n");
      out.write("  -webkit-border-radius: 8px/7px; \n");
      out.write("  -moz-border-radius: 8px/7px; \n");
      out.write("  border-radius: 8px/7px; \n");
      out.write("  background-color: #ebebeb; \n");
      out.write("  -webkit-box-shadow: 1px 2px 5px rgba(0,0,0,.31); \n");
      out.write("  -moz-box-shadow: 1px 2px 5px rgba(0,0,0,.31); \n");
      out.write("  box-shadow: 1px 2px 5px rgba(0,0,0,.31); \n");
      out.write("  border: solid 1px #cbc9c9;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".testbox3{\n");
      out.write("  height: 185px; \n");
      out.write("}\n");
      out.write("form{\n");
      out.write("  margin: 0 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text],input[type=password]{\n");
      out.write("  width: 200px; \n");
      out.write("  height: 39px; \n");
      out.write("  -webkit-border-radius: 0px 4px 4px 0px/5px 5px 4px 4px; \n");
      out.write("  -moz-border-radius: 0px 4px 4px 0px/0px 0px 4px 4px; \n");
      out.write("  border-radius: 0px 4px 4px 0px/5px 5px 4px 4px; \n");
      out.write("  background-color: #fff; \n");
      out.write("  -webkit-box-shadow: 1px 2px 5px rgba(0,0,0,.09); \n");
      out.write("  -moz-box-shadow: 1px 2px 5px rgba(0,0,0,.09); \n");
      out.write("  box-shadow: 1px 2px 5px rgba(0,0,0,.09); \n");
      out.write("  border: solid 1px #cbc9c9;\n");
      out.write("  margin-left: -5px;\n");
      out.write("  margin-top: 13px; \n");
      out.write("  padding-left: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=password]{\n");
      out.write("  margin-bottom: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
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
