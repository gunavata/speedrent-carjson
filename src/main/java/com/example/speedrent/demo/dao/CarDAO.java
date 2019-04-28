package com.example.speedrent.demo.dao;

import com.example.speedrent.demo.model.Car;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CarDAO {

    int insertCar(UUID id, Car car);

    default int insertCar(Car car) {
        UUID id = UUID.randomUUID();
        return insertCar(id, car);
    }

    List<Car> selectAllCars();

    Optional<Car> selectCarById(UUID id);

    int deleteCarById(UUID id);

    int updateCarById(UUID id, Car car);
}
