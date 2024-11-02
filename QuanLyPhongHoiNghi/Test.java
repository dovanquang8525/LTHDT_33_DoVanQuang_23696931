package QuanLyPhongHoiNghi;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        QuangLyPhong ds = new QuangLyPhong();

        PhongHoiNghiThongThuong p1 = new PhongHoiNghiThongThuong("P009", LocalDate.of(2022, 1, 1), 100, "ghe nem", "DV01");
		PhongHoiNghiThongThuong p2 = new PhongHoiNghiThongThuong("P005", LocalDate.of(2024, 11, 12), 160, "ghe go", "DV02");
		PhongHoiNghiThongThuong p3 = new PhongHoiNghiThongThuong("P007", LocalDate.of(2023, 8, 5), 120, "null", "DV03");
		PhongHoiNghiQuocTe p4 = new PhongHoiNghiQuocTe("P108", LocalDate.of(2022, 5, 8), 250, "ghe nem", "Cuba", true);
		PhongHoiNghiQuocTe p5 = new PhongHoiNghiQuocTe("P102", LocalDate.of(2021, 9, 12), 140, "ghe go", "Trung", false);
		PhongHoiNghiQuocTe p6 = new PhongHoiNghiQuocTe("P101", LocalDate.of(2022, 1, 1), 100, "null", "My", false);
		
		ds.themPhong(p1);
		ds.themPhong(p2);
		ds.themPhong(p3);
		ds.themPhong(p4);
		ds.themPhong(p5);
		ds.themPhong(p6);
		
		ds.inDanhSach();
		System.out.println();
		
		System.out.println("So Luong Phong Dat Chuan A, VIP " + ds.soLuongPhongDatChuan());
		System.out.println();
		
		ds.sapXepTangDanTheoMaPhong();
		System.out.println("Danh Sach Sap Xep Theo Ma Phong");
		ds.inDanhSach();
		System.out.println();
		
		System.out.println("Danh Sach Phong Hoi Nghi Nam 2022");
		ds.hienThiPhongNam2022();

        System.out.println();
        ds.xoaPhong(p6);
        ds.inDanhSach();
    }
}
