package com.example.speedrent.demo.api;

import com.example.speedrent.demo.model.Car;
import com.example.speedrent.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequestMapping("/hello")
@RestController
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public void addCar(@Valid @NonNull @RequestBody Car car) {
        carService.addCar(car);
    }

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping(path = "{id}")
    public Car getCarById(@PathVariable("id") UUID id) {
        return carService.getCarById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteCarById(@PathVariable("id") UUID id) {
        carService.deleteCar(id);
    }

    @PutMapping(path = "{id}")
    public void updateCarById(@PathVariable("id") UUID id, @Valid @NonNull @RequestBody Car carToUpdate) {
        carService.updateCar(id, carToUpdate);
    }
}
