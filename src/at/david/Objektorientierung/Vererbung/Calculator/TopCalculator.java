package at.david.Objektorientierung.Vererbung.Calculator;

public class TopCalculator extends BaseCalculator{
    public double sqrt(double a){
        System.out.print("Die Wurzel von " + a + " ist: ");
        return Math.sqrt(a);
    }
}
