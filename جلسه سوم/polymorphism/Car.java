package com.polymorphism;

public class Car extends Vehicle {

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public void breake() {
        super.breake();
    }
    public void chair(){
        System.out.println("Car Chair Method");
    }
    public void command(){
        System.out.println("CAr Command Method");
    }
}
