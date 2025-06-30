package com.smartedu.service;

import com.smartedu.entity.Course;
import com.smartedu.mapper.CourseMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CourseService {

    @Resource
    CourseMapper courseMapper;


    public List<Course> getAllCourses() {
        return courseMapper.getAllCourses();
    }


    public List<Course> selectAll(Course course) {
        return courseMapper.selectAll(course);
    }


    public Course selectById(Long id) {
        return courseMapper.selectById(id);
    }


    public void insert(Course course) {
        courseMapper.insert(course);
    }


    public void update(Course course) {
        courseMapper.update(course);
    }

    public void deleteById(Long id) {
        courseMapper.deleteById(id);
    }
}
