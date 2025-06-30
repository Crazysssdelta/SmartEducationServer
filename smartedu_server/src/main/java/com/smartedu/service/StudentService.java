package com.smartedu.service;

import com.smartedu.entity.Student;
import com.smartedu.mapper.StudentMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Resource
    StudentMapper studentMapper;


    public List<Student> getALlstudents(){
        return studentMapper.getAllstudents();
    }

    public List<Student> selectAll(Student student) {
        return studentMapper.selectAll(student);
    }

    public Student selectById(Long id){
        return studentMapper.selectById(id);
    };



    /** 新增班级，成功返回插入后带主键的对象 */
    public void addStudent(Student student){
        studentMapper.insert(student);
    };

    /** 更新班级信息，成功返回 true */
    public void updateStudent(Student student){
        studentMapper.update(student);
    };

    /** 根据 ID 删除班级，成功返回 true */
    public void deleteById(Long id){
        studentMapper.deleteById(id);
    };

}
