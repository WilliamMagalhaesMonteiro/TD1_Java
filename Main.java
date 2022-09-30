public class Main {

    public static void main (String [] args){
        Fraction f;
        f = new Fraction(2,4);
        System.out.println(f.toString());



        assert f.getNumerateur() == 2;
        assert f.getDenominateur() != 0;
        

        System.out.println("Ici :" + f.doubleValue());
        assert f.doubleValue() == 0.5;

        Fraction f2 = new Fraction(1,2);
        Fraction f3 = new Fraction(3,4);


        System.out.println(f2.add(f3).toString());

        Fraction f4 = new Fraction(1,2);
        Fraction f5 = new Fraction(3,8);

        assert f4.equals(f5) == false;


    

    }
    
}