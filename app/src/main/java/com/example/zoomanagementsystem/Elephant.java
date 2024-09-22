package com.example.zoomanagementsystem;

public class Elephant extends Animal {

    public Elephant(String name, String type) {
        super(name, type);
    }

    @Override
    public String makeSound() {
        return "Trumpet";
    }

    @Override
    public String displayDetails() {
        return "Name: " + name + "\n" +
                "Type: " + type + "\n" +
                "Sound: " + makeSound() + "\n";
    }
}
