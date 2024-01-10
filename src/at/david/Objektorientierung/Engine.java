package at.david.Objektorientierung;

public class Engine {

    public void drive(int speed) {
        if (speed >= 1 && speed <= 100) {
            this.tank.fuelAmount = this.tank.fuelAmount - this.fuelConsumption;
            System.out.println("The car is driving with " + speed + "km/h");
        } else if (speed > 100) {
            System.out.println("The car is driving to fast");
        } else {
            System.out.println("The car is not driving");
        }
    }

    public void turboBoost() {
        if (this.getTank().getFuelAmount() > this.getTank().getTankVolume() * 0.1) {
            System.out.println("SuperBoostMode is on.");
        } else {
            System.out.println("Not enough fuel to go to Superboost.");
        }
    }

    private int fuelConsumption;

    public enum TYPE {DIESEL, GASOLINE}

    private int horsePower;
    private TYPE type;

    public Engine(int horsePower, TYPE type, Tank tank) {
        this.horsePower = horsePower;
        this.type = type;
        this.tank = tank;
    }

    private Tank tank;

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    private TYPE getType() {
        return type;
    }

    public Tank getTank() {
        return this.tank;
    }
}
