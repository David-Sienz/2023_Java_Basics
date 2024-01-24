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

    public void turnOn(){
        isOn = true;
        int chargingStatus = batteries.get(0).getChargingStatus();
        int chargingStatus1 = chargingStatus * 0,95;



    }

    public void turnOff(){

    }
}
