package br.org.soujava.hexagonal.car;

import java.util.Optional;

public class CarAlteracaoVeicular {

    private Garage garage;

    public CarAlteracaoVeicularResponse alterarCarro(CarAlteracaoVeicularRequest request) {
        Optional<Car> optional =  garage.findbyId(request.carId);
        Car car = optional.orElseThrow(() -> new RuntimeException());
        car.incrementWindow(request.quantity);
        garage.save(car);
        return new CarAlteracaoVeicularResponse();
    }

    static class CarAlteracaoVeicularRequest {

        public int quantity;
        private Long carId;

    }

    static class CarAlteracaoVeicularResponse {

    }

}
