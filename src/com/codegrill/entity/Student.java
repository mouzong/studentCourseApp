package com.codegrill.entity;

import com.codegrill.entity.Course;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Student.
 */
public class Student {
    private String studentName;
    private String studentEmail;
    private List<Course> studentCourses;

    /**
     * Instantiates a new Student.
     *
     * @param studentName    the student name
     * @param studentEmail   the student email
     * @param studentCourses the student courses
     */
    public Student(String studentName, String studentEmail, List<Course> studentCourses) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentCourses = studentCourses;
    }

    /**
     * Gets student name.
     *
     * @return the student name
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Sets student name.
     *
     * @param studentName the student name
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * Gets student email.
     *
     * @return the student email
     */
    public String getStudentEmail() {
        return studentEmail;
    }

    /**
     * Sets student email.
     *
     * @param studentEmail the student email
     */
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    /**
     * Gets student courses.
     *
     * @return the student courses
     */
    public List<Course> getStudentCourses() {
        return studentCourses;
    }

    /**
     * Sets student courses.
     *
     * @param studentCourses the student courses
     */
    public void setStudentCourses(List<Course> studentCourses) {
        this.studentCourses = studentCourses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentCourses=" + studentCourses +
                '}';
    }

    /**
     * Gets score for course.
     *
     * @param course the course
     * @return the score for a pecific course
     */
    public double getScoreForCourse(Course course) {

        Course courseNeeded = studentCourses.stream()
                .filter(course1 -> course1.getCourseName().equals(course.getCourseName())).findFirst().orElse(null);
        return course.getCourseMark();
    }
}
