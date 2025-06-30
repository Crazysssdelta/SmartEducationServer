package com.smartedu.entity;

public class Teacher {
    Long id;
    String name;
    String email;
    Long classId;

    public void setId(Long id) {
        this.id = id;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public Long getClassId() {
        return classId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
