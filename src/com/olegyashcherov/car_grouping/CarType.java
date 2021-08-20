package com.olegyashcherov.car_grouping;

public enum CarType {
    SEDAN("Седан"),
    HATCHBACK("Хэтчбэк"),
    ESTATE("Универсал"),
    COUPE("Купе"),
    SUV("Внедорожник"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    TRUCK("Грузовик");

    String type;

    CarType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
