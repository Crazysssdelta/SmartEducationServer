package com.smartedu.service;

import com.smartedu.entity.TaskGrade;
import com.smartedu.mapper.ExamGradeMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamGradeService {

    @Resource
    private ExamGradeMapper examGradeMapper;

    public List<TaskGrade> getAllGrades() {
        return examGradeMapper.getAllGrades();
    }

    public List<TaskGrade> selectAll(TaskGrade taskGrade) {
        return examGradeMapper.selectAll(taskGrade);
    }

    public TaskGrade selectById(Long id) {
        return examGradeMapper.selectById(id);
    }

    public void addGrade(TaskGrade taskGrade) {
        examGradeMapper.insert(taskGrade);
    }

    public void updateGrade(TaskGrade taskGrade) {
        examGradeMapper.update(taskGrade);
    }

    public void deleteById(Long id) {
        examGradeMapper.deleteById(id);
    }
}
