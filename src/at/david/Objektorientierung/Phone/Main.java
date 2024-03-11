package at.david.Objektorientierung.Phone;

public class Main {
    public static void main(String[] args) {
        PhoneFile file1 = new PhoneFile("jpg", 200, "dragan");

        SD_Card sd1 = new SD_Card(10);
        sd1.saveFile(file1);

        Camera cam1 = new Camera(20, sd1);

        SIM sim1 = new SIM(1, "1");

        Phone phone1 = new Phone("black", cam1, sd1, sim1);


        phone1.makePicture("jpg", "nutti");
        phone1.getAllFiles();
        System.out.println(file1.getInfo(file1));
    }
}
