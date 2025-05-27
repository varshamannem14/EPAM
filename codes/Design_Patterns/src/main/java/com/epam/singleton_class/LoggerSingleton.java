package com.epam.singleton_class;



public class LoggerSingleton {

    private static volatile LoggerSingleton instance = null;

    private LoggerSingleton(){
        if(instance!=null){
            throw new RuntimeException("Please dont try to be smart");
        }
    }

    public static LoggerSingleton getInstance(){
        if(instance==null){
            synchronized (LoggerSingleton.class){
                if(instance==null){
                    instance=new LoggerSingleton();
                }
            }
        }
        return instance;
    }


}

/*
//eager-loading

private static LoggerSingleton instance = null;

private LoggerSingleton(){

}

public static LoggerSingleton getInstance(){
    if(instance==null){
        instance=new LoggerSingleton();
    }
    return instance;
}


 */
