package at.david.Objektorientierung.Remote;

import at.david.Objektorientierung.Car.Tire;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    public List<Battery> battery;

    public Remote(Battery battery){
        this.battery = new ArrayList<>();
    }

    public List<Battery> getBattery(){
        return battery;
    }

}
