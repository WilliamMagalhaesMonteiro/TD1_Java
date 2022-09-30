public class Fraction{

    int numerateur;
    int denominateur;

    private static final Fraction ZERO = new Fraction();
    private static final Fraction UN = new Fraction();

    Fraction(int a, int b){
        this.numerateur = a;
        this.denominateur = b;
    }

    Fraction(int a){
        this.numerateur = a;
        this.denominateur = 1;
    }

    Fraction(){
        this.numerateur = 0;
        this.denominateur = 1;
    }
    
    public int getNumerateur() {
        return numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }

    public double doubleValue(){
        return (double)this.numerateur/(double)this.denominateur;
    }

    public String toString(){
        String s = this.numerateur+"/"+this.denominateur;
        return s;
    }


    public Fraction add(Fraction f){

        int a = this.numerateur*f.getDenominateur() + f.getNumerateur()*this.denominateur;
        int b = this.denominateur*f.getDenominateur();

        Fraction out = new Fraction(a,b);
        
        return out;
    }

    public boolean equals(Fraction f){
        int a = this.numerateur * f.getDenominateur();
        int b = f.getNumerateur() * this.denominateur;

        if (a == b){
            return true;
        }
        else {
            return false;
        }
    }

    public int compare(Fraction f){
        int a = this.numerateur * f.getDenominateur();
        int b = f.getNumerateur() * this.denominateur;

        if (a < b){
            return -1;
        }
        else {
            return 1;
        }
    }

}
