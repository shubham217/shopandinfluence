package shopandinfluence;

import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
* Servlet implementation class RetrieveImage
*/
public class retrieveimage extends HttpServlet{

/**
*
*/
private static final long serialVersionUID = 4593558495041379082L;

public void doGet(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException{
ResultSet rs;
InputStream sImage;

try{

String id =request.getParameter("Image_id");
Connection con = null;
Class.forName("com.mysql.jdbc.Driver").newInstance();
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","java","root");
Statement stmt=con.createStatement();
String strSql="select image from image_table where id='"+id+"'";
System.out.println("inside servlet Sql�>"+strSql);
rs=stmt.executeQuery(strSql);
if(rs.next()) {
byte[] bytearray = new byte[1048576];
int size=0;
sImage = rs.getBinaryStream(1);
response.reset();
response.setContentType("image/jpeg");
while((size=sImage.read(bytearray))!= -1 ){
response.getOutputStream().
write(bytearray,0,size);
}
}

} catch (Exception e){
e.printStackTrace();
}
}
}