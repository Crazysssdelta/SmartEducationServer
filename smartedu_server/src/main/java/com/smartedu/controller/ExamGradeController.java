package com.smartedu.controller;

import com.smartedu.common.Result;
import com.smartedu.entity.TaskGrade;
import com.smartedu.service.ExamGradeService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/examgrade")
public class ExamGradeController {

    @Resource
    private ExamGradeService examGradeService;

    @GetMapping("/getAll")
    public Result getAllGrades() {
        List<TaskGrade> list = examGradeService.getAllGrades();
        return Result.success(list);
    }

    @GetMapping("/selectAll")
    public Result selectAllGrades(TaskGrade taskGrade) {
        List<TaskGrade> list = examGradeService.selectAll(taskGrade);
        return Result.success(list);
    }

    @GetMapping("/selectById/{id}")
    public Result selectById(@PathVariable Long id) {
        TaskGrade taskGrade = examGradeService.selectById(id);
        return Result.success(taskGrade);
    }

    @PostMapping("/add")
    public Result add(@RequestBody TaskGrade taskGrade) {
        examGradeService.addGrade(taskGrade);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody TaskGrade taskGrade) {
        examGradeService.updateGrade(taskGrade);
        return Result.success();
    }

    @DeleteMapping("/deleteById/{id}")
    public Result deleteById(@PathVariable Long id) {
        examGradeService.deleteById(id);
        return Result.success();
    }
}
