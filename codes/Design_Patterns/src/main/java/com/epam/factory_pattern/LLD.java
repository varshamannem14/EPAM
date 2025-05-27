package com.epam.factory_pattern;

public class LLD extends Course{

    @Override
    public void createCourse(){
        modules.add(new IntroModule());
        modules.add(new ExerciseModule());
        modules.add(new SummaryModule());
    }
}
