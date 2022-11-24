package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        if (this.hasFur){
            if (this.numberOfPaws > 1)
                return "This animal is mostly " + this.color +". It has " + this.numberOfPaws + " paws and a fur.";
            return "This animal is mostly " + this.color +". It has " + this.numberOfPaws + " paw and a fur.";
        }
        if (this.numberOfPaws > 1)
            return "This animal is mostly " + this.color +". It has " + this.numberOfPaws + " paws and no fur.";
        return "This animal is mostly " + this.color +". It has " + this.numberOfPaws + " paw and no fur.";
    }
}
