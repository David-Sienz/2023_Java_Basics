package at.david.Objektorientierung.Plane;

public class Main {
    public static void main(String[] args) {
        Position po1 = new Position(13, 45);
        Position po2 = new Position(14, 35);

        Passengers pa1 = new Passengers("Damien", "Wallis");
        Passengers pa2 = new Passengers("Dragan", "Nikolic");
        Passengers pa3 = new Passengers("Simon", "Metzler");
        Passengers pa4 = new Passengers("Raphael", "Maringer");

        Plane pl1 = new Plane("Boeing747", po1);
        Plane pl2 = new Plane("Boeing531", po2);

        TrafficController tc1 = new TrafficController();


        pl1.addPassenger(pa1);
        pl1.addPassenger(pa4);
        pl2.addPassenger(pa2);
        pl2.addPassenger(pa3);

        tc1.addPlane(pl1);
        tc1.addPlane(pl2);


        //Passagier eine Information weiterleiten:
        pa1.inform("Wir fliegen in 5 Minuten los!");

        //Information an Passagiere im Flugzeug weiterleiten:
        pl1.informPassengers("Wir fliegen in 10 Minuten los!");

        //Information an alle Passagiere in allen Flugzeugen weiterleiten:
        tc1.informAllPeopleOnAllPlanes("Wir fliegen jetzt los!");
    }
}
