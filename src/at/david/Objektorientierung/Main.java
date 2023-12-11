package at.david.Objektorientierung;

public class Main {
    public static void main(String[] args) {
        int a = 7;

        Car c1 = new Car();
        c1.setBrand("Audi");
        c1.setTankVolume(100);
        c1.setSerialNumber("1234");
        c1.setFuelAmount(80);
        c1.setTankVolume(80);

        System.out.println(c1.getBrand());
        c1.drive();
        c1.turboBoost();
        System.out.println(c1.getFuelAmount());
        System.out.println(c1.getFuelAmount());
        c1.honk(3);

        /*Car c3 = new Car(17, "opel", "01234");
        System.out.println(c3.serialNumber);*/
    }
}
