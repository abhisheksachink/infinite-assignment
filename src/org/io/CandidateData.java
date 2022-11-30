package org.io;

import java.io.Serializable;

public class CandidateData implements Serializable {
    private String candId;
    private String name;
    private String course;

    public CandidateData(String candId, String name, String course) {
        this.candId = candId;
        this.name = name;
        this.course = course;
    }

    public String getCandId() {
        return candId;
    }

    public void setCandId(String candId) {
        this.candId = candId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "CandidateData{" +
                "candId=" + candId +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
