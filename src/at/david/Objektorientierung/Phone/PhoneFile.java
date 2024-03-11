package at.david.Objektorientierung.Phone;

public class PhoneFile {
    private String extension;
    private int size;
    private String name;

    public PhoneFile(String extension, int size, String name) {
        this.extension = "." + extension;
        this.size = size;
        this.name = name;
    }

    public String getInfo(PhoneFile phoneFile){
        return "The file: " + name + extension + " has a size of: " + size +"MB";
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
