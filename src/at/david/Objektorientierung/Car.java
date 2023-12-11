package at.david.Objektorientierung;

public class Car {
        //Instanz / Gedächtnisvariablen

        //don't do that later
        public int fuelConsumption;
        public int fuelAmount;
        public int tankVolume;
        public String brand;
        public String serialNumber;
        public String color;
        private double remainingDistance;


        public Car(int fc, String b, String s){
                this.fuelConsumption =fc;
                this.brand =b;
                this.serialNumber=s;
        }

        public void drive(){
                this.fuelAmount = this.fuelAmount - fuelConsumption;
                System.out.println("I am driving!");
        }

        public void brake(){
                System.out.println("I am breaking!");
        }

        public void turboBoost(){
                if (fuelAmount > tankVolume * 0.9){
                        System.out.println("SuperBoostMode is off.");
                } else{
                        System.out.println("Not enough fuel to go to Superboost.");
                }
        }
        public void honk(int amountOfRepetations){
                for (int i = 0; i < amountOfRepetations; i++) {
                        System.out.println("Tuuut");
                }
        }

        public void getRemainingRange(){
                this.remainingDistance = this.fuelAmount / this.fuelConsumption;
                System.out.println("You have " + remainingDistance + " kilometres left!");
        }
}