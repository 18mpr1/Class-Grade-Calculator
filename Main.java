// Matthew Rieckenberg

package com.company;

public class Main {

    public static void main(String[] args) {
        Course ELEC_279 = new Course();
        ELEC_279.setMaxStudents(250);
        ELEC_279.setCourseName("Intro to Java OOP");


        Student Matt = new Student("Matthew Rieckenberg",20147653,ELEC_279,50);
        Matt.setGrade(90);
        ELEC_279.addStudent(Matt);
        System.out.println(Matt.toString());
    }
}
