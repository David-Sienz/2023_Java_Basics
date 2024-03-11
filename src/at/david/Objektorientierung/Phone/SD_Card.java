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

    public void saveFile(PhoneFile phoneFile){
        this.phoneFile.add(phoneFile);
    }

    public void getAllFiles(){
        for (PhoneFile phoneFile: phoneFile) {
            System.out.println(phoneFile.getInfo(phoneFile));
        }
    }

    public int getFreeSpace(){
        int sum = 0;
        for (PhoneFile phoneFile: phoneFile) {
            sum += phoneFile.getSize();
        }

        int freeSpace = sum - this.capacity;

        return freeSpace;
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
