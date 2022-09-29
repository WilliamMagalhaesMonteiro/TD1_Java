public class Fraction {

    int numerateur;
    int denominateur;

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

    public String toString(){
        String s = "Je suis une fraction.";
        return s;
    }

}
