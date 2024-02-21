package at.david.Objektorientierung.examples.lamp;

public class LightElement {
    private String color;
    private String name;
    private int power_consumption;
    public boolean status;

    public LightElement(String color, String name, int power_consumption, boolean status) {
        this.color = color;
        this.name = name;
        this.power_consumption = power_consumption;
        this.status = status;
    }

    public void turnOn(){
        this.status = true;
        System.out.println("Das Licht-Element ist angeschalten.");
    }

    public void turnOff(){
        this.status = false;
        System.out.println("Das Licht-Element ist ausgeschalten.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower_consumption() {
        return power_consumption;
    }

    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
