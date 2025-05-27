package com.epam.factory_pattern;

public class CourseFactory {

    public static Course getCourse(String courseType){
        if(courseType.equalsIgnoreCase("LLD")){
            return new LLD();
        }
        else if(courseType.equalsIgnoreCase("HLD")){
            return new HLD();
        }
        return null;
    }
}
