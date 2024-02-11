package at.david.Objektorientierung.Remote;


import java.util.ArrayList;
import java.util.List;

public class Remote {
    public List<Battery> batteries;
    public boolean isOn;
    public boolean hasPower;

    public Remote(boolean isOn, boolean hasPower){
        this.batteries = new ArrayList<>();
        this.isOn = isOn;
        this.hasPower = hasPower;
    }


    public void addBattery(Battery battery) {this.batteries.add(battery);} //um eine Batterie hinzuzufügen
    public List<Battery> getBattery(){
        return batteries;
    }
    public void getStatus(){
        int average = (this.batteries.get(0).getChargingStatus() + this.batteries.get(1).getChargingStatus()) / 2;

        System.out.println("Der Ladestatus der beiden Batterien beträgt: " + average);
    }

    public void turnOn() {
        isOn = true;

        double chargingStatusBattery1 = batteries.get(0).getChargingStatus();
        double chargingStatus1 = chargingStatusBattery1 - 5;
        batteries.get(0).setChargingStatus((int) chargingStatus1);

        double chargingStatusBattery2 = batteries.get(1).getChargingStatus();
        double chargingStatus2 = chargingStatusBattery2 - 5;
        batteries.get(1).setChargingStatus((int) chargingStatus2);

        if (chargingStatus1 < 5 || chargingStatus2 < 5) {
            hasPower = false;
            isOn = false;
            System.out.println("Mindestens eine der beiden Batterien ist nicht ausreichend aufgeladen");
        } else {
            System.out.println("Batterie 1: Verbraucher ist angeschlossen! ");
            System.out.println("Batterie 2: Verbraucher ist angeschlossen! ");
        }
    }


    public void turnOff(){
        isOn = false;
        System.out.println("Batterie 1: Verbraucher ist nicht angeschlossen! ");
        System.out.println("Batterie 2: Verbraucher ist nicht angeschlossen! ");
    }
}
