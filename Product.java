package Assignment;

public class Product {
	String productCode;
	String productName;
    double productPrice;
    public Product()
	{
	}
		// TODO Auto-generated constructor stub
	
	Product(String code,String name,double price)
	{
		this.productCode=code;
		this.productName=name;
		this.productPrice=price;
	}
	
	void showProductDetails(){
		System.out.println("productCode:" +productCode);
		System.out.println("productName:" +productName);
		System.out.println("productPrice:" +productPrice);
	}	
	  
	

}
