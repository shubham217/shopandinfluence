package shopandinfluence;

public class Product {
	String Product_id;
	String Product_name;
	String Brand_id;
	String Brand_name;
	String Description;
	String Price;
	String Offers;
	String Manufacturing_date;
	String Category_id;
	
	String Category_name;
	
	public Product(String Product_id,String Product_name,String Brand_id, String Brand_name,String Description,String Price,String Offers,String Manufacturing_date,String Category_id,String Category_name) 
	{
		this.Product_id = Product_id;
		this.Product_name = Product_name;
		this.Brand_id = Brand_id;
		this.Brand_name = Brand_name;
		this.Description = Description;
		this.Price = Price;
		this.Offers = Offers;
		this.Manufacturing_date = Manufacturing_date;
		this.Category_id = Category_id;
		this.Category_name = Category_name;
		
	}
	public String getProduct_id() {
		return Product_id;
	}

	public void setProduct_id(String product_id) {
		Product_id = product_id;
	}

	public String getProduct_name() {
		return Product_name;
	}

	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}

	public String getBrand_id() {
		return Brand_id;
	}

	public void setBrand_id(String brand_id) {
		Brand_id = brand_id;
	}

	public String getBrand_name() {
		return Brand_name;
	}

	public void setBrand_name(String brand_name) {
		Brand_name = brand_name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public String getOffers() {
		return Offers;
	}

	public void setOffers(String offers) {
		Offers = offers;
	}

	public String getManufacturing_date() {
		return Manufacturing_date;
	}

	public void setManufacturing_date(String manufacturing_date) {
		Manufacturing_date = manufacturing_date;
	}

	public String getCategory_id() {
		return Category_id;
	}

	public void setCategory_id(String category_id) {
		Category_id = category_id;
	}

	public String getCategory_name() {
		return Category_name;
	}

	public void setCategory_name(String category_name) {
		Category_name = category_name;
	}



	}



