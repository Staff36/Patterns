package ru.tronin.CarsSellers;

import ru.tronin.Cars.Car;
import ru.tronin.Cars.SedanCar;
import ru.tronin.Cars.SuvCar;
import ru.tronin.enums.CarType;

public class ToyotaSeller extends CarsSeller {

    public ToyotaSeller() {
        super("Toyota");
    }


    @Override
    protected Car createCar(CarType carType) {
        Car car;
        switch (carType) {
            case SUV -> car = new SuvCar();
            case SEDAN -> car = new SedanCar();
            default -> throw new IllegalStateException("Toyota does not produce cars with type: " + carType);
        }
        return car;
    }
}
