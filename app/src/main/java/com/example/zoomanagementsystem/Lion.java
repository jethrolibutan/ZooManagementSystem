package com.example.zoomanagementsystem;

public class Lion extends Animal{
    public Lion(String name, String type){
        super(name, type);
    }

    @Override
    public String makeSound() {
        return "Roar";
    }

    @Override
    public String displayDetails() {
        return "Name: " + name + "\n" +
                "Type: " + type + "\n" +
                "Sound: " + makeSound() + "\n";
    }
}
