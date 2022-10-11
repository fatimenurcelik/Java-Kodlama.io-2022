package interfaces;

public class Main {

	public static void main(String[] args) {
		//polymorphism
		//ICustomerDal customerDal = new OracleCustomerDal();
		
		CustomerManager customerManager  = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
	}
}
