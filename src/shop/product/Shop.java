package shop.product;

import java.util.ArrayList;
import java.util.List;

public class Shop {

	private  String name;
	
	private List<Product> productList = new ArrayList<>();
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void addProduct(Product newProduct){
		productList.add (newProduct);
	}
		
}

