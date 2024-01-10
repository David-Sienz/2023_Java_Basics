package at.david.Objektorientierung;

public class Main {
    public static void main(String[] args) {
        Tank t1 = new Tank(10, 210);
        Tank t2 = new Tank(40, 125);

        Engine e1 = new Engine(240, Engine.TYPE.GASOLINE, t1);
        Engine e2 = new Engine(140, Engine.TYPE.DIESEL, t2);

        Car c1 = new Car(e1, t1, 100, "Porsche", "P912", "white");
        Car c2 = new Car(e2, t2, 90, "Nissan", "N112", "pink");

        //DRIVE
        System.out.println("Current fuel amount is " + c1.getFuelTank().getFuelAmount());
        c2.drive(270);
        System.out.println("Current fuel amount is " + c1.getFuelTank().getFuelAmount());
        System.out.println("");
        System.out.println("Current fuel amount is " + c2.getFuelTank().getFuelAmount());
        c2.drive(250);
        System.out.println("Current fuel amount is " + c2.getFuelTank().getFuelAmount());
        System.out.println("");
        System.out.println("");

        //BRAKE
        c1.brake();
        System.out.println("");
        c2.brake();
        System.out.println("");
        System.out.println("");

        //TURBO-BOOST-MODE
        System.out.print("Car 1: ");
        c1.turboBoost();
        System.out.println("");
        System.out.print("Car 2: ");
        c2.turboBoost();
        System.out.println("");
        System.out.println("");

        //HONK
        System.out.print("Car 1: ");
        c1.honk(6);
        System.out.println("");
        System.out.print("Car 2: ");
        c2.honk(3);
        System.out.println("");
        System.out.println("");

        //GET-REMAINING-RANGE
        System.out.print("Car 1: ");
        c1.getRemainingRange();
        System.out.println("");
        System.out.print("Car 2: ");
        c2.getRemainingRange();
    }
}