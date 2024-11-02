package QuanLyPhongHoiNghi;

import java.time.LocalDate;

public class PhongHoiNghiThongThuong extends PhongHoiNghi {
    private String donVi;

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public PhongHoiNghiThongThuong(String maPhong, LocalDate ngayToChuc, int soLuongGhe, String loaiGhe, String donVi) {
        super(maPhong, ngayToChuc, soLuongGhe, loaiGhe);
        this.donVi = donVi;
    }

    public String phongDatChuan() {
        if (getLoaiGhe().equalsIgnoreCase("ghe nem")){
            return "A";
        } else if (getLoaiGhe().equalsIgnoreCase("ghe go")){
            return "B";
        } else  
            return "Khong Dat Chuan";
    }

    @Override
    public String toString() {
        String datChuan = phongDatChuan();
        String s = "";
        s += s.format("|%7s|%50s|", getDonVi(), datChuan);
        return super.toString() + s;
    }
}
