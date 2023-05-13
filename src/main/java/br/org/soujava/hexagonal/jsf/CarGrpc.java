package br.org.soujava.hexagonal.jsf;

import br.org.soujava.hexagonal.CarService;

public class CarGrpc {

    private final CarService service;

    public CarGrpc(CarService service) {
        this.service = service;
    }

}
