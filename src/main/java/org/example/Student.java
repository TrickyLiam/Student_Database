package org.example;


import java.lang.reflect.Constructor;

public class Student {
    private String Name;
    private String GradeLevel;

    private double Balance;

    public Student(String n, String gl) {
        Name = n;
        GradeLevel = gl;
    }

    public String getName() {
        return Name;
    }
    public String getGradeLevel () {
        return GradeLevel;
    }
}
