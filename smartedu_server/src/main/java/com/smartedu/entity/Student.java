package com.smartedu.entity;

import java.util.List;

public class Student {
    private Long id;
    private String name;
    private String email;
    private Long classId;




    public void setId(Long id) {
        this.id = id;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Long getClassId() {
        return classId;
    }

    public String getName() {
        return name;
    }

}
