package at.david.Objektorientierung;

public class Car {
    //Instanz / Gedächtnisvariablen

    //don't do that later
    private int fuelConsumption;
    private int fuelAmount;
    private int tankVolume;
    private String brand;
    private String serialNumber;
    private String color;
    private double remainingDistance;


       /*public Car(int fc, String b, String s){
                this.fuelConsumption =fc;
                this.brand =b;
                this.serialNumber=s;
        }*/

    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving!");
    }

    public void brake() {
        System.out.println("I am breaking!");
    }

    public void turboBoost() {
        if (fuelAmount > tankVolume * 0.9) {
            System.out.println("SuperBoostMode is off.");
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
        this.remainingDistance = this.fuelAmount / this.fuelConsumption;
        System.out.println("You have " + remainingDistance + " kilometres left!");
    }

    public void setTankVolume(int tank) {
        tankVolume = tank;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setRemainingDistance(double remainingDistance) {
        this.remainingDistance = remainingDistance;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getRemainingDistance() {
        return remainingDistance;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}