// CCRM/src/edu/ccrm/domain/Student.java
package edu.ccrm.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Student extends Person {
    private String regNo;
    private Status status;
    private List<String> enrolledCourses;

    
    public enum Status {
        ACTIVE, DEACTIVATED
    }

    
    public Student(String regNo, String fullName, String email) {
        super(fullName, email, LocalDate.now());
        if (regNo == null || regNo.isEmpty()) throw new IllegalArgumentException("Registration number cannot be empty");
        this.regNo = regNo;
        this.status = Status.ACTIVE;
        this.enrolledCourses = new ArrayList<>();
    }

    
    public String getRegNo() { return regNo; }
    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }
    public List<String> getEnrolledCourses() { return enrolledCourses; }

    
    public void enrollCourse(String courseCode) {
        if (!enrolledCourses.contains(courseCode)) {
            enrolledCourses.add(courseCode);
        }
    }

    
    public void unenrollCourse(String courseCode) {
        enrolledCourses.remove(courseCode);
    }

    @Override
    public String getProfileInfo() {
        return "Student[RegNo=" + regNo + ", Name=" + fullName + ", Email=" + email + ", Status=" + status + "]";
    }

    @Override
    public String toString() {
        return getProfileInfo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return regNo.equals(student.regNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNo);
    }
}