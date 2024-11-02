package GiaoDich;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GiaoDichXD {
    private String maGD;
    private String tenGD;
    private String loai;
    private LocalDate ngayNhap;
    private LocalDate ngayXuat;
    private double gia;
    private double soLuong;
    public String getMaGD() {
        return maGD;
    }
    public void setMaGD(String maGD) {
        if (maGD == null || maGD.trim().length() == 0){
            throw new IllegalArgumentException("Ma GD khong duoc de trong");
        } else {
            this.maGD = maGD;
        }
    }
    public String getTenGD() {
        return tenGD;
    }
    public void setTenGD(String tenGD) {
        if (tenGD == null || tenGD.trim().length() == 0)
            throw new IllegalArgumentException("Ten GD khong duoc de trong");
        this.tenGD = tenGD;
    }
    public String getLoai() {
        return loai;
    }
    public void setLoai(String loai) {
        this.loai = loai;
    }
    public LocalDate getNgayNhap() {
        return ngayNhap;
    }
    public void setNgayNhap(LocalDate ngayNhap) {
        LocalDate now = LocalDate.now();
        if (ngayNhap == null || ngayNhap.isAfter(now)){
            throw new IllegalArgumentException("Ngay Nhap phai bang hoac sau ngay hien tai");
        } else {
            this.ngayNhap = ngayNhap;
        }
    }
    public LocalDate getNgayXuat() {
        return ngayXuat;
    }
    public void setNgayXuat(LocalDate ngayXuat) {
        if (ngayXuat.isBefore(ngayNhap)){
            throw new IllegalArgumentException("Ngay Xuat phai sau ngay nhap");
        } else {
            this.ngayXuat = ngayXuat;
        }
    }
    public double getGia() {
        return gia;
    }
    public void setGia(double gia) {
        if (gia <= 0) {
            throw new IllegalArgumentException("Gia GD phai > hon 0");
        } else {
            this.gia = gia;
        }
    }
    public double getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(double soLuong) {
        if (soLuong <= 0) {
            throw new IllegalArgumentException("So Luong phai > hon 0");
        } else {
            this.soLuong = soLuong;
        }
    }
    public GiaoDichXD(String maGD, String tenGD, String loai, LocalDate ngayNhap, LocalDate ngayXuat, double gia,
            double soLuong) {
        setMaGD(maGD);
        if (tenGD != null){
            this.tenGD = tenGD;
        } else {
            this.tenGD = "Chua cap nhat";
        }
        setLoai(loai);
        setNgayNhap(ngayNhap);
        setNgayXuat(ngayXuat);
        setGia(gia);
        setSoLuong(soLuong);
    }
    public double thanhTien() {
        return soLuong * gia;
    }
    public String getThanhTien() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return df.format(thanhTien()) + " VND";
    }
    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,###.00");
        return "Ma GD: " + getMaGD() + ", Ten GD: " + getTenGD() + ", Loai: " + getLoai() + 
        ", Ngay Nhap: " + dtf.format(getNgayNhap()) + ", Ngay Xuat: " + dtf.format(getNgayXuat())
        + ", Gia: " + df.format(getGia()) + ", So Luong: " + getSoLuong() + ", Thanh Tien: " + getThanhTien();
    }
}
