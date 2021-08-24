package com.olegyashcherov.car_grouping;

import java.util.Objects;

public class Car implements Comparable<Car> {

    private final CarType carType;
    private final CarModel carModel;

    public Car(CarType carType, CarModel carModel) {
        this.carType = carType;
        this.carModel = carModel;
    }

    public CarType getCarType() {
        return carType;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carType == car.carType && carModel == car.carModel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carType, carModel);
    }

    @Override
    public String toString() {
        return "{" +
                carType +
                ", " + Utils.firstUpperCase(carModel.name()) +
                '}';
    }


    @Override
    public int compareTo(Car c2) {

        int comp1 = this.carType.toString().compareTo(c2.carType.toString());

        if (comp1 != 0) {
            return comp1;
        }

        return this.carModel.compareTo(c2.carModel);
    }
}
