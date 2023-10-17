package aula02.controlFlow.exer03.main;

import aula02.controlFlow.exer03.university.Course;
import aula02.controlFlow.exer03.university.Enrollment;
import aula02.controlFlow.exer03.university.Student;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.courseId = 1234;
        course.courseName = "Biologia";

        Student student = new Student(123, "Felipe");

        Enrollment enrollment = new Enrollment();
        enrollment.course = course;
        enrollment.student = student;

        System.out.println("Curso Id: " + enrollment.course.courseId + " " + enrollment.course.courseName);
        System.out.println("Estudante Id: " + enrollment.student.studentId + " " + enrollment.student.name);
    }
}
