package interfaces;

public class MySqlCustomerDal implements ICustomerDal{

	@Override
	public void Add() {
		System.out.println("My sql eklendi");
	}
}
