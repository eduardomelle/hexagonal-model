package br.org.soujava.hexagonal.jsf;

import br.org.soujava.hexagonal.CarService;

public class CarResource {

    private CarService service;

    public CarResource(CarService service) {
        this.service = service;
    }

}
