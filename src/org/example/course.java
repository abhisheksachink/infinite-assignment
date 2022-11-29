package org.example;

public class course {
    course(String courseName, int courseId, int fee){
        this.courseId=courseId;
        this.courseName=courseName;
        this.fee=fee;

    }
    private int courseId;
    private String courseName;
    private int fee;

    public int getCourseId() {
        return courseId;
    }


    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", fee=" + fee +
                '}';
    }
}
