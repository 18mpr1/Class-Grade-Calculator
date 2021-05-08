// Matt Rieckenberg

package com.company;

import java.util.Arrays;

public class Course {
    private String courseName;
    private int maxStudents;
    private int numStudents;
    private Student[] students;


    public Course(){
        this.courseName = "";
        this.maxStudents = 500;
        this.numStudents = 0;
        this.students = new Student[0];
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public void setMaxStudents(int maxStudents){
        this.maxStudents = maxStudents;
    }

    public void addStudent(Student student){
        this.numStudents++;
        students = Arrays.copyOf(students, numStudents);
        students[numStudents - 1] = student;
        System.out.println(student.getName()+" was successfully added to "+this.courseName+".");
    }

    public int getMaxStudents(){
        return this.maxStudents;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public void classList(Student[] students){
        // run for loop that prints all the students
    }



}
