package com.smartedu.service;

import com.smartedu.entity.Submission;
import com.smartedu.mapper.SubmissionMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class SubmissionService {

    @Resource
    SubmissionMapper submissionMapper;

    public List<Submission> getAllSubmissions() {
        return submissionMapper.getAllSubmissions();
    }

    public Submission selectById(Long id) {
        return submissionMapper.selectById(id);
    }

    public List<Submission> selectAll(Submission submission) {
      return submissionMapper.selectAll(submission);
    }

    public void addSubmission(Submission submission) {
        submissionMapper.insert(submission);
    }

    public void updateSubmission(Submission submission) {
        submissionMapper.update(submission);
    }

    public void deleteById(Long id) {
        submissionMapper.deleteById(id);
    }

}
