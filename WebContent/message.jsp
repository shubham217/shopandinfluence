<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type">
<title>Insert title here</title>
</head>
<body>

 <center>
        <h3><%=request.getAttribute("id")%></h3>
    </center>
<%--- <form method="post" action="uploadservelet" enctype="multipart/form-data">
            <table border="0">
<tr>
                    <td>search item </td>
                    <td><input type="text" name="search" size="50"/></td>
                </tr>
<tr> <td>
<input type="submit" value="Save">
               </td></tr>
               
</table>
</form>

--%>
<img src="DisplayServlet?id=<%=request.getAttribute("id")%>" height="150px" width="150px" alt="ProfilePic">
</body>
</html>