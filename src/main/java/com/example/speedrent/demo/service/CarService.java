package com.example.speedrent.demo.service;

import com.example.speedrent.demo.dao.CarDAO;
import com.example.speedrent.demo.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CarService {

    private final CarDAO carDao;

    @Autowired
    public CarService(@Qualifier("fakeDao") CarDAO carDao) {
        this.carDao = carDao;
    }

    public int addCar(Car car) {
        return carDao.insertCar(car);
    }

    public List<Car> getAllCars() {
        return carDao.selectAllCars();
    }

    public Optional<Car> getCarById(UUID id) {
        return carDao.selectCarById(id);
    }

    public int deleteCar(UUID id) {
        return carDao.deleteCarById(id);
    }

    public int updateCar(UUID id, Car newCar) {
        return carDao.updateCarById(id, newCar);
    }
}
