package com.smartedu.controller;

import com.smartedu.common.Result;
import com.smartedu.entity.TaskGrade;
import com.smartedu.service.TaskGradeService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/taskgrade")
public class TaskGradeController {

    @Resource
    private TaskGradeService taskGradeService;

    @GetMapping("/getAll")
    public Result getAllGrades() {
        List<TaskGrade> list = taskGradeService.getAllGrades();
        return Result.success(list);
    }

    @GetMapping("/selectAll")
    public Result selectAllGrades(TaskGrade taskGrade) {
        List<TaskGrade> list = taskGradeService.selectAll(taskGrade);
        return Result.success(list);
    }

    @GetMapping("/selectById/{id}")
    public Result selectById(@PathVariable Long id) {
        TaskGrade taskGrade = taskGradeService.selectById(id);
        return Result.success(taskGrade);
    }

    @PostMapping("/add")
    public Result add(@RequestBody TaskGrade taskGrade) {
        taskGradeService.addGrade(taskGrade);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody TaskGrade taskGrade) {
        taskGradeService.updateGrade(taskGrade);
        return Result.success();
    }

    @DeleteMapping("/deleteById/{id}")
    public Result deleteById(@PathVariable Long id) {
        taskGradeService.deleteById(id);
        return Result.success();
    }
}
