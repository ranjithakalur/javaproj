import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class Test extends HttpServlet {
 
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        //doGet(req,res);
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "library";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "root";
        out.println("hello");
 
        Statement st;
        try {
            
            conn.close();
            System.out.println("Disconnected!");
        } catch (SQLException e) {
            System.out.print(e);
            e.printStackTrace();
        }
    }
 
    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}