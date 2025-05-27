package com.epam.factory_pattern;

public class HLD extends Course{

    @Override
    public void createCourse(){
        modules.add(new IntroModule());
        modules.add(new DemoModule());
        modules.add(new SummaryModule());
    }
}
