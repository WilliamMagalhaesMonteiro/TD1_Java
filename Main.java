public class Main {

    public static void main (String [] args){
        Fraction f;
        f = new Fraction(5,3);
        System.out.println(f.toString());


        int a = f.getNumerateur();
        int b = f.getDenominateur();

        System.out.println("a : " + a + " b : " + b );

        assert a == 5;
        assert b != 0;
        

    }
    
}