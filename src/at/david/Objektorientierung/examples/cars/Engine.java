package at.david.Objektorientierung.examples.cars;

import at.david.Objektorientierung.Car.Tank;

public class Engine {

    public enum type {DIESEL, GASOLINE};
    private type type;
    private int horsePower;

    public Engine(Engine.type type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public Engine.type getType() {
        return type;
    }

    public void setType(Engine.type type) {
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
