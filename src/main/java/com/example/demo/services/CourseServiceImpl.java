package com.example.demo.services;

import com.example.demo.entity.Course;
import org.springframework.stereotype.Service;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{
    List<Course>list;
    public CourseServiceImpl()
    {
        list = new ArrayList<>();
        list.add(new Course(145,"Java Course Course","asis of java"));
        list.add(new Course(165,"Python Course","Rest API"));
        list.add(new Course(166,"Current Course","API"));
        list.add(new Course(167," Course","Rest "));
    }


    @Override
    public List<Course> getCourses()
    {
        return list;
    }

    @Override
    public Course getCourse(Long courseID) {
        Course c =null;
        for(Course course:list)
        {
            if(course.getId() == courseID)
            {
                c= course;
            }
        }
        return c;
    }


}
