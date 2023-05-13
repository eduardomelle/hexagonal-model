package br.org.soujava.hexagonal;

import org.jmolecules.ddd.annotation.Service;

import java.util.List;

@Service
public class CarService {

    private final Garage garage;

    private final Detran detran;

    public CarService(Garage garage, Detran detran) {
        this.garage = garage;
        this.detran = detran;
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

    public void mudar(Car car) {
    }

    public void modificarCarro(Car car) {
    }

}
