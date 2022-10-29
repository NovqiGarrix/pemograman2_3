package com.novrii.pertemuan3;

public class Main {

    public static void main(String[] args) {

        var dog = new Animal("Doggy", 2);

        dog.showInfo();

        var cat = new Animal("Cat", 1);

        cat.showInfo();
        var sheep = new Animal("Sheep", 5);

        sheep.showInfo();

        System.out.println("Usia " + dog.getName() + " adalah " + dog.getAge());

        dog.setName("Blacky Dog");
        dog.setAge(3);

        System.out.println("-- Apply some Changes... --");

        System.out.println("Usia " + dog.getName() + " adalah " + dog.getAge());

    }

}
