package com.solomon.springdemo.Model;

import com.solomon.springdemo.annotation.CourseCode;

import javax.validation.constraints.NotNull;

public class Course {

    @NotNull(message = "Should not be empty")
    private String courseName;

    @CourseCode(value = "LUV", message = "must start with LUV")
    private String courseCode;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
