package chapter13;

public class SalesMain {

	public static void main(String[] args) {
		
		Product p = new Product();
		
		Customer c1 = new Customer(p);
		
		Customer c2 = new Customer(p);
		
		
		Seller seller = new Seller(p);
		
		c1.start();
		c2.start();
		
		seller.start();
	}
}
