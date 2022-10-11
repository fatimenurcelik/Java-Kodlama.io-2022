package staticDemo;

public class ProductManager {
	public void add (Product product) {
		//ProductValidator validator = new ProductValidator();
		if(ProductValidator.isValid(product)) {
			System.out.println("eklendi");
		}else {
			System.out.println("eklenemedi - ürün bilgileri geçersizdir.");
		}
	}
}
