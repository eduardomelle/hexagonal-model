package br.org.soujava.hexagonal.car;

import java.util.Optional;

public class CarAlteracaoVeicular {

    private Garage garage;

    public void alterarCarro(CarAlteracaoVeicularRequest request) {
        Optional<Car> optional =  garage.findbyId(request.carId);
        Car car = optional.orElseThrow(() -> new RuntimeException());
        car.incrementWindow(request.quantity);
    }

    static class CarAlteracaoVeicularRequest {

        private Long carId;

    }

}
