package com.smartedu.controller;

import com.smartedu.common.Result;
import com.smartedu.entity.StudentAnswer;
import com.smartedu.service.StudentAnswerService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentAnswer")
public class StudentAnswerController {

    @Resource
    private StudentAnswerService studentAnswerService;

    // 查询所有
    @GetMapping("/getAll")
    public Result getAll() {
        return Result.success(studentAnswerService.getAllAnswers());
    }

    // 条件查询
    @PostMapping("/selectAll")
    public Result selectAll(@RequestBody StudentAnswer studentAnswer) {
        return Result.success(studentAnswerService.selectAll(studentAnswer));
    }

    // 按 ID 查询
    @GetMapping("/{id}")
    public Result  selectById(@PathVariable Long id) {
        return Result.success(studentAnswerService.selectById(id));
    }

    // 添加
    @PostMapping("/add")
    public Result add(@RequestBody StudentAnswer studentAnswer) {
        studentAnswerService.add(studentAnswer);
        return Result.success();
    }

    // 更新
    @PutMapping("/update")
    public Result update(@RequestBody StudentAnswer studentAnswer) {
        studentAnswerService.update(studentAnswer);
        return Result.success();
    }

    // 删除
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Long id) {
        studentAnswerService.deleteById(id);
        return Result.success();
    }
}
