import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/schedule")
public class schedule extends HttpServlet {
 
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        String movieId = request.getParameter("movieId");
        String screen = request.getParameter("screen");
        String slot = request.getParameter("slot");
         
        System.out.println("movie: " + movieId);
        System.out.println("genere: " + screen+" "+slot);
 
        try
        {
          String myDriver = "com.mysql.jdbc.Driver";
          String myUrl = "jdbc:mysql://localhost:3306/movie";
          Class.forName(myDriver);
            try (Connection conn = DriverManager.getConnection(myUrl, "root", "Abitarak@123")) {
                String query = " insert into shows (movieId, screen, slot, booked)"
                        + " values (?, ?, ?, ?);";
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setInt(1, Integer.parseInt(movieId));
                preparedStmt.setInt(2, Integer.parseInt(screen));
                preparedStmt.setInt(3, Integer.parseInt(slot));
                preparedStmt.setInt(4, 0);
                preparedStmt.execute();
            }
          response.sendRedirect("options.jsp");
        }
        catch (IOException | ClassNotFoundException | NumberFormatException | SQLException e)
        {
          System.err.println("Got an exception!");
          System.err.println(e.getMessage());
        }
      
    }
 
}