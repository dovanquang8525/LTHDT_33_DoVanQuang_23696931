package baiTapPhanSo;

public class Rational {
    private int numerator;
    private int denominator;

    //dong goi
    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) throws Exception {
        if (denominator == 0){
            throw new Exception("Mau so khong the bang 0");
        } else {
            this.denominator = denominator;
        }
    }

    //constructor 
    public Rational(int numerator, int denominator) throws Exception {
        this.numerator = numerator;
        if (denominator == 0){
            throw new Exception("Mau so khong the bang 0");
        } else {
            this.denominator = denominator;
        }
        RationalUtil.reduce(this); //toi gian phan so
    }

    //dao ngich phan so
    public Rational reciprocal() throws Exception {
        return new Rational(denominator, numerator);
    }

    //mau in
    @Override
    public String toString() {
        if (denominator < 0){
            numerator = -numerator;
            denominator = -denominator;
        }
        return numerator + "/" + denominator;
    }
}
