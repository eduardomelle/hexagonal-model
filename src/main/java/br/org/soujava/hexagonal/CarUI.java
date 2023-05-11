package br.org.soujava.hexagonal;

import java.util.List;

public class CarUI {

    public List<Car> findAll() {
        return Car.findAll();
    }

    public void insert(Car car) {
        Car.insert();
    }

    public void delete(Car car) {
        Car.delete();
    }

}
