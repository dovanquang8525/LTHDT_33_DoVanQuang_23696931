package NhanVien;

import java.util.Scanner;

public class MainNhanVien {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        LuongNhanVien nv1 = new LuongNhanVien("001", 9, 2024, 150);
        LuongNhanVien nv2 = new LuongNhanVien("002", 9, 2024, 200);
        LuongNhanVien nv3 = new LuongNhanVien("003", 9, 2024, 90);
        LuongNhanVien nv4 = new LuongNhanVien("004", 10, 2024, 121);
        // Thêm vào danh sách
        DanhSachLuongNhanVien danhSach = new DanhSachLuongNhanVien(10);
        danhSach.themNhanVien(nv1);
        danhSach.themNhanVien(nv2);
        danhSach.themNhanVien(nv3);
        danhSach.themNhanVien(nv4);
        // Xuất danh sách
        danhSach.xuatDanhSach();
        // Xuất danh sách Nhân viên vượt định mức
        System.out.println("Nhap thang: ");
        int thang = sc.nextInt();
        System.out.println("Nhap nam: ");
        int nam = sc.nextInt();
        int soLuongVuotDinhMuc = danhSach.demSoLuongVuotDinhMuc(thang, nam);
        System.out.println("So Luong Nhan Vien Vuot Dinh Muc: " + soLuongVuotDinhMuc);
        System.out.println();
        // Sắp xếp tăng dần
        danhSach.sapXepLuongTang();
        System.out.println("Danh sach luong tang dan: ");
        danhSach.xuatDanhSach();
        // Tống số nhân viên nhận lương
        System.out.println("So nhan vien nhan luong: ");
        System.out.println(danhSach.tongNhanVien()); 
    }
}
