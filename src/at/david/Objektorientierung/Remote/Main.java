package at.david.Objektorientierung.Remote;

public class Main {
    public static void main(String[] args) {
        Battery b1 = new Battery(100);
        Battery b2 = new Battery(40);

        Remote r1 = new Remote(true, true);
        r1.addBattery(b1);
        r1.addBattery(b2);



        r1.getStatus();
    }
}
