package com.example.speedrent.demo.dao;

import com.example.speedrent.demo.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakeCarDataAccessService implements CarDAO {

    private static List<Car> DB = new ArrayList<>();

    @Override
    public int insertCar(UUID id, Car car) {
        DB.add(new Car(id, car.getName(), car.getManufacturer()));
        return 1;
    }

    @Override
    public List<Car> selectAllCars() {
        return DB;
    }

    @Override
    public Optional<Car> selectCarById(UUID id) {
        return DB.stream()
                .filter(car -> car.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteCarById(UUID id) {
        Optional<Car> carMaybe = selectCarById(id);
        if (carMaybe.isPresent()) {
            DB.remove(carMaybe.get());
            return 1;
        }
        return 0;
    }

    @Override
    public int updateCarById(UUID id, Car updateCar) {
        return selectCarById(id)
                .map(car -> {
                    int indexOfCarToUpdate = DB.indexOf(car);
                    if (indexOfCarToUpdate >= 0) {
                        DB.set(indexOfCarToUpdate, new Car(id, updateCar.getName(), updateCar.getManufacturer()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }
}
