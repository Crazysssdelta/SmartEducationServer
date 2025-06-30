package com.smartedu.service;

import com.smartedu.entity.Teacher;
import com.smartedu.mapper.TeacherMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Resource
    private TeacherMapper teacherMapper;

    public List<Teacher> getAllTeachers() {
        return teacherMapper.getAllTeachers();
    }

    public List<Teacher> selectAll(Teacher teacher) {
        return teacherMapper.selectAll(teacher);
    }

    public Teacher selectById(Long id) {
        return teacherMapper.selectById(id);
    }

    public void insert(Teacher teacher) {
        teacherMapper.insert(teacher);
    }

    public void update(Teacher teacher) {
        teacherMapper.update(teacher);
    }

    public void deleteById(Long id) {
        teacherMapper.deleteById(id);
    }
}
