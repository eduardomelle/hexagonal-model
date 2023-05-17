package br.org.soujava.hexagonal.car;

// Use case
public class CarSell {

    private Cartorio cartorio;

    public CarResponse mudar(CarRequest command) {
        return new CarResponse();
    }

    public static final class CarRequest {

    }

    public static final class CarResponse {

    }

}
