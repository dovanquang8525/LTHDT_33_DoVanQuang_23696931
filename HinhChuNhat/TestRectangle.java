public class TestRectangle {
    public static void inKQ(){
        for (int i = 0; i < 45; i++){
            System.out.printf("-");
        }
        System.out.println();
        System.out.printf("|%10s|%10s|%10s|%10s|", "Chieu dai", "Chieu rong", "Chu vi", "Dien tich");
        System.out.println();
        
    }
    public static void main(String[] args) {
        //Khoi tao doi tuong h1
        Rectangle h1 = new Rectangle();
        h1.setLength(8);
        h1.setWidth(5);
        inKQ();
        System.out.println(h1.toString());
    }
}

