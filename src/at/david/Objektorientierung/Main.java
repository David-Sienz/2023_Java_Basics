package at.david.Objektorientierung;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(240, Engine.TYPE.GASOLINE);
        Engine e2 = new Engine(140, Engine.TYPE.DIESEL);

        Car c1 = new Car(e1, 10, 100, "Porsche", "P912", "white", 150);
        Car c2 = new Car(e2, 8, 90, "Nissan", "N112", "pink", 130);


        System.out.println(c1.getBrand());
        c1.drive();
        c1.turboBoost();
        System.out.println(c1.getFuelAmount());
        System.out.println(c1.getFuelAmount());
        c1.honk(3);


        System.out.println(c2.getBrand());
        c2.drive();
        c2.turboBoost();
        System.out.println(c2.getFuelAmount());
        System.out.println(c2.getFuelAmount());
        c2.honk(4);

    }
}
