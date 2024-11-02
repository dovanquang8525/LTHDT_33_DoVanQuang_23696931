package QuanLyPhongHoiNghi;

import java.time.LocalDate;

public class PhongHoiNghiQuocTe extends PhongHoiNghi{
    private String quocTich;
    private boolean thietBiHoTro;
    public String getQuocTich() {
        return quocTich;
    }
    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
    public boolean isThietBiHoTro() {
        return thietBiHoTro;
    }
    public void setThietBiHoTro(boolean thietBiHoTro) {
        this.thietBiHoTro = thietBiHoTro;
    }
    public PhongHoiNghiQuocTe(String maPhong, LocalDate ngayToChuc, int soLuongGhe, String loaiGhe, String quocTich,
            boolean thietBiHoTro) {
        super(maPhong, ngayToChuc, soLuongGhe, loaiGhe);
        this.quocTich = quocTich;
        this.thietBiHoTro = thietBiHoTro;
    }

    public String phongDatChuan() {
        if (getLoaiGhe().equalsIgnoreCase("ghe nem") && isThietBiHoTro()){
            return "VIP";
        } else if (getLoaiGhe().equalsIgnoreCase("ghe go") && !isThietBiHoTro()){
            return "NOR";
        } else 
            return "Khong Dat Chuan";
    }

    @Override
    public String toString() {
        String datChuan = phongDatChuan();
        String thietBi = isThietBiHoTro() ? "Co" : "Khong Co";
        String s = "";
        s += s.format("|%18s|%10s|%28s|",getQuocTich(), thietBi, datChuan);
        return super.toString() + s;
    }
}
