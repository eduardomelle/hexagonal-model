package br.org.soujava.hexagonal.jsf;

import br.org.soujava.hexagonal.Car;
import br.org.soujava.hexagonal.CarService;

import java.util.List;

public class CarManageBean {

    private final CarService service;

    public CarManageBean(CarService service) {
        this.service = service;
    }

    public List<Car> findAll() {
        return service.findAll();
    }

    public void insert(Car car) {
        service.save(car);
    }

    public void delete(Car car) {
        service.delete(car);
    }

    public void vistoria(Car car) {
        service.vistoria(car);
    }

    public void mudar(Car car) {
        service.mudar(car);
    }

    public void modificarCarro(Car car) {
        service.modificarCarro(car);
    }

}