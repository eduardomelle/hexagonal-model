package br.org.soujava.hexagonal.car.ui;

import br.org.soujava.hexagonal.car.CarService;

public class CarResource {

    private CarService service;

    public CarResource(CarService service) {
        this.service = service;
    }

}
