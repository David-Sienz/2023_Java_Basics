package at.david.Objektorientierung.Vererbung.Vererbung.Car;

public class Truck extends Car{
    private String trailer;
    public Truck(Engine engine, Tank tank, int fuelConsumption, String brand, String serialNumber, String color, String trailer) {
        super(engine, tank, fuelConsumption, brand, serialNumber, color);
        this.trailer = trailer;

    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
