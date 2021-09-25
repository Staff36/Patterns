package ru.tronin.CarsSellers;

import ru.tronin.Cars.Car;
import ru.tronin.enums.CarType;

public abstract class CarsSeller {
    
    private String label;
    
    public Car orderCar(CarType carType, String engineType, String transmissionType, String color){
        Car car = createCar(carType);
        car.mountEngine(engineType);
        car.mountTransmission(transmissionType);
        car.dye(color);
        car.mountWheels();
        car.stickMarksLabel(label);
        System.out.println("Car have been successfully produced");
        return car;
    }

    public CarsSeller(String label) {
        this.label = label;
    }

    protected abstract Car createCar(CarType carType);

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
