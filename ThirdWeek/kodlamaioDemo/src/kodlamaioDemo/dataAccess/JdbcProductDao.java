package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Course;

public class JdbcProductDao implements ProductDao {

	@Override
	public void add(Course course) {
		// TODO Auto-generated method stub
		System.out.println("JDBC ile veri tabanina eklendi");
	}

}
