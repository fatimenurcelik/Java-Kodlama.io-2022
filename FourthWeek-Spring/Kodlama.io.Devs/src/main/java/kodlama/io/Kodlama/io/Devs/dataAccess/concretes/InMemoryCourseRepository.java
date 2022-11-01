package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.CourseRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Course;

@Service
public class InMemoryCourseRepository implements CourseRepository {
    List <Course> courses;

    public InMemoryCourseRepository() {
        courses = new ArrayList<Course>();//set tree set
        courses.add(new Course (1, "Java"));
        courses.add(new Course (2, "C#"));
        courses.add(new Course (3, "Python"));
        courses.add(new Course (5, "C"));
    }

    @Override
    public List <Course> getAll() {
        return courses;
    }

	@Override
	public void add(Course course) {
		courses.add(course);
	}

	@Override
	public void delete(Course course) {
		courses.remove(course.getId());		
	}

	@Override
	public void update(Course course) {
		
	}

	@Override
	public Course getCourseWithId(int id) {
		for(Course course:courses) {
			if(course.getId() == id) {
				return course;
			}
		}
		return null;
	}

	@Override
	public Course getCourseWithName(String name) {
		for(Course course:courses) {
			if(course.getName() == name) {
				return course;
			}
		}
		return null;
	}
}