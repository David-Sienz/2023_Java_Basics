package at.david.Objektorientierung.examples.cars;

public class Main {
    public static void main(String[] args) {
        Manufacturer m1 = new Manufacturer("Mercedes", "Germany", 0.2);

        Engine e1 = new Engine(Engine.type.DIESEL, 100);

        Car c1 = new Car(e1, 240, 40000, "black", 5, m1, 80000);


        //get price
        c1.getPrice();
        c1.getDiscountedPrice();


        //get fuel consumption
        c1.getFuelConsumption();

    }
}
