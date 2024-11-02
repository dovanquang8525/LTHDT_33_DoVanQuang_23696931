package PhongHoc;

public abstract class PhongHoc {
    protected String maPhong;
    protected String dayNha;
    protected double dienTich;
    protected int soBongDen;
    public abstract boolean kiemTraDatChuan();
    public String getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }
    public String getDayNha() {
        return dayNha;
    }
    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }
    public double getDienTich() {
        return dienTich;
    }
    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    public int getSoBongDen() {
        return soBongDen;
    }
    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }
    public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }
    public boolean duAnhSang() {
        return (getDienTich() / getSoBongDen() <= 10) ? true : false;
    }
    @Override
    public String toString() {
        String duSang = duAnhSang() ? "Du" : "Khong Du";
        String s = "";
        s += s.format("|%10s|%10s|%10s|%10s|%11s", getMaPhong(), getDayNha(), getDienTich(), getSoBongDen(), duSang);
        return s;
    }
}
