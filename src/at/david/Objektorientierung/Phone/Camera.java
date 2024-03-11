package at.david.Objektorientierung.Phone;

public class Camera {
    private int resolution;
    private SD_Card sdCard;

    public Camera(int resolution, SD_Card sdCard) {
        this.resolution = resolution;
        this.sdCard = sdCard;
    }

    public void makePicture(String extension, String name){
        PhoneFile phoneFile = new PhoneFile(extension, resolution*resolution, name);
        sdCard.saveFile(phoneFile);
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }
}
