package com.smartedu.controller;

import com.smartedu.common.Result;
import com.smartedu.service.FileService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.smartedu.entity.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/files")
public class FileController {
    @Resource
    FileService fileService;


    @PostMapping("/upload")
    public Result upload(@RequestParam("file")MultipartFile file,@RequestParam("fileUrl")String fileUrl) throws IOException {
        Result result = fileService.upload(file,fileUrl);
        return result;
    }



        @GetMapping("/getAll")
        public Result getAllFiles() {
            List<File> list = fileService.getAllFiles();
            return Result.success(list);
        }

        @GetMapping("/selectAll")
        public Result selectAll(File file) {
            List<File> list = fileService.selectAll(file);
            return Result.success(list);
        }

        @GetMapping("/selectById/{id}")
        public Result selectById(@PathVariable Long id) {
            File file = fileService.selectById(id);
            return Result.success(file);
        }

        @PostMapping("/add")
        public Result add(@RequestBody File file) {
            fileService.addFile(file);
            return Result.success();
        }

        @PutMapping("/update")
        public Result update(@RequestBody File file) {
            fileService.updateFile(file);
            return Result.success();
        }

        @DeleteMapping("/deleteById/{id}")
        public Result deleteById(@PathVariable Long id) {
            fileService.deleteById(id);
            return Result.success();
        }

        @DeleteMapping("/deleteByUrl")
        public Result deleteByUrl(@RequestParam("fileUrl") String fileUrl) {
            fileService.deleteByUrl(fileUrl);
            return Result.success();
        }

}