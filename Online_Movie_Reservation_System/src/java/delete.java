import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/delete")
public class delete extends HttpServlet {
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        String movieName = request.getParameter("movieName");
        System.out.println("movie: " + movieName);
        try
        {
          String myDriver = "com.mysql.jdbc.Driver";
          String myUrl = "jdbc:mysql://localhost:3306/movie";
          Class.forName(myDriver);
          Connection conn = DriverManager.getConnection(myUrl, "root", "Abitarak@123");
          String query = " delete from moviedatabase where title = ?";
          PreparedStatement preparedStmt = conn.prepareStatement(query);
          preparedStmt.setString (1, movieName);
          preparedStmt.execute();
          
          conn.close();
          response.sendRedirect("options.jsp");
        }
        catch (Exception e)
        {
          System.err.println("Got an exception!");
          System.err.println(e.getMessage());
        }
            
    }
 
}