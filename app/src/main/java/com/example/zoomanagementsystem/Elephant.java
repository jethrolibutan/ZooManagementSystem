package com.example.zoomanagementsystem;

public class Elephant extends Animal {

    public Elephant(String name, String type) {
        super(name, type);
    }

    @Override
    public String makeSound() {
        return "Growl";
    }

    @Override
    public String displayDetails(){
        return "These are the details";
    }
}
