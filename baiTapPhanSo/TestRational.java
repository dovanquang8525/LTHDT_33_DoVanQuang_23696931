package baiTapPhanSo;

public class TestRational {
    public static void main(String[] args) throws Exception {
        Rational r1 = new Rational(12, 24);
        Rational r2 = new Rational(30, 24);

        System.out.println("Rational 1 = " + r1);
        System.out.println("Rational 2 = " + r2);

        System.out.println("Tong = " + RationalOpreration.addRational(r1, r2));
        System.out.println("Hieu = " + RationalOpreration.minusRational(r1, r2));
        System.out.println("Tich = " + RationalOpreration.timeRational(r1, r2));;
        System.out.println("Thuong = " + RationalOpreration.devisionRational(r1, r2));;

        System.out.println("r1 voi r2 co bang nhau? " + RationalUtil.equals(r1, r2));
    }
}
