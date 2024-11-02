public class Rectangle {
    //Khai bao cac thuoc tinh
    private double length;
    private double width;
    //Dong goi
    public double getLength() {
        return length;
    }
    //Rang buoc
    public void setLength(double chieuDai) {
        if (chieuDai <= 0){
            System.out.println("Loi");
        } else {
            this.length = chieuDai;
        }
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double chieuRong) {
        if (chieuRong <= 0) {
            System.out.println("Loi");
        } else {
            this.width = chieuRong; 
        }
    }
    //Constructor (ham tao) dung khoi tao doi tuong (new)
    public Rectangle() {}
    public Rectangle(double chieuDai, double chieuRong) {
        if (chieuDai <= 0){
            System.out.println("Loi");
        } else {
            this.length = chieuDai;
        }
        if (chieuRong <= 0) {
            System.out.println("Loi");
        } else {
            this.width = chieuRong; 
        }
    }
    //Phuong thuc
    public double getPerimeter(){
        return (getLength() + getWidth()) * 2;
    }
    public double getArea(){
        return getLength() * getWidth();
    }
    //Tao mau in toString
    @Override
    public String toString() {
        String s = "";
        s = s + s.format("|%10s|%10s|%10s|%10s|", getLength(), getWidth(), getPerimeter(), getArea());
        return s;
    }
}

