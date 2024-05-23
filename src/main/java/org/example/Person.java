package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    boolean isMarried;
    int height;
    int weight;

    public Person(String firstName, String lastName, int age){
        this(187, 85, false);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(int height, int weight, boolean isMarried){
        this.height = height;
        this.weight = weight;
        this.isMarried = isMarried;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName (){
        return lastName;
    }
    public int getAge (){
        return age;
    }
    public boolean isTeen(){
        return age >= 13 && age <= 19;
    }
}
