package at.david.Objektorientierung.Plane;

public class Position {
    private int langtitude;
    private int latitude;

    public Position(int langtitude, int latitude) {
        this.langtitude = langtitude;
        this.latitude = latitude;
    }

    public int getLangtitude() {
        return langtitude;
    }

    public void setLangtitude(int langtitude) {
        this.langtitude = langtitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }
}
