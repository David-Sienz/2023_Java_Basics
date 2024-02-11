package at.david.Objektorientierung.Remote;

public class Battery {
    public int chargingStatus;


    public Battery(int chargingStatus){
        this.chargingStatus = chargingStatus;
    }

    public int getChargingStatus() {
        return chargingStatus;
    }

    public void setChargingStatus(int chargingStatus) {
        this.chargingStatus = chargingStatus;
    }

}
