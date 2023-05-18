package br.org.soujava.hexagonal.car;

import org.jmolecules.ddd.annotation.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Garage {
    List<Car> findAll();

    void save(Car car);

    void delete(Car car);

    Optional<Car> findbyId(Long carId);

}
