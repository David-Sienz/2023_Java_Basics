package at.david.Objektorientierung;

public class Car {
    //Instanz / Gedächtnisvariablen

    //don't do that later
    private Engine engine;
    private Tank tank;
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
    }

    public void drive(int speed) {
        if (speed >= 1 && speed <= 100) {
            this.tank.fuelAmount -= this.fuelConsumption;
            System.out.println("The car is driving with " + speed + "km/h");
        } else if (speed > 100) {
            System.out.println("The car is driving to fast");
        } else {
            System.out.println("The car is not driving");
        }
    }

    public void brake() {
        System.out.println("The car is breaking!");
    }

    public void turboBoost() {
        if (this.tank.fuelAmount > this.tank.fuelAmount * 0.1) {
            System.out.println("SuperBoostMode is on.");
        } else {
            System.out.println("Not enough fuel to go to Superboost.");
        }
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
