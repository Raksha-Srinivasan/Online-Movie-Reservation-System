import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Adminservlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        final String JDBC_DRIVER="com.mysql.jdbc.Driver";
        final String DB_URL="jdbc:mysql://localhost:3306/movie";
        final String USER="root";
        final String PASS="Abitarak@123";
        Statement stmt=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex){
            Logger.getLogger(Adminservlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("DB connected....");
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            stmt=conn.createStatement();
            String title;
        } catch (SQLException ex){
            Logger.getLogger(Adminservlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            ResultSet rs = stmt.executeQuery("select * from admin where uname='"+username+"' and pass='"+password+"'");
            System.out.println("Found value!");
            PrintWriter writer = response.getWriter();
            if(rs.next()){
                //response.sendRedirect("result.html");
                RequestDispatcher req = request.getRequestDispatcher("options.jsp");
                req.include(request, response);
            }
            else{
                String htmlResponse = "<html>";
               htmlResponse += "<h2><center>Invalid Credentials!!Please retry to login the portal!!</center></h2>";        
               htmlResponse += "</html>";
               writer.println(htmlResponse);
            }
        } catch (IOException | ServletException e){ } catch (SQLException ex){
            Logger.getLogger(Adminservlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

   