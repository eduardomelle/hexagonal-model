package br.org.soujava.hexagonal.car.ui;

import br.org.soujava.hexagonal.car.Car;
import br.org.soujava.hexagonal.car.CarSell;
import br.org.soujava.hexagonal.car.CarService;

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

    // Qualquer coisa
    public void mudar(Car car) {
        // http
        CarSell.CarRequest request = null;
        service.mudar(request);
        // http
    }

    public void modificarCarro(Car car) {
        service.modificarCarro(car);
    }

}
