package com.olegyashcherov.car_grouping;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;

public class Main {

    private static final int setSize = CarModel.values().length * CarType.values().length;

    public static void main(String[] args) {

        Set<Car> carSet = new TreeSet<>();
        // Наполняем сет всеми возможными комбинациями типов и моделей автомобилей
        while (carSet.size() != setSize) {
            CarType carType = Utils.randomEnum(CarType.class);
            CarModel carModel = Utils.randomEnum(CarModel.class);
            carSet.add(new Car(carType, carModel));
        }
        System.out.println("Начальное множество автомобилей:\n");

        for (Car car:carSet) {
            System.out.println(car);
        }

        //Группируем с помощью Stream
        Map<CarType, List<Car>> carByType = carSet.stream().collect(groupingBy(Car::getCarType));
        for (Map.Entry<CarType, List<Car>> entry : carByType.entrySet()) {
            System.out.println("\nГруппа: " + entry.getKey() + "\n******************************************************");
            System.out.println(entry.getValue());
        }
    }
}
