package at.david.Objektorientierung.Vererbung.Vererbung.Car;

public class Tire {
    private double tirepressure;
    private int type;

    public Tire(double tirepressure, int type){
        this.tirepressure = tirepressure;
        this.type = type;
    }

    public double getTirepressure() {
        return tirepressure;
    }

    public void setTirepressure(double tirepressure) {
        this.tirepressure = tirepressure;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
