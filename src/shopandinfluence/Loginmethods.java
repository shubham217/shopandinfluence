package shopandinfluence;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Loginmethods extends Dbproperty {
String checkUser(String id,String password){
	{	try
	{
		Connection con = connect();
		String q="select * from admin where id='"+id+"' and password='"+password+"'";
		Statement smt =con.createStatement();
		ResultSet rs = smt.executeQuery(q);
		if(rs.next()){
			String name =  rs.getString("name");
			con.close();
			return name;
		}
		else{
			con.close();
			return "na";
		}
	}
	catch(Exception e){
		System.out.println("error");
		return "err";
	}
	}
	

}}
