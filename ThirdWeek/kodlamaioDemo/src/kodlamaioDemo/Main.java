package kodlamaioDemo;

import java.util.ArrayList;

import kodlamaioDemo.business.CourseManager;
import kodlamaioDemo.dataAccess.JdbcProductDao;
import kodlamaioDemo.dataAccess.ProductDao;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.logging.DatabaseLogger;
import kodlamaioDemo.logging.MailLogger;
import kodlamaioDemo.logging.Logger;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Course course1 = new Course (1, "Yaz�l�m geli�tirici yeti�tirme kampi"
				, "C# + Angular ","Engin Demirog", 1000, "Yaz�l�m2020", "images1","EnginPhoto" , 0 );
		
		Course course2 = new Course (2, "Yaz�l�m geli�tirici yeti�tirme kampi2"
				, "Java + React ","Engin Demirog", 1000, "Yaz�l�m2021", "images2","EnginPhoto" , 0 );
		
		Course course3 = new Course (3, "Yaz�l�m geli�tirici yeti�tirme kampi3"
				, "Javascript ","Engin Demirog", 1000, "Yaz�l�m2022", "images3","EnginPhoto" , 0 );
		
		Logger logger = new DatabaseLogger();
		
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		
		//kategori ismi ayn� oldu�u i�in eklenemiyor
		Course course4 = new Course (4, "Yaz�l�m geli�tirici yeti�tirme kampi4"
				, "Python ","Engin Demirog", 1000, "Yaz�l�m2022", "images3","EnginPhoto" , 0 );
		
		//kurs ismi ayn� oldu�u i�in eklenemiyor
		Course course5 = new Course (5, "Yaz�l�m geli�tirici yeti�tirme kampi2"
				, "Python ","Engin Demirog", 1000, "Yaz�l�m2023", "images3","EnginPhoto" , 0 );
		
		//fiyat 0 dan k���k oldu�u i�in eklenemiyor
		Course course6 = new Course (6, "Yaz�l�m geli�tirici yeti�tirme kampi6"
				, "Python ","Engin Demirog", -10, "Yaz�l�m2024", "images3","EnginPhoto" , 0 );
		
		Course course7 = new Course (7, "Yaz�l�m geli�tirici yeti�tirme kampi7"
				, "Python ","Engin Demirog", 10, "Yaz�l�m2024", "images3","EnginPhoto" , 0 );
		
		ProductDao productDao1 = new JdbcProductDao();
		
		CourseManager courseManager = new CourseManager(productDao1,logger);
		
		System.out.println("Course 4 ");
		courseManager.add(course4, courses);
		
		System.out.println("Course 5 ");
		courseManager.add(course5, courses);
		
		System.out.println("Course 6 ");
		courseManager.add(course6, courses);
		
		System.out.println("Course 7 ");
		courseManager.add(course7, courses);
		
		System.out.println("\nKurslar listeleniyor . . .");
		for (int i = 0; i < courses.size(); i++) {
		      System.out.println(courses.get(i).getCourseName() + " - " + courses.get(i).getCourseKeywords());
		}
	}
}
