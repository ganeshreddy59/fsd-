package com.klu;

public class course {

    private String courseName;
    private int duration;

    public course() {
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }
}