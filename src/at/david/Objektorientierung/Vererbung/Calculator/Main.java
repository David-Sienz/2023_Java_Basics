package at.david.Objektorientierung.Vererbung.Calculator;

public class Main {
    public static void main(String[] args) {
        BaseCalculator b1 = new BaseCalculator();
        TopCalculator t1 = new TopCalculator();
        ScienceCalculator s1 = new ScienceCalculator();

        System.out.println(b1.add(3,5));
        System.out.println(b1.subtract(14,3));
        System.out.println(b1.multiply(5,6));
        System.out.println(b1.divide(4,3));

        System.out.println(t1.sqrt(4));

        System.out.println(s1.sinus(180));
        System.out.println(s1.cosinus(180));
    }
}
