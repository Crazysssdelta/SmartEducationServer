package com.smartedu.entity;

public class Course {
    Long id;
    String title;
    String description;
    Long teacherId;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public String getDescription() {
        return description;
    }
}
