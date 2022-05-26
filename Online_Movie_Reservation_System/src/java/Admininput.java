import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class Admininput extends HttpServlet {
 
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        String movieName = request.getParameter("movieName");
        String genre = request.getParameter("genre");
        String duration = request.getParameter("duration");
        String director = request.getParameter("director");
         
        System.out.println("movie: " + movieName);
        System.out.println("genre: " + genre);

        try
        {
          String myDriver = "com.mysql.jdbc.Driver";
          String myUrl = "jdbc:mysql://localhost:3306/movie";
          Class.forName(myDriver);
          Connection conn = DriverManager.getConnection(myUrl, "root", "Abitarak@123");
          String query = " insert into moviedatabase (title, genre, duration, director)" + " values (?, ?, ?, ?);";
          PreparedStatement preparedStmt = conn.prepareStatement(query);
          preparedStmt.setString (1, movieName);
          preparedStmt.setString (2, genre);
          preparedStmt.setInt(3, Integer.parseInt(duration));
          preparedStmt.setString(4, director);
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