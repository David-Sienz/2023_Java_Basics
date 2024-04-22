package at.david.Objektorientierung.Plane;

public class Passengers {
    private String firstName;
    private String lastName;

    public Passengers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void inform(String message){
        System.out.println("Mein Name ist: " + firstName + " " + lastName + " und die erhaltene Nachricht lautet: " + message);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
