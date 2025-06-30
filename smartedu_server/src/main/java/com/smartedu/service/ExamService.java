package com.smartedu.service;

import com.smartedu.entity.Exam;
import com.smartedu.mapper.ExamMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService {

    @Resource
    private ExamMapper examMapper;

    public List<Exam> getAllExams() {
        return examMapper.getAllExams();
    }

    public List<Exam> selectAll(Exam exam) {
        return examMapper.selectAll(exam);
    }

    public Exam selectById(Long id) {
        return examMapper.selectById(id);
    }

    public void insert(Exam exam) {
        examMapper.insert(exam);
    }

    public void update(Exam exam) {
        examMapper.update(exam);
    }

    public void deleteById(Long id) {
        examMapper.deleteById(id);
    }
}
