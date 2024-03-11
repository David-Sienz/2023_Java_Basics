package at.david.Objektorientierung.Phone;

public class Phone {
    private String color;
    private Camera camera;
    private SD_Card sdCard;
    private SIM sim;

    public Phone(String color, Camera camera, SD_Card sdCard, SIM sim) {
        this.color = color;
        this.camera = camera;
        this.sdCard = sdCard;
        this.sim = sim;
    }

    public void makePicture(String extension, String name){
        camera.makePicture(extension, name);
    }

    public void getAllFiles(){
        sdCard.getAllFiles();
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public SD_Card getSdCard() {
        return sdCard;
    }

    public void setSdCard(SD_Card sdCard) {
        this.sdCard = sdCard;
    }

    public SIM getSim() {
        return sim;
    }

    public void setSim(SIM sim) {
        this.sim = sim;
    }
}
