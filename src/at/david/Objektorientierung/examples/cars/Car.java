package at.david.Objektorientierung.examples.cars;

public class Car {
    private Engine engine;
    private int topSpeed;
    private double price;
    private String color;
    private int baseConsumption;
    private Manufacturer manufacturer;
    private int mileage;

    public Car(Engine engine, int topSpeed, double price, String color, int baseConsumption, Manufacturer manufacturer, int mileage) {
        this.engine = engine;
        this.topSpeed = topSpeed;
        this.price = price;
        this.color = color;
        this.baseConsumption = baseConsumption;
        this.manufacturer = manufacturer;
        this.mileage = mileage;
    }

    public void getDiscountedPrice(){
        double discountedPrice = this.price * this.manufacturer.getDiscount();
        System.out.println("The discounted price is: " + discountedPrice + " €");
    }

    public void getFuelConsumption(){
        double fuelConsumption = 0;
        if(mileage < 50000){
            fuelConsumption = this.baseConsumption;
        } else{
            fuelConsumption = (this.baseConsumption * 1.098);
        }
        System.out.println(fuelConsumption);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void getPrice() {
        System.out.println("The base price is: " + this.price + "€");
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBaseConsumption() {
        return baseConsumption;
    }

    public void setBaseConsumption(int baseConsumption) {
        this.baseConsumption = baseConsumption;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
