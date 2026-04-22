package com.cardealer.cardealer_api.controller;

import com.cardealer.cardealer_api.model.Car;
import com.cardealer.cardealer_api.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Car createCar(@RequestBody Car car) {
        return carService.createCar(car);
    }
}
