package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.CourseService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Course;

@RestController //annotation Bilgilendirme
@RequestMapping("/api/courses") //adresleme

public class CoursesController {
    private CourseService courseService;

    public CoursesController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/getall")
    public List<Course> getAll(){
        return courseService.getAll();
    }
    
    @DeleteMapping("/delete")
    public List<Course> delete(Course course){
         courseService.delete(course);
         return courseService.getAll();
    }
    
    @PutMapping("/update")
    public List<Course> update (Course course){
         courseService.update(course);
         return courseService.getAll();
    }
    
    @PostMapping("/add")
    public List<Course> add (Course course){
         courseService.add(course);
         return courseService.getAll();
    }
    
    @GetMapping("/getCourseWithName")
    public Course getCourseWithName (String name){
         return courseService.getCourseWithName(name);
    }
    
    @GetMapping("/getCourseWithId")
    public Course getCourseWithId (int num){
         return courseService.getCourseWithId(num);
    }
}