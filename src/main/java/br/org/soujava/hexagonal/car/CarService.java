package br.org.soujava.hexagonal.car;

import org.jmolecules.ddd.annotation.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CarService {

    private final Garage garage;

    private final Detran detran;

    private final CarSell carSell;

    public CarService(Garage garage, Detran detran, CarSell carSell) {
        this.garage = garage;
        this.detran = detran;
        this.carSell = carSell;
    }

    public List<Car> findAll() {
        return garage.findAll();
    }

    public void save(Car car) {
        garage.save(car);
    }

    public void delete(Car car) {
        garage.delete(car);
    }

    public void vistoria(Car car) {
    }

    public CarSell.CarResponse mudar(CarSell.CarRequest car) {

        Objects.requireNonNull(car);

        return this.carSell.mudar(car);
    }

    public void modificarCarro(Car car) {
    }

}
