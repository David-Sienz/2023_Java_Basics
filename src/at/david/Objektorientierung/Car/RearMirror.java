package at.david.Objektorientierung.Car;

public class RearMirror {
    private int size;
    private int position; //0 neutral, -10 links, +10 rechts


    public RearMirror(int size, int postion) {
        this.size = size;
        this.position = postion;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
