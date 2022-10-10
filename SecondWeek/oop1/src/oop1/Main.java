package oop1;

public class Main {
	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setImageUrl("image1.jpg");
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setImageUrl("image2.jpg");
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		
		Product product3 = new Product();
		product3.setName("Kitchen Kahve Makinesi");
		product3.setDiscount(7);
		product3.setImageUrl("image3.jpg");
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		
		Product [] products = {product1, product2, product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05223334466");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Fatime Nur");
		individualCustomer.setLastName("Çelik");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05334445566");
		corporateCustomer.setTaxNumber("11111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer [] customers = {individualCustomer, corporateCustomer};
		
		for(Customer customer:customers) {
			System.out.println(customer.getCustomerNumber());
		}
	}
}
