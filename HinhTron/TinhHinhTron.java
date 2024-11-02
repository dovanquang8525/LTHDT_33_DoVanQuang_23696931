package HinhTron;

public class TinhHinhTron {
    private double banKinh;
    private TamHinhTron tam;
    public static final double Pi = 3.1416;
    public double getBanKinh() {
        return banKinh;
    }
    public void setBanKinh(double banKinh) throws Exception {
        if (banKinh > 0) {
            this.banKinh = banKinh;
        } else {
            throw new Exception("Error");
        }
    }
    public TamHinhTron getTam() {
        return tam;
    }
    public void setTam(TamHinhTron tam) throws Exception {
        if (tam != null) {
            this.tam = tam;
        } else {
            throw new Exception("Error");
        }
    }
    // constructor
    public TinhHinhTron(double banKinh, TamHinhTron tam) {
        this.banKinh = banKinh;
        this.tam = tam;
    }
    public double getDienTich(){
        return getBanKinh() * getBanKinh() * Pi;
    }
    public double getChuVi(){
        return getBanKinh() * 2 * Pi;
    }
    @Override
    public String toString() {
        String m = "";
        m += m.format(" BanKinh = %5s| Chu vi = %5.5s| Dien Tich = %5.5s|", getBanKinh(), getChuVi(), getDienTich());
        return m;
    }
}
