package com.smartedu.controller;

import com.smartedu.common.Result;
import com.smartedu.entity.Student;
import com.smartedu.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    StudentService studentService;

    @GetMapping("/getAll")

    @Cacheable(value = "studentList")

    public Result getAllstudents() {
        List<Student> list = studentService.getALlstudents(); // 方法名应与 Service 对应
        return Result.success(list);

    }

    @PostMapping("/selectAll")
    public Result selectAll(@RequestBody Student student) {
        List<Student> list = studentService.selectAll(student);
        return Result.success(list);
    }


    @GetMapping("/selectById/{id}")
    public Result selectById(@PathVariable Long id){
        Student student = studentService.selectById(id);
        return Result.success(student);

    }

    @PostMapping("/add")
    public Result add(@RequestBody Student student) {
        studentService.addStudent(student);
        return Result.success();
    }

    @DeleteMapping("/deleteById/{id}")
    public Result deleteById(@PathVariable Long id) {
        studentService.deleteById(id);
        return Result.success();
    }
    @PutMapping("/update")
    public Result update(@RequestBody Student student) {
        studentService.updateStudent(student);
        return Result.success();
    }

}
