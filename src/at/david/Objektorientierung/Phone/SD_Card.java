package at.david.Objektorientierung.Phone;

import java.util.ArrayList;
import java.util.List;

public class SD_Card {
    private int capacity;
    private List<PhoneFile> phoneFile;

    public SD_Card(int capacity) {
        this.capacity = capacity;
        this.phoneFile = new ArrayList<>();
    }

    public void saveFile(PhoneFile file) {
        if (this.capacity > 0) {
            if (file.getSize() > this.capacity) {
                System.out.println("Die Datei " + file.getName() + " ist zu groß!");
            } else {
                this.phoneFile.add(file);
                this.capacity = this.capacity - file.getSize();
                System.out.println("Du hast die Datei: " + file.getName() + " gespeichert");
            }
        } else {
            System.out.println("Du kannst die Datei: " + file.getName() + " nicht speichern!");
        }
    }

    public void getAllFiles(){
        for (PhoneFile phoneFile: phoneFile) {
            System.out.println(phoneFile.getInfo(phoneFile));
        }
    }

    public int getFreeSpace(){
        return capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<PhoneFile> getPhoneFile() {
        return phoneFile;
    }

    public void setPhoneFile(List<PhoneFile> phoneFile) {
        this.phoneFile = phoneFile;
    }
}
