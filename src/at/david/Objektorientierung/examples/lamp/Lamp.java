package at.david.Objektorientierung.examples.lamp;
import java.util.ArrayList;

public class Lamp {
    private ArrayList<LightElement> lightElement;

    public Lamp() {
        this.lightElement = new ArrayList<>();
    }

    public void addLightElement(LightElement lightElement){
        this.lightElement.add(lightElement);
    }

    public void printNamesOfLightElements() {
        for (LightElement lightElement : lightElement) {
            System.out.println(lightElement.getName());
        }
    }

    public void turnAllOn(){
        for (LightElement lightElement : this.lightElement) {
            lightElement.turnOn();
        }
        System.out.println("Alle Lichtelemente sind angeschalten");
    }

    public void turnAllOff(){
        for (LightElement lightElement : this.lightElement) {
            lightElement.turnOff();
        }
        System.out.println("Alle Lichtelemente sind ausgeschalten");
    }


    public double getOverallPowerUsage(){
        double getOverallPowerUsage = 0;
        for (LightElement lightElement: this.lightElement) {
            getOverallPowerUsage = getOverallPowerUsage + lightElement.getPower_consumption();
        }

        System.out.println(getOverallPowerUsage);
        return getOverallPowerUsage;
    }

    public ArrayList<LightElement> getLightElement() {
        return lightElement;
    }

    public void setLightElement(ArrayList<LightElement> lightElement) {
        this.lightElement = lightElement;
    }


}
