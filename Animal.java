package com.novrii.pertemuan3;

public class Animal {

    // Attribute
    private String name;
    private int age;

    // Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    void showInfo() {
        System.out.println("Animal name: " + name);
        System.out.println("Animal age: " + age + " years old");
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
