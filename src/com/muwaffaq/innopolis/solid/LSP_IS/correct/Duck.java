package com.muwaffaq.innopolis.solid.LSP_IS.wrong;

public class Duck implements Bird, BirdFly, BirdSwim {

    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void hatch() {
        System.out.println("laying eggs");
    }

    @Override
    public void swim() {
        System.out.println("swimming");
    }
}
