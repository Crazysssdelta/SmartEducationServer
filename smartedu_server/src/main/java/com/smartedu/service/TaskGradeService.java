package com.smartedu.service;

import com.smartedu.entity.TaskGrade;
import com.smartedu.mapper.TaskGradeMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskGradeService {

    @Resource
    private TaskGradeMapper taskGradeMapper;

    public List<TaskGrade> getAllGrades() {
        return taskGradeMapper.getAllGrades();
    }

    public List<TaskGrade> selectAll(TaskGrade taskGrade) {
        return taskGradeMapper.selectAll(taskGrade);
    }

    public TaskGrade selectById(Long id) {
        return taskGradeMapper.selectById(id);
    }

    public void addGrade(TaskGrade taskGrade) {
        taskGradeMapper.insert(taskGrade);
    }

    public void updateGrade(TaskGrade taskGrade) {
        taskGradeMapper.update(taskGrade);
    }

    public void deleteById(Long id) {
        taskGradeMapper.deleteById(id);
    }
}
