<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ page language="java" %>
<%@ page import="java.awt.image.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.servlet.*"%>
<%@ page import="javax.servlet.http.*"%>
<%@ page import="java.io.File"%>
<%@ page import="javax.imageio.ImageIO"%>
<%@ page import="java.awt.image.BufferedImage,java.util.*"%>
<%@ page import="java.awt.*"%>
<html>
<head><title>JSP Page</title></head>
<body>
<%
try
{
javax.servlet.http.HttpServletResponse res=null;;
int returnValue = 0;
Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
InputStream in = null;
OutputStream os = null;
Blob blob = null;
String text;
text=request.getParameter("text");
Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","java");
final String query = "SELECT image FROM tbl_image";
conn.setAutoCommit(false);
stmt = conn.createStatement();
rs = stmt.executeQuery(query);
int i=1;
if(rs.next())
{
String len1 = rs.getString("image");
int len = len1.length();
byte [] b = new byte[len];
in = rs.getBinaryStream("image");
int index = in.read(b, 0, len);
OutputStream outImej = new FileOutputStream("file:///C:/pro1/profile.jpg");
while (index != -1)
{
outImej.write(b, 0, index);
index = in.read(b, 0, len);
System.out.println("==========================");
System.out.println(index);
System.out.println(outImej);
System.out.println("==========================");
}
outImej.close();
i++;
}
else
{
returnValue = 1;
}
}
catch(Exception e)
{
out.println("SQLEXCEPTION : " +e);
}
%>
</body>
</html>