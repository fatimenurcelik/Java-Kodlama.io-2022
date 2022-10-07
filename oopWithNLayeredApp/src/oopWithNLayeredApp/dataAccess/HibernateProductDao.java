package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	public void add(Product product) {
		//sadece ve sadece db eriþim kodlarý buraya yazýlýr ... SQL
		System.out.println("Hibernate ile veri tabanýna eklendi");
	}
}
