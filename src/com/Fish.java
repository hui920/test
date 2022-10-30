package com;

public class Fish extends Animal implements pet{
    @Override
    public void eat() {

    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("yu没有退可以走");
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void play() {
        System.out.println();
    }
    Fish(){
        super(0);
    }
    private String name;

}
