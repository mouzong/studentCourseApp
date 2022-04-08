package com.codegrill;

import java.time.LocalDate;

/**
 * The type Course.
 */
public class Course {
    private String courseName;
    private double courseMark;
    private LocalDate courseStartDate;
    private LocalDate courseEndDate;

    /**
     * Instantiates a new Course.
     *
     * @param courseName      the course name
     * @param courseMark      the course mark
     * @param courseStartDate the course start date
     * @param courseEndDate   the course end date
     */
    public Course(String courseName, double courseMark, LocalDate courseStartDate, LocalDate courseEndDate) {
        this.courseName = courseName;
        this.courseMark = courseMark;
        this.courseStartDate = courseStartDate;
        this.courseEndDate = courseEndDate;
    }

    /**
     * Gets course name.
     *
     * @return the course name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Sets course name.
     *
     * @param courseName the course name
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Gets course mark.
     *
     * @return the course mark
     */
    public double getCourseMark() {
        return courseMark;
    }

    /**
     * Sets course mark.
     *
     * @param courseMark the course mark
     */
    public void setCourseMark(double courseMark) {
        this.courseMark = courseMark;
    }

    /**
     * Gets course start date.
     *
     * @return the course start date
     */
    public LocalDate getCourseStartDate() {
        return courseStartDate;
    }

    /**
     * Sets course start date.
     *
     * @param courseStartDate the course start date
     */
    public void setCourseStartDate(LocalDate courseStartDate) {
        this.courseStartDate = courseStartDate;
    }

    /**
     * Gets course end date.
     *
     * @return the course end date
     */
    public LocalDate getCourseEndDate() {
        return courseEndDate;
    }

    /**
     * Sets course end date.
     *
     * @param courseEndDate the course end date
     */
    public void setCourseEndDate(LocalDate courseEndDate) {
        this.courseEndDate = courseEndDate;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseMark=" + courseMark +
                ", courseStartDate=" + courseStartDate +
                ", courseEndDate=" + courseEndDate +
                '}';
    }


}
