package com.revision.demo;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getter methods are required for JSON serialization
    public String getName() { 
    	return name; 
    }
    public int getAge() { 
    	return age; 
    }
}