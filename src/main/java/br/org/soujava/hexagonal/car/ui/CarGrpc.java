package br.org.soujava.hexagonal.car.ui;

import br.org.soujava.hexagonal.car.CarService;

public class CarGrpc {

    private final CarService service;

    public CarGrpc(CarService service) {
        this.service = service;
    }

}
