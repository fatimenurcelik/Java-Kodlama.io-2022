package kodlamaioDemo.business;

import java.util.ArrayList;

import kodlamaioDemo.dataAccess.ProductDao;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.logging.Logger;

public class CourseManager {
	
	private ProductDao productDao;
	private Logger logger;
	
	public CourseManager(ProductDao productDao, Logger logger) {
		this.productDao =productDao;
		this.logger = logger;
	}
	
	public void add (Course course ,ArrayList<Course> courses ) throws Exception {
		if(CourseValidator.isValid(course,courses)) {
			logger.log();
			courses.add(course);
			productDao.add(course);
		}else {
			System.out.println("eklenemedi - ürün bilgileri geçersizdir.");
		}
	}
}
