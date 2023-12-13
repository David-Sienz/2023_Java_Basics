package at.david.Objektorientierung;

public class Engine {
    public enum TYPE {DIESEL, GASOLINE}
    private int horsePower;
    private TYPE type;

    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    public void drive(int horsePower, TYPE type){
        this.horsePower = horsePower;
        this.type = type;
    }

    public void drive(int amount){
        System.out.println("The Engine is running with " + amount);
    }

    public int getHorsePower() {
        return horsePower;
    }

    private TYPE getType() {
        return type;
    }
}
