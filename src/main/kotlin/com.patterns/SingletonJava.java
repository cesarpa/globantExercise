package com.patterns;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SingletonJava {

    // we have to create an static instance of the root class
    private static SingletonJava instance = null;

    // then put the constructor in private mode in order to cannot be created from another source
    private SingletonJava() {

    }

    // finally create the method that you are going to expose to the other classes and the logic for do not override or create an instance even if it was created
    // also we can use synchronized to the class in order to avoid multithreading
    // synchronized (Singleton.class){}
    public static SingletonJava getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new SingletonJava();
                }
            }
        }
        var numbers = Arrays.asList(2,3,5);
        numbers.stream().reduce(0,(x,y)-> x+y);
        return instance;
    }
}
