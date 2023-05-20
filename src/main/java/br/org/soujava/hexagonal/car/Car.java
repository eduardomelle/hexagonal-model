/**
 * 
 */
package br.org.soujava.hexagonal.car;

import org.jmolecules.ddd.annotation.Entity;

import java.time.Year;
import java.util.List;

/**
 * 
 */
@Entity
public class Car {

	// bean validation
	public String plate;

	public String model;

	public Year year;

	public int windows;

    public void incrementWindow(int quantity) {
		// Somar
    }

	public void incrementWindow(int quantity, Garage garage) {
		// Increment
		garage.save(this);
	}

	public void validate(Driver driver) {
		// Validar a placa
	}

}
