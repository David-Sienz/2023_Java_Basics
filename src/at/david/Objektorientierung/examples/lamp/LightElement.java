package at.david.Objektorientierung.examples.lamp;

public class LightElement {
    private String color;
    private int power_consumption;
    public enum status {On, Off};

    public LightElement(String color, int power_consumption) {
        this.color = color;
        this.power_consumption = power_consumption;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower_consumption() {
        return power_consumption;
    }

    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

}
