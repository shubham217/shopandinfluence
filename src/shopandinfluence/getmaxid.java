package shopandinfluence;

import java.sql.Connection;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Vector;

public class getmaxid extends TesterDBproperty{
	int maxProductid(Product p){
		try
        {
			Connection con = connect();
			int c;
            Statement st;
            ResultSet rs;

            st=con.createStatement();
            rs=st.executeQuery("select max(Product_id) from shoptable");
            int i=100;
            while (rs.next())
            {
                i=rs.getInt(1);


            }
            c =Integer.parseInt(""+ i);
            con.close();
            st.close();
            rs.close();
            return c;
        }
        catch (Exception e)
        {
        e.printStackTrace();
        return 0;
        }
	}

public static void main(String ap[])
{
	Product user=new Product("1", "2", "fsf", "fsdf", "fdsf","ma","wee","des","ma","wee");
	System.out.println(new getmaxid().maxProductid(user));
}
}
