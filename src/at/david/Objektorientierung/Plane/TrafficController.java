package at.david.Objektorientierung.Plane;


import java.util.ArrayList;
import java.util.List;

public class TrafficController {
    private List<Plane> plane;

    public TrafficController() {
        this.plane = new ArrayList<>();
    }

    public void printAllPlanes(){
        for (Plane plane: plane) {
            System.out.println(plane.getName());
            System.out.println("Langtitude: " + plane.getPosition().getLangtitude());
            System.out.println("Latitude: " + plane.getPosition().getLatitude());
        }
    }

    public void informAllPeopleOnAllPlanes(String message){
        for (Plane plane: plane){
            plane.informPassengers(message);
        }
    }

    public void addPlane(Plane plane){
        this.plane.add(plane);
    }

    public List<Plane> getPlane() {
        return plane;
    }

    public void setPlane(List<Plane> plane) {
        this.plane = plane;
    }
}
