package shopandinfluence;

import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class UserLoginmethod extends Dbproperty{

	 String checkUser(String id,String password)
	{
		try
		{
			Connection con= (Connection) connect();
			String q="select * from user where id='"+id+"' and password='"+password+"'";
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery(q);
			if(rs.next())
			{
				String name=rs.getString("name");
				con.close();
				return name;
			}
			else
			{
				con.close();
				return "na";
			}
		}
		catch(Exception e)
		{
			System.out.println("Error "+e.getMessage());
			e.printStackTrace();
			
			return "err";
		}
		//con.close();
	}
}
