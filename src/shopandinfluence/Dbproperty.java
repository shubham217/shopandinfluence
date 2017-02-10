package shopandinfluence;
import java.sql.*;
public class Dbproperty {
	Connection connect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("drive reloaded");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/addc","root","java");
			System.out.println("db connected");
			return con;
		} catch (ClassNotFoundException e) {
			System.out.println("end");
			e.printStackTrace();
			return null;
			// TODO Auto-generated catch block
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

public static void main(String[] args)
{Dbproperty ob=new Dbproperty();
ob.connect();
}
}

