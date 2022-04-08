package com.codegrill;

import com.codegrill.entity.Course;
import com.codegrill.entity.Student;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.List;

/**
 * The type Main.
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
	// Example course
        Course course1 = new Course(
                "Java Programming",
                0.0,
                LocalDate.of(2022,01,13),
                LocalDate.of(2022,01,26)
        );

        // Example student instantiation using he second constructor
        Student student1 = new Student(
                "Madhu",
                "madhukarmadhu235@gmail.com"
        );

        student1.registerStudentToCourse(course1);
        System.out.println(student1);
    }
}
