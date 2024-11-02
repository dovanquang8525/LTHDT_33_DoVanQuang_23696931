package NhanVien;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class LuongNhanVien {
    // Attributes
    private String maNV;
    private int thang;
    private int nam;
    private int soSanPham;
    public static final int DINH_MUC_SAN_PHAM = 100;
    public static final double DON_GIA_SAN_PHAM = 50000;
    // Đóng gói
    public String getMaNV() {
        return maNV;
    }
    public void setMaNV(String maNV) {
        if (maNV == null || maNV.trim().length() == 0)
            throw new IllegalArgumentException("Ma Nhan Vien Khong Duoc De Trong");
        this.maNV = maNV;
    }
    public int getThang() {
        return thang;
    }
    public void setThang(int thang) {
        if (thang < 1 || thang > 12)
            throw new IllegalArgumentException("Thang Phai Nam Trong Khoang [1:12]");
        this.thang = thang;
    }
    public int getNam() {
        return nam;
    }
    public void setNam(int nam) {
        int now = LocalDate.now().getYear();
        if (nam > now)
            throw new IllegalArgumentException("Nam Phai <= Nam Hien Tai");
        this.nam = nam;
    }
    public int getSoSanPham() {
        return soSanPham;
    }
    public void setSoSanPham(int soSanPham) {
        if (soSanPham < 0)
            throw new IllegalArgumentException("So San Pham Phai >= 0");
        this.soSanPham = soSanPham;
    }
    // Constructor
    public LuongNhanVien(String maNV, int thang, int nam, int soSanPham) {
        setMaNV(maNV);
        setThang(thang);
        setNam(nam);
        setSoSanPham(soSanPham);
    }
    // Tính tiền lương <Method>
    public double tinhLuong() {
        if (soSanPham > DINH_MUC_SAN_PHAM)
            return ((soSanPham - DINH_MUC_SAN_PHAM) * DON_GIA_SAN_PHAM * 2) + 100 * DON_GIA_SAN_PHAM;
        else 
            return soSanPham * DON_GIA_SAN_PHAM;
    }
    // getLuong()
    public String getLuong() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return df.format(tinhLuong());
    }
    // getThangNam
    public String getThangNam() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/yyyy");
        LocalDate date = LocalDate.of(getNam(), getThang(), 1);
        return dtf.format(date);
    }
    // Mẫu in
    @Override
    public String toString() {
        return "Ma NV: " + getMaNV() + ", Thang/nam: " + getThangNam() + ", So san pham: " + getSoSanPham() + ", Luong: " + getLuong();
    } 
}
