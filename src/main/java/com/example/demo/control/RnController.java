package com.example.demo.control;

import com.example.demo.entity.Course;
import com.example.demo.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RnController {

    @Autowired(required = true)
    private CourseService courseService;
   // get the courses
    @GetMapping("/courses")
   public List<Course> getCourses()
   {
         return this.courseService.getCourses();

   }
    @GetMapping("/courses/{courseId}")
    public Course returnCourses(@PathVariable String courseId)
    {
        return this.courseService.getCourse(Long.parseLong(courseId));

    }


}
