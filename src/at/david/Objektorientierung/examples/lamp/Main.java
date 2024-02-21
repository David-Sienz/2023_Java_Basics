package at.david.Objektorientierung.examples.lamp;

public class Main {
    public static void main(String[] args) {

        LightElement le1 = new LightElement("yellow", "däml", 5, false);
        LightElement le2 = new LightElement("white", "dragan", 5, false);

        Lamp l1 = new Lamp();
        l1.addLightElement(le1);
        l1.addLightElement(le2);

        l1.turnAllOn();
        l1.getOverallPowerUsage();
        l1.turnAllOff();



    }
}
