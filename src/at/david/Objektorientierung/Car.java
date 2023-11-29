package at.david.Objektorientierung;

public class Car {
        //Instanz / Gedächtnisvariablen

        //don't do that later
        public int fuelConsumption;
        public int fuelAmount;
        public String brand;
        public String serialNumber;
        public String color;


        public void drive(){
                this.fuelAmount = this.fuelAmount - fuelConsumption;
                System.out.println("I am driving");
        }

        public void brake(){
                System.out.println("I am breaking");
        }
}
