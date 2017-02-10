package shopandinfluence;
import java.sql.*;
import java.util.Vector;
public class ProductBuisenessMehods extends TesterDBproperty{
	/*		boolean registerProduct(Product p)
			{
				Connection conn = connect();
			
			try{
				System.out.println("eeeeee");
				String q = "insert into image_table(id,firstname,brand) values(?,?,?,?)";
				PreparedStatement statement = conn.prepareStatement(q);
				statement.setString(1, u.getId());
				statement.setString(2, u.getFirstname());
				statement.setString(3, u.getBrand());
			
	           
	 
	            // sends the statement to the database server
	            statement.executeUpdate();
	            conn.close();
	            return true;
				}catch(Exception e){
				System.out.println("errorwed");
				return false;
			}
				
			}
*/
	public Vector<Product> getAllProducts()
	{
		try {
			Connection con = connect();
			String q = "select Product_id,Product_name,Brand_id,Brand_name,Description,Price,Offers,Manufacturing_date,Category_id,Category_name from shoptable";
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(q);
			Vector<Product> data = new Vector<Product>();
			while(rs.next())
			{
				String Product_id =rs.getString("Product_id");
				String Product_name =rs.getString("Product_name");
				String Brand_id=rs.getString("Brand_id");
				String Brand_name=rs.getString("Brand_name");
				String Description=rs.getString("Description");
				String Price=rs.getString("Price");
				String Offers=rs.getString("Offers");
				String Manufacturing_date=rs.getString("Manufacturing_date");
				String Category_id=rs.getString("Category_id");
				
				String Category_name=rs.getString("Category_name");
				
				Product p = new Product(Product_id,Product_name,Brand_id,Brand_name,Description,Price,Offers,Manufacturing_date,Category_id,Category_name);
				data.add(p);
			}
			return data;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public Vector<Product> getAProducts(String id)
	{
		try {
			int idc;
			Connection con = connect();
			idc = Integer.parseInt(id);
			String q = "select Product_id,Product_name,Brand_id,Brand_name,Description,Price,Offers,Manufacturing_date,Category_id,Category_name from shoptable where Product_id='"+idc+"'";
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(q);
			Vector<Product> data2 = new Vector<Product>();
			if(rs.next())
			{
				String Product_id =rs.getString("Product_id");
				String Product_name =rs.getString("Product_name");
				String Brand_id=rs.getString("Brand_id");
				String Brand_name=rs.getString("Brand_name");
				String Description=rs.getString("Description");
				String Price=rs.getString("Price");
				String Offers=rs.getString("Offers");
				String Manufacturing_date=rs.getString("Manufacturing_date");
				String Category_id=rs.getString("Category_id");
				
				String Category_name=rs.getString("Category_name");
				
				Product p = new Product(Product_id,Product_name,Brand_id,Brand_name,Description,Price,Offers,Manufacturing_date,Category_id,Category_name);
				data2.add(p);
				return data2;

			}
			else
			{
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public Product getProducts(String id)
	{
		try {int idc;
			idc = Integer.parseInt(id);
			System.out.println("i am back" + idc);
			Connection con = connect();
			String q = "select Product_id,Product_name,Brand_id,Brand_name,Description,Price,Offers,Manufacturing_date,Category_id,Category_name from shoptable where Product_id='"+idc+"'";
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(q);
			//Vector<Product> data = new Vector<Product>();
			if(rs.next())
			{
				String Product_id =rs.getString("Product_id");
				String Product_name =rs.getString("Product_name");
				String Brand_id=rs.getString("Brand_id");
				String Brand_name=rs.getString("Brand_name");
				String Description=rs.getString("Description");
				String Price=rs.getString("Price");
				String Offers=rs.getString("Offers");
				String Manufacturing_date=rs.getString("Manufacturing_date");
				String Category_id=rs.getString("Category_id");
				
				String Category_name=rs.getString("Category_name");
				
				Product p = new Product(Product_id,Product_name,Brand_id,Brand_name,Description,Price,Offers,Manufacturing_date,Category_id,Category_name);
				//data.add(p);
				return p;

			}
			else
			{
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public static void main(String ap[])
	{
		System.out.println(new ProductBuisenessMehods().getAllProducts());
	}
	}
