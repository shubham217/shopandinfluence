package shopandinfluence;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public void init() throws ServletException {

    }

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//String search = request.getParameter("search");
        String imageId = request.getParameter("id");
        InputStream sImage;

        // Check if ID is supplied to the request.
        if (imageId == null) {
            // Do your thing if the ID is not supplied to the request.
            // Throw an exception, or send 404, or show default/warning image, or just ignore it.
            response.sendError(HttpServletResponse.SC_NOT_FOUND); // 404.
            return;
        }

        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root","java");
            stmt = conn.prepareStatement("select * from shoptable where Product_id=" + imageId);
           // stmt = conn.prepareStatement("select * from image_table where firstname =" + search);
            rs = stmt.executeQuery();
            if(rs.next()){
                System.out.println("Inside RS");
                byte[] bytearray = new byte[1048576];
                int size=0;
                sImage = rs.getBinaryStream(11);
                response.reset();
                response.setContentType("image/jpeg");
                while((size = sImage.read(bytearray)) != -1 ){
                    response.getOutputStream().
                    write(bytearray,0,size);
                }
            }
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}