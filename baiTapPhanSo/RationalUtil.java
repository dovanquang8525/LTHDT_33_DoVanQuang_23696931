package baiTapPhanSo;

public class RationalUtil {
    public static int GCD(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    //ham toi gian
    public static void reduce(Rational rational) throws Exception{
        int gcd = GCD(rational.getNumerator(), rational.getDenominator());
        
        rational.setNumerator(rational.getNumerator() / gcd);
        rational.setDenominator(rational.getDenominator() / gcd);

        if (rational.getDenominator() < 0){
            rational.setNumerator(-rational.getNumerator());
            rational.setDenominator(-rational.getDenominator());
        }
    }
    // so sanh 
    public static boolean equals(Rational r1, Rational r2){
        double tolerance = 0.00001;
        double difference = Math.abs((r1.getNumerator() / r1.getDenominator()) - (r2.getNumerator() / r2.getDenominator()));
        if (difference < tolerance)
            return true;
        else 
            return false;
    }
}
