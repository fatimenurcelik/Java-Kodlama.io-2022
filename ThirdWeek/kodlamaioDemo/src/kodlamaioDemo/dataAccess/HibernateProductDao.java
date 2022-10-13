package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Course;

public class HibernateProductDao implements ProductDao{

	@Override
	public void add(Course course) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile veri tabanina eklendi");
	}

}
