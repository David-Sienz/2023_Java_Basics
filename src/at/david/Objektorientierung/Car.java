package at.david.Objektorientierung;

import java.util.ArrayList;
import java.util.List;

public class Car {
    //Instanz / Gedächtnisvariablen

    //don't do that later
    private Engine engine;
    private Tank tank;
    private List<RearMirror> mirrors;
    private List<Tire> tires;
    private int fuelConsumption;
    private String brand;
    private String serialNumber;
    private String color;

    public Car(Engine engine, Tank tank, int fuelConsumption, String brand, String serialNumber, String color) {
        this.engine = engine;
        this.tank = tank;
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.mirrors = new ArrayList<>();
        this.tires = new ArrayList<>();
    }

    public List<Tire> getTires(){
        return tires;
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void addTire(Tire tires) {this.tires.add(tires);}
    public void addMirror(RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }

    public void drive(int speed) {
        this.engine.drive(speed);
    }

    public void brake() {
        System.out.println("The car is breaking!");
    }

    public void turboBoost(){
        this.engine.turboBoost();
    }

    public void honk(int amountOfRepetations) {
        for (int i = 0; i < amountOfRepetations; i++) {
            System.out.println("Tuuut");
        }
    }

    public void getRemainingRange() {
        double remainingDistance = (double) this.tank.fuelAmount / this.fuelConsumption;
        System.out.println("The car has " + remainingDistance + " kilometres left!");
    }

    //Setter
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Getter
    public Engine getEngine() {
        return engine;
    }

    public Tank getFuelTank() {
        return tank;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getColor() {
        return color;
    }
}
