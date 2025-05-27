package com.epam.factory_pattern;

public class App {
    public static void main(String[] args) {

        Course hldCourse = CourseFactory.getCourse("HLD");
        Course lldCourse = CourseFactory.getCourse("LLD");

        if(hldCourse!=null){
            System.out.println(hldCourse.modules);
        }
        if(lldCourse!=null){
            System.out.println(lldCourse.modules);
        }

    }
}
