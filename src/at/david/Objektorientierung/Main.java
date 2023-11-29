package at.david.Objektorientierung;

public class Main {
    public static void main(String[] args) {
        int a = 7;

        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption = 7;
        c1.serialNumber = "A1234";
        c1.fuelAmount = 70;
        c1.color = "red";

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 6;
        c2.serialNumber = "M1234";
        c2.fuelAmount = 20;
        c2.color = "black";

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);
        c2.brake();
        System.out.println(c2.fuelAmount);

    }
}
