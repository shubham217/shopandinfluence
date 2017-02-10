package shopandinfluence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesterDBproperty {

	Connection connect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("drive reloaded");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","java");
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
	
	/*public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DBproperty ob = new DBproperty();
		ob.connect();
		}
*/
	}

