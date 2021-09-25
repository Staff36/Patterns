package ru.tronin;

import ru.tronin.Cars.Car;
import ru.tronin.CarsSellers.ToyotaSeller;
import ru.tronin.CarsSellers.VolkswagenSeller;
import ru.tronin.enums.CarType;

public class Application {
    public static void main(String[] args) {
        System.out.println("============================Volkswagen====================================");
        VolkswagenSeller volkswagenSeller = new VolkswagenSeller();
        Car volkswagenSedan = volkswagenSeller.orderCar(CarType.SEDAN, "TSI", "DQ500", "Blue");
        System.out.println("==============================Toyota======================================");
        ToyotaSeller toyotaSeller = new ToyotaSeller();
        Car toyotaSuv = toyotaSeller.orderCar(CarType.SUV, "2JZ", "ISIN", "Grey");


    }


}
