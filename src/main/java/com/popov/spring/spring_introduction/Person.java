package com.popov.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component ("personBean")
public class Person {
    @Autowired
    private Pet pet;
    private String surname;
    private int age;

////    @Autowired
//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Person bean is created");
    }
    // pet -> setPet
//    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

//    @Autowired
//    public void anyMethodName(Pet pet) {
//        System.out.println("Class Person: anyMethodName");
//        this.pet = pet;
//    }

    public String getSurname() {
        System.out.println("Class Person: set age");
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
