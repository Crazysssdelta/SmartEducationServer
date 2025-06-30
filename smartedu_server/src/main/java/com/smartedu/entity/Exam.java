package com.smartedu.entity;

import java.util.Date;

public class Exam {
    Long id;
    Long questionId;
    Long courseId;

    Double totalscore;

    Date startTime;
    Date endTime;
    String title;
    String tag;

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setTotalScore(Double totalscore) {
        this.totalscore = totalscore;
    }

    public Long getCourseId() {
        return courseId;
    }

    public String getTag() {
        return tag;
    }
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public Date getEndTime() {
        return endTime;
    }
    public Long getQuestionId() {
        return questionId;
    }
    public Date getStartTime() {
        return startTime;
    }
    public Double getTotalScore() {
        return totalscore;
    }


}
