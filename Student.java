// Matthew Rieckenberg

package com.company;

public class Student {

    private final String name;
    private int grade;
    private final int studentNumber;
    Course course;

    public Student(String name,int studentNumber,Course course,int grade){
        this.studentNumber = studentNumber;
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
        System.out.println(this.name+"'s grade was reset to "+this.grade);
    }

    public String toString(){
        return (this.name+" has a grade of "+this.grade+" in "+this.course.getCourseName()+".");
    }

    public String getName(){
        return this.name;
    }

}
