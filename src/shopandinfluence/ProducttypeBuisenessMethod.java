package shopandinfluence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class ProducttypeBuisenessMethod extends TesterDBproperty{
	public Vector<Product> getAllProducts(int i,String m)
	{
		try {//int i;
			Connection con = connect();
			System.out.println(i);
			System.out.println(m);
			//i = Producttypecontroller();
			if (m.equals("Pricelowtohigh"))
			{String q = "select * from (select * from shoptable order by  Price asc)as customer where Category_id='"+i+"'";
			
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
				System.out.println(data);
			}
				return data;
			
			}
			else if(m.equals("Pricehightolow"))
			{String q = "select * from (select * from shoptable order by  Price desc)as customer where Category_id='"+i+"'";
			
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
				System.out.println(data);
			}
				return data;
			
			}
			else if (m.equals("Offers"))
			{String q = "select * from (select * from shoptable order by  Offers desc)as customer where Category_id='"+i+"'";
			
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
				System.out.println(data);
			}
				return data;
			
			}
			else{System.out.println("freeeee");
				String q = "select * from  (select * from shoptable order by  Brand_id desc)as customer where Category_id='"+i+"'";
				
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
			}}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		System.out.println("helllll");
			return null;
		
			}	
	}
	public int producttypecontroller(String cid){
		
		 return Integer.parseInt(cid);
	}

	public static void main(String ap[])
	{
		System.out.println(new ProducttypeBuisenessMethod().getAllProducts(1,"3"));
	}
	}

