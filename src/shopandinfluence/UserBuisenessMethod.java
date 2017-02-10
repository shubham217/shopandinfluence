package shopandinfluence;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserBuisenessMethod extends Dbproperty{
	boolean registerUser(User u)
	{
		Connection con=connect();
		try
		{
			String q="insert into user(id,password,name,mobile,address) values(?,?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(q);
			pst.setString(1, u.getEmail());
			pst.setString(3, u.getName());
			pst.setString(2, u.getPassword());
			pst.setString(4, u.getMobile());
			pst.setString(5, u.getAddress());
			pst.executeUpdate();
			con.close();
			return true;

		}
		catch(Exception e)
		{
			System.out.println("Error "+e.getMessage());
			e.printStackTrace();
			//con.close();
			return false;
		}
	}

public static void main(String a[])
{
	User user=new User("1123", "abc", "abc","try","rrr");
	System.out.println(new UserBuisenessMethod().registerUser(user));

}
}

