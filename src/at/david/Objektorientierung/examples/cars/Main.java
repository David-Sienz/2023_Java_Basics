package at.david.Objektorientierung.examples.cars;

public class Main {
    public static void main(String[] args) {
        Manufacturer m1 = new Manufacturer("Mercedes", "Germany", 0.2);

        Engine e1 = new Engine(Engine.type.DIESEL, 100);

        Car c1 = new Car(e1, 240, 100000, "black", 1, m1,100);

        System.out.println(c1.getPrice());
    }
}
