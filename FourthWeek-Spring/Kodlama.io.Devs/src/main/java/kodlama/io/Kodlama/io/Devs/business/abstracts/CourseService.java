package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Course;

public interface CourseService {
	List<Course> getAll();
	void add(Course course);
	void delete(Course course);
	void update(Course course);
	Course getCourseWithId(int id);
	Course getCourseWithName(String name);
	boolean checkName(Course course);
	void checkId(Course course);
}
