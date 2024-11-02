package HinhTron;

public class TestHinhTron {
    public static void main(String[] args) throws Exception {
        TamHinhTron t = new TamHinhTron("O", 8, 5);
        TinhHinhTron h1 = new TinhHinhTron(10, t);
        for (int i = 1; i < 91; i++){
            System.out.printf("=");
        }
        System.out.println();
        System.out.println("|Hinh tron tam: " + t.toString() + h1.toString());
        for (int i = 1; i < 91; i++){
            System.out.print("=");
        }
    }
}
