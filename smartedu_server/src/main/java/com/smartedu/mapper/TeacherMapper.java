package com.smartedu.mapper;

import com.smartedu.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper {

    List<Teacher> getAllTeachers();

    List<Teacher> selectAll(Teacher teacher);

    Teacher selectById(Long id);

    void insert(Teacher teacher);

    void update(Teacher teacher);

    void deleteById(Long id);
}
