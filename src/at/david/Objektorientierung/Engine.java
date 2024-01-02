package at.david.Objektorientierung;

public class Engine {
    public enum TYPE {DIESEL, GASOLINE}

    private int horsePower;
    private TYPE type;

    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }


    public int getHorsePower() {
        return horsePower;
    }

    private TYPE getType() {
        return type;
    }
}
