package at.david.Objektorientierung.Car;

public class Tank {
    public int fuelAmount;
    public int tankVolume;

    public Tank(int fuelAmount, int tankVolume) {
        this.fuelAmount = fuelAmount;
        this.tankVolume = tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getFuelAmount() {
        return this.fuelAmount;
    }

    public int getTankVolume() {
        return tankVolume;
    }
}