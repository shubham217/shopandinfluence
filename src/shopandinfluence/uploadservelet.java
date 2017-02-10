package shopandinfluence;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
 
@WebServlet("/uploadservelet")
@MultipartConfig(maxFileSize = 116177215)    // upload file's size up to 16MB
public class uploadservelet extends HttpServlet {
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// database connection settings
   
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // gets values of text fields
    	String Product_id = request.getParameter("Product_id");
        String Product_name = request.getParameter("Product_name");
        String Brand_id = request.getParameter("Brand_id");
        String Brand_name = request.getParameter("Brand_name");
        String Description = request.getParameter("Description");
        String Price = request.getParameter("Price");
        String Offers = request.getParameter("Offers");
        String Manufacturing_date = request.getParameter("Manufacturing_date");
        String Category_id = request.getParameter("Category_id");
        String Category_name = request.getParameter("Category_name");
        
        
        InputStream inputStream = null; // input stream of the upload file
         
        // obtains the upload file part in this multipart request
        Part filePart = request.getPart("Image");
        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
             
            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }
         
        Connection conn = null; // connection to the database
      //  String message = null;  // message will be sent back to client
         
        try {
            // connects to the database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","java");
 
            // constructs SQL statement
            String sql = "INSERT INTO shoptable(Product_id,Product_name,Brand_id,Brand_name,Description,Price,Offers,Manufacturing_date,Category_id,Category_name,Image) values (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, Product_id);
            statement.setString(2, Product_name);
            statement.setString(3, Brand_id);
            statement.setString(4, Brand_name);
            statement.setString(5, Description);
            statement.setString(6, Price);
            statement.setString(7, Offers);
            statement.setString(8, Manufacturing_date);
            statement.setString(9, Category_id);
            statement.setString(10, Category_name);
            
            
             
            if (inputStream != null) {
                // fetches input stream of the upload file for the blob column
                statement.setBlob(11, inputStream);
            }
 
            // sends the statement to the database server
            int row = statement.executeUpdate();
            if (row > 0) {
            //    message = "File uploaded and saved into database";
            }
        } catch (SQLException ex) {
           // message = "ERROR: " + ex.getMessage();
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                // closes the database connection
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            // sets the message in request scope
            RequestDispatcher rd=request.getRequestDispatcher("/Welcome.jsp");
			request.setAttribute("msg", "enter another product");
			rd.forward(request, response);
        }
    }
}
