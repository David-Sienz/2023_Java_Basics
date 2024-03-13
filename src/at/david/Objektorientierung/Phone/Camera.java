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

        if (phoneFile.getSize()<=sdCard.getFreeSpace()){
            sdCard.saveFile(phoneFile);
        } else{
            System.out.println("Das Bild kann nicht gespeichert werden, da es keinen freien Speicherplatz gibt.");
        }
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }
}
