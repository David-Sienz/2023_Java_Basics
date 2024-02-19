package at.david.Objektorientierung.examples.lamp;

import java.util.List;

public class Lamp {
    private List<LightElement> lightElement;
    private String name;

    public Lamp(List<LightElement> lightElement, String name) {
        this.lightElement = lightElement;
        this.name = name;
    }

    public void addLightElement(LightElement lightElement){

    }

    public void turnAllOn(){

    }

    public double getOverallPowerUsage(){

    }

    public void printNamesOfLightElements(){

    }


    public List<LightElement> getLightElement() {
        return lightElement;
    }

    public void setLightElement(List<LightElement> lightElement) {
        this.lightElement = lightElement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
