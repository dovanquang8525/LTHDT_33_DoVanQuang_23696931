package GiaoDich;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class MainGiaoDich {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        ListGiaoDich ds = new ListGiaoDich(10);

        GiaoDichXD gd1 = new GiaoDichXD("GD01", "Giao Dich Xang", "xang", LocalDate.of(2022, 12, 5), LocalDate.of(2024, 1, 1), 100000, 50);
        GiaoDichXD gd2 = new GiaoDichXD("GD02", "Giao Dich Sat", "sat", LocalDate.of(2021, 3, 10), LocalDate.of(2023, 4, 12), 320000, 60);
        GiaoDichXD gd3 = new GiaoDichXD("GD03", "Giao Dich Vang", "vang", LocalDate.of(2023, 8, 1), LocalDate.of(2025, 12, 1), 520000, 70);
        GiaoDichXD gd4 = new GiaoDichXD("GD04", "Giao Dich Xang", "xang", LocalDate.of(2023, 1, 1), LocalDate.of(2026, 1, 1), 100000, 200);

        ds.themGiaoDich(gd1);
        ds.themGiaoDich(gd2);
        ds.themGiaoDich(gd3);
        ds.themGiaoDich(gd4);

        System.out.println("Danh Sach Giao Dich");
        ds.inDanhSachGD();
        System.out.println("============================================");

        System.out.println("Sap Xep Theo Ngay Nhap Tang Dan");
        ds.sapXepTangTHeoNgayNhap();
        ds.inDanhSachGD();
        System.out.println("============================================");

        System.out.println("Tong Tien Giao Dich");
        System.out.println(df.format(ds.tongTienGD()));
        System.out.println("============================================");

        System.out.println("Tong Tien Giao Dich Xang");
        System.out.println(df.format(ds.tongTienGD_Xang()));
        System.out.println("============================================");

        System.out.println("Danh Sach Giao Dich Nam 2022 va Nam 2023");
        ds.danhSachNam2022_2023();
        System.out.println("============================================");
    }
}
