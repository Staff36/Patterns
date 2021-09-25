package ru.tronin.Cars;

public abstract class Car {

    public void mountEngine(String engineModel){
        System.out.println("Mounting " + engineModel + " into the car");
    }

    public void mountTransmission(String transmissionModel){
        System.out.println("Mounting " + transmissionModel + " into the car");
    }

    public void dye(String color) {
        System.out.println("Dying car in " + color);
    }

    public void mountWheels(){
        System.out.println("Mounting wheel with the car");
    }
    public void stickMarksLabel(String label){
        System.out.println("Sticking label of " + label + " on the car");
    }

}
