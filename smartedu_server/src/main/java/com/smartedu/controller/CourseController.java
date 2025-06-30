package com.smartedu.controller;

import com.smartedu.common.Result;
import com.smartedu.entity.Course;
import com.smartedu.service.CourseService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Resource
    CourseService courseService;

    @GetMapping("/getAll")
    public Result getAll() {
        List<Course> list  = courseService.getAllCourses();
        return Result.success(list);
    }

    @PostMapping("/selectAll")
    public Result selectAll(@RequestBody Course course) {
        List<Course> list = courseService.selectAll(course);
        return Result.success(list);
    }

    @GetMapping("/selectById/{id}")
    public Result getById(@PathVariable Long id) {
        return Result.success(courseService.selectById(id));
    }

    @PostMapping("/add")
    public Result add(@RequestBody Course course) {
        courseService.insert(course);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Course course) {
        courseService.update(course);
        return Result.success();
    }

    @DeleteMapping("/delete/{id}")
    public Result  delete(@PathVariable Long id) {
        courseService.deleteById(id);
        return Result.success();
    }
}
