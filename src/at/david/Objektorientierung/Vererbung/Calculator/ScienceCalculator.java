package at.david.Objektorientierung.Vererbung.Calculator;

public class ScienceCalculator extends TopCalculator {
    public double sinus(double a) {
        double sum = 0;

        if (a >= 360 || a <= 360) {
            sum = Math.sin(a);
            System.out.print("Der Sinus vom eingegebenen Winkel ist: " + sum);
        }

        return sum;
    }

    public double cosinus(double a) {
        double sum = 0;

        if (a >= 360 || a <= 360) {
            sum = Math.cos(a);
            System.out.print("Der Cosinus vom eingegebenen Winkel ist: " + sum);
        }

        return sum;
    }
}
