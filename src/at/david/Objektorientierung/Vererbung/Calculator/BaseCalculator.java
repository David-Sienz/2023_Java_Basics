package at.david.Objektorientierung.Vererbung.Calculator;

public class BaseCalculator {
    public double add(double a, double b){
        double sum = a + b;
        System.out.print("Die Summe von " + a + " und " + b + " ist: ");

        return sum;
    }

    public double subtract(double a, double b){
        double subtract = a - b;
        System.out.print("Die Differenz von " + a + " und " + b + " ist: ");

        return subtract;
    }

    public double multiply(double a, double b){
        double multiply = a * b;
        System.out.print("Das Produkt von " + a + " und " + b + " ist: ");

        return multiply;
    }

    public double divide(double a, double b){
        double divide = a / b;
        if (divide == 0){
            System.out.print("Kann nicht berechnet werden");
        } else {
            System.out.print("Der Quotient von " + a + " und " + b + " ist: ");
        }

        return divide;
    }
}
