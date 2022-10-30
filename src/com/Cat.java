package com;

public class Cat extends Animal implements pet{
    String name;
    Cat(String name){
        super(4);
        this.name=name;
    }
Cat(){
        this("");
}
    @Override
    public String getName() {

        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {

    }

    @Override
    public void eat() {
        System.out.println();
    }
}
