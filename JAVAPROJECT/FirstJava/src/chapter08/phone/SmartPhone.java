package chapter08.phone;

public class SmartPhone extends Computer implements Phone {

	boolean power;
	
	public SmartPhone(String account) {
		super(account);
		this.power = false;
	}

	
	
}
