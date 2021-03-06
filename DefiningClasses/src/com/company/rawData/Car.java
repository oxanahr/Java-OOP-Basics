package com.company.rawData;

public class Car {
    private String model;
    private Engine engine;
    private Tire[] tires;
    private Cargo cargo;

    public Car(String model, Engine engine, Cargo cargo, Tire[] tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Tire[] getTires() {
        return tires;
    }

    @Override
    public String toString() {
        return this.model;
    }
}
