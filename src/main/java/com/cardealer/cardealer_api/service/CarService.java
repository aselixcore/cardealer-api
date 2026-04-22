package com.cardealer.cardealer_api.service;

import com.cardealer.cardealer_api.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class CarService {

    private final List<Car> cars = new CopyOnWriteArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    public List<Car> getAllCars() {
        return List.copyOf(cars);
    }

    public Car createCar(Car car) {
        Objects.requireNonNull(car, "car must not be null");

        car.setId(idGenerator.getAndIncrement());
        cars.add(car);
        return car;
    }
}
