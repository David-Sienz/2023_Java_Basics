package at.david.Objektorientierung.Phone;

public class Main {
    public static void main(String[] args) {
        PhoneFile file1 = new PhoneFile("jpg", 200, "dragan");

        SD_Card sd1 = new SD_Card(1000);
        sd1.saveFile(file1);

        Camera cam1 = new Camera(20, sd1);

        SIM sim1 = new SIM(1, "+43 676 3258190");

        Phone phone1 = new Phone("black", cam1, sd1, sim1);


        phone1.makePicture("jpg", "simon");
        phone1.makePicture("jpg", "damien");
        phone1.makePicture("jpeg", "raffi");

        phone1.makeCall("+43 650 1874201");

        phone1.getAllFiles();

        phone1.getFreeSpace();
    }
}
