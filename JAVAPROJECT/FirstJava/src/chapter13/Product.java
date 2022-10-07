package chapter13;

public class Product {

	String product;

	String saleProduct() {

		if (product == null) {

			try {
				synchronized (this) {
					wait();
					System.out.println("상품이 준비되지 않아 대기합니다.");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
		System.out.println("판매");

		return product;
	}

	public void setProduct(String product) {
		
		synchronized(this) {
			notifyAll();
		}
		
		this.product = product;
	}

}
