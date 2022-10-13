package kodlamaioDemo.business;

import java.util.ArrayList;

import kodlamaioDemo.entities.Course;

public class CourseValidator {
	public static boolean isValid (Course course ,ArrayList<Course> courses ) throws Exception {
		boolean result =true;
		if (course.getPrice() < 0) {
			result = false;
            //throw new Exception("Ürün fiyatý 0'dan küçük olamaz.");
        }else {
        	 for(Course course1: courses) {
 	            if(course1.getCourseName() == course.getCourseName()) {
 	            	result = false;
 	                //throw new Exception("Kurs ismi ayný olamaz.");
 	            }
 	            if(course1.getCategory() == course.getCategory()) {
 	            	result = false;
 	                //throw new Exception("Kurs ismi ayný olamaz.");
 	            }
        	 }
        }
		return result;
	}
}