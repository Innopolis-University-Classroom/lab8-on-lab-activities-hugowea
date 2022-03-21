package com.muwaffaq.innopolis.solid.LSP_IS.wrong;


public class Penguin implements Bird, BirdSwim {

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
        System.out.println("swim");
    }


}
© 2022 GitHub, Inc.
