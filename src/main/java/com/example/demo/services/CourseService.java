package com.example.demo.services;

import com.example.demo.entity.Course;

import java.util.List;

public interface CourseService {
   public List<Course> getCourses();
  public Course getCourse(Long courseID);
}
