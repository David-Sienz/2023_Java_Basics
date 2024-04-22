package at.david.Objektorientierung.Plane;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private String name;
    private List<Passengers> passengers;
    private Position position;

    public Plane(String name, Position position) {
        this.name = name;
        this.position = position;
        this.passengers = new ArrayList<>();
    }

    public void informPassengers(String message){
        for (Passengers passengers: passengers){
            passengers.inform(message);
        }
    }

    public void addPassenger(Passengers passenger){
        this.passengers.add(passenger);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
