package Streams.savarankiskasDarbas.body;

import lombok.AllArgsConstructor;
import lombok.Data;



public class Student extends Person{

    private String className;
    private int studentGrade;

    public Student(String firstName, String lastName, int age, String className, int studentGrade) {
        super(firstName, lastName, age);
        this.className = className;
        this.studentGrade = studentGrade;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                ", studentGrade=" + studentGrade +
                '}';
    }
}
