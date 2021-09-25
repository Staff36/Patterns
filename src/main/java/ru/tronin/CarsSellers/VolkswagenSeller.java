package ru.tronin.CarsSellers;

import ru.tronin.Cars.Car;
import ru.tronin.Cars.HatchbackCar;
import ru.tronin.Cars.SedanCar;
import ru.tronin.Cars.SuvCar;
import ru.tronin.enums.CarType;

public class VolkswagenSeller extends CarsSeller{

    public VolkswagenSeller(){
        super("Volkswagen");
    }

    @Override
    protected Car createCar(CarType carType) {
        Car car;
        switch (carType){
            case SUV -> car = new SuvCar();
            case SEDAN -> car = new SedanCar();
            case HATCHBACK -> car = new HatchbackCar();
            default -> throw new IllegalStateException("Car with type: " + carType + " not exist");
        }
        return car;
    }
}
