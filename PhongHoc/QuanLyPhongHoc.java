package PhongHoc;

import java.util.ArrayList;
import java.util.List;

public class QuanLyPhongHoc {
    private List<PhongHoc> ds;
    // khoi tao mang
    public QuanLyPhongHoc() {
        ds = new ArrayList<PhongHoc>();
    }
    // them phong
    public boolean themPhongHoc(PhongHoc phong){
        for (PhongHoc phongHoc : ds) {
            if (phongHoc.getMaPhong().equals(phong.getMaPhong())){
                return false;
            }
        }
        ds.add(phong);
        return true;
    }
    // tim phong
    public PhongHoc timPhongHoc(String ma) {
        for (PhongHoc phongHoc : ds) {
            if (phongHoc.getMaPhong().equals(ma))
                return phongHoc;
        }
        return null;
    }
    // in danh sanh
    public void inDanhSach() {
        System.out.printf("|%10s|%10s|%10s|%10s|%11s|%18s|%20s|", "Ma phong", "Day Nha", "Dien Tich", "Bong Den", "Anh sang", "Dieu Kien", "Dat/ Khong Dat");
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------");
        for (PhongHoc phongHoc : ds) {
            System.out.println(phongHoc);
            System.out.println("-------------------------------------------------------------------------------------------------");
        }
    }
    // in danh sach phong hoc dat chuan
    public void inDanhSachDatChuan() {
        for (PhongHoc phongHoc : ds) {
            if (phongHoc.kiemTraDatChuan()) {
                System.out.println(phongHoc);
            }
        }
    }
    // sap xep danh tang dan theo day nha
}
