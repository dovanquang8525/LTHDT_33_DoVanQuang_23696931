package baiTapPhanSo;


public class RationalOpreration {
    //tinh toan phan so
    //cong 2 phan so
    public static Rational addRational(Rational r1, Rational r2) throws Exception{
        int newNumerator = r1.getNumerator() * r2.getDenominator() + r2.getNumerator() * r1.getDenominator();
        int newDenominator = r1.getDenominator() * r2.getDenominator();
        return new Rational(newNumerator, newDenominator);
    }

    //tru 2 phan so
    public static Rational minusRational(Rational r1, Rational r2) throws Exception {
        int newNumerator = r1.getNumerator() * r2.getDenominator() - r2.getNumerator() * r1.getDenominator();
        int newDenominator = r1.getDenominator() * r2.getDenominator();
        return new Rational(newNumerator, newDenominator);
    }

    //nhan 2 phan so
    public static Rational timeRational(Rational r1, Rational r2) throws Exception {
        int newNumerator = r1.getNumerator() *  r2.getNumerator();
        int newDenominator = r1.getDenominator() * r2.getDenominator();
        return new Rational(newNumerator, newDenominator);
    }

    //chia 2 phan so 
    public static Rational devisionRational(Rational r1, Rational r2) throws Exception {
        int newNumerator = r1.getNumerator() *  r2.getDenominator();
        int newDenominator = r1.getDenominator() * r2.getNumerator();
        return new Rational(newNumerator, newDenominator);
    }
}
