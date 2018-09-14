package com.training.session2;

class Car extends Vehicle {
    Wheel[] wheels;
    Engine engine;
    String color;

    Car(String color){
        this.color = color;
    }

    void  drive(){
        System.out.println("Hi i am driving car with engine["+ engine.engineType + ","+engine.capacity+" ] having color : "+ color );

    }




}
