package com.smartedu.service;

import com.smartedu.common.Result;
import com.smartedu.mapper.FileMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.smartedu.entity.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class FileService {


    @Resource
    private FileMapper fileMapper;

    public Result upload(MultipartFile file,String fileUrl) {
        if (file.isEmpty()) {
            return Result.error("500","上传失败：文件为空");
        }


        String uploadDirPath = System.getProperty("user.dir") + "/files";
        java.io.File uploadDir = new java.io.File(uploadDirPath);
        if (!uploadDir.exists()) {
            boolean created = uploadDir.mkdirs();
//            System.out.println("创建目录：" + created);
        }
//        String originalFilename = file.getOriginalFilename();
//        if (originalFilename == null || originalFilename.trim().isEmpty()) {
//            return Result.error("111","上传失败：文件名非法");
//        }
//        String timestamp = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
//        String safeFilename = timestamp + "_" + originalFilename.replaceAll("[\\\\/:*?\"<>|]", "_");
//fileUrl为file的savename


        java.io.File dest = new java.io.File(uploadDir, fileUrl);
        System.out.println("准备保存到: " + dest.getAbsolutePath());

        try {
            file.transferTo(dest);
            System.out.println("文件保存成功");
        } catch (IOException e) {
            e.printStackTrace(); // 打印详细错误
            return Result.error("500","文件保存失败：" + e.getMessage());
        }

        return Result.success("文件上传成功：" + fileUrl);
    }




        public List<File> getAllFiles() {
            return fileMapper.getAllFiles();
        }


        public List<File> selectAll(File file) {
            return fileMapper.selectAll(file);
        }


        public File selectById(Long id) {
            return fileMapper.selectById(id);
        }


        public void addFile(File file) {
            fileMapper.insert(file);
        }


        public void updateFile(File file) {
            fileMapper.update(file);
        }


        public void deleteById(Long id) {
            fileMapper.deleteById(id);
        }


        public void deleteByUrl(String fileUrl) {

            String DirPath = System.getProperty("user.dir") + "/files/"+fileUrl;
            if (DirPath != null) {
                java.io.File localFile = new java.io.File(DirPath);
                if (localFile.exists()) {
                    localFile.delete();
                }
            }
            fileMapper.deleteByUrl(fileUrl);
        }

    }


