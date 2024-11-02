package QuanLyPhongHoiNghi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class PhongHoiNghi {
    protected String maPhong;
    protected LocalDate ngayToChuc;
    protected int soLuongGhe;
    protected String loaiGhe;
    public abstract String phongDatChuan();
    public String getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }
    public LocalDate getNgayToChuc() {
        return ngayToChuc;
    }
    public void setNgayToChuc(LocalDate ngayToChuc) {
        this.ngayToChuc = ngayToChuc;
    }
    public int getSoLuongGhe() {
        return soLuongGhe;
    }
    public void setSoLuongGhe(int soLuongGhe) {
        this.soLuongGhe = soLuongGhe;
    }
    public String getLoaiGhe() {
        return loaiGhe;
    }
    public void setLoaiGhe(String loaiGhe) {
        this.loaiGhe = loaiGhe;
    }
    public PhongHoiNghi(String maPhong, LocalDate ngayToChuc, int soLuongGhe, String loaiGhe) {
        this.maPhong = maPhong;
        this.ngayToChuc = ngayToChuc;
        this.soLuongGhe = soLuongGhe;
        this.loaiGhe = loaiGhe;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((maPhong == null) ? 0 : maPhong.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PhongHoiNghi other = (PhongHoiNghi) obj;
        if (maPhong == null) {
            if (other.maPhong != null)
                return false;
        } else if (!maPhong.equals(other.maPhong))
            return false;
        return true;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String s = "";
        s += s.format("|%10s|%12s|%12s|%10s", getMaPhong(), dtf.format(getNgayToChuc()), getSoLuongGhe(), getLoaiGhe());
        return s;
    }
}
