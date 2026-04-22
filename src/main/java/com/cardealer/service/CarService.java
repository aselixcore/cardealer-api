package com.cardealer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cardealer.model.Car;

@Service
public class CarService {

    private final List<Car> cars = List.of(
            new Car(1L, "Toyota", "GR Yaris", 38990.00, 12000, 1618,
                    "AWD", 257, 360.0, 3995, 1805, 1455, 1280, "Turbo"),
            new Car(2L, "BMW", "M340i", 52990.00, 28000, 2998,
                    "RWD", 374, 500.0, 4713, 1827, 1440, 1660, "Turbo")
    );

    public List<Car> getAllCars() {
        return cars;
    }
}