package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	public void add(Product product) {
		//sadece ve sadece db eriþim kodlarý buraya yazýlýr ... SQL
		System.out.println("JDBC ile veri tabanýna eklendi");
	}
}