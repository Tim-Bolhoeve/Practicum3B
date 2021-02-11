public class Main{
    public static void main(String[] args) {
        Cirkel c1 = null, c2 = null;

        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}

//gevolg van try catch weghalen volgens mij:
//de applicatie tijdens uitvoeren stopt

//resultaat:
//Exception in thread "main" java.lang.IllegalArgumentException: Radius moet groter dan 0 zijn!
//	at Cirkel.<init>(Cirkel.java:11)
//	at Main.main(Main.java:7)