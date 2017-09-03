package shop.product;

public class Runner {

	public static void main(String[] args) {
		
		Shop shop = new Shop();
		
		shop.setName("evroopt");
		
		Product bread = new Product();
		
		bread.setName("Raubichi");
		
		shop.addProduct(bread);
		
		System.out.println();
		

	}

}
