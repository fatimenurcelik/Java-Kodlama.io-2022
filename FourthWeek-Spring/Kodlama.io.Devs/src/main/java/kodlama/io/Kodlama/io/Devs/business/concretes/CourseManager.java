package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.CourseService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.CourseRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Course;

@Service
public class CourseManager implements CourseService {
    private CourseRepository courseRepository ;

    @Autowired
    public CourseManager(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    
    @Override
    public List<Course> getAll(){
        //is kurallari
        return courseRepository.getAll();
    }
    
	@Override
	public void add(Course course) {
		if(checkName(course)) {
			if(courseRepository.getCourseWithName(course.getName()) == null ) {
				checkId(course);
				courseRepository.add(course);
			}
		}
	}
	
	@Override
	public void delete(Course course) {
		courseRepository.delete(course);
	}
	
	@Override
	public void update(Course course) {
		courseRepository.update(course);
	}
	
	@Override
	public Course getCourseWithId(int id) {
		return courseRepository.getCourseWithId(id);
	}
	
	@Override
	public Course getCourseWithName(String name) {
		return courseRepository.getCourseWithName(name);
	}
	
	@Override
	public boolean checkName(Course course) {
		if(course.getName() == "") {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public void checkId(Course course) {
		if(course.getId() == 0 || course.getId() < 0) {
			int id = course.getId();
			course.setId(id++);
		}
	}
}