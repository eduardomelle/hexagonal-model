package br.org.soujava.hexagonal;

import org.jmolecules.ddd.annotation.Repository;

import java.util.List;

@Repository
public interface Garage {
    List<Car> findAll();

    void save(Car car);

    void delete(Car car);

}
