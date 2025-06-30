package com.smartedu.entity;

import java.util.Date;

public class Task {
    Long id ;
    String title;
    String content;
    Long classId;
    Date dueDate;
    String filename;
    String fileUrl;
    String tag;

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public void setId(Long id) {this.id = id;}


    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public Long getClassId() {
        return classId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getContent() {
        return content;
    }


    public String getTitle() {
        return title;
    }

    public String getFilename() {
        return filename;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public String getTag() {
        return tag;
    }
}

