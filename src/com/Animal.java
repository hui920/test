package com;

public abstract class Animal {
    int legs;
    Animal(int legs){
        this.legs=legs;
    }
    abstract public void eat();
    public void walk(){
        System.out.println(""+legs);

    }
}
