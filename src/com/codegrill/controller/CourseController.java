package com.codegrill.controller;

import com.codegrill.entity.Course;
import com.codegrill.entity.Student;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Course controller.
 */
public class CourseController {
    /**
     * Get students details list.
     *
     * @param course   the course
     * @param students the students
     * @return the list of students registered to the given course
     */
    public List<Student> getStudentsDetails(Course course, List<Student> students){
        return students.stream()
                .filter(student->student.getStudentCourses().contains(course))
                .collect(Collectors.toList());

    }

    /**
     * Get average score of students for a given course double.
     *
     * @param course   the course
     * @param students the students
     * @return the double
     */
    public double getAverageScoreOfStudentsForAGivenCourse(Course course, List<Student> students){
        List<Student> studentsInCourse = getStudentsDetails(course, students);
        return studentsInCourse.stream()
                .collect(Collectors.averagingDouble(student->student.getScoreForCourse(course)));
    }

    /**
     * Get available courses for given date list.
     *
     * @param date    the date
     * @param courses the courses
     * @return the list of courses at a given date
     */
    public List<Course> getAvailableCoursesForGivenDate(LocalDate date, List<Course> courses){

        return courses.stream()
                .filter(course->(course.getCourseStartDate().isBefore(date) && course.getCourseEndDate().isAfter(date)))
                .collect(Collectors.toList());
    }
}
