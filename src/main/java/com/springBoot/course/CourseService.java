package com.springBoot.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jta.atomikos.AtomikosProperties;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List <Course> getAllCourses(String topicId){
        List<Course> courses = new ArrayList<>();
        courses.addAll(courseRepository.findByTopicId(topicId));
        return courses;
    }
// other way of doing the above method

//    public List <Course> getAllCourses(String topicId){
//        List<Course> courses = new ArrayList<>();
//        courseRepository.findByTopicId(topicId)
//                .forEach(courses::add);
//        return courses;
//    }

    public Course getCourse(String id){
        Course t = courseRepository.findById(id).get();
        return t;
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}

