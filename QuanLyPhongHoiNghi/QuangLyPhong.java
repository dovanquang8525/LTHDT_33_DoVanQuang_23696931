package QuanLyPhongHoiNghi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QuangLyPhong {
    private List<PhongHoiNghi> ds;

    public QuangLyPhong() {
        ds = new ArrayList<>();
    }

    public boolean themPhong(PhongHoiNghi phong){
        for (PhongHoiNghi phongHoiNghi : ds) {
            if(phongHoiNghi.getMaPhong().equals(phong.getMaPhong())){
                return false;
            }
        }
        ds.add(phong);
        return true;
    }

    public void xoaPhong(PhongHoiNghi phong){
        ds.removeIf(phongHoiNghi -> phongHoiNghi.getMaPhong().equals(phong.getMaPhong()));
    }

    public int soLuongPhongDatChuan() {
        int count = 0;
        for (PhongHoiNghi phongHoiNghi : ds) {
            if (phongHoiNghi instanceof PhongHoiNghiThongThuong && phongHoiNghi.phongDatChuan().equalsIgnoreCase("A")){
                count++;
            } else if (phongHoiNghi instanceof PhongHoiNghiQuocTe && phongHoiNghi.phongDatChuan().equalsIgnoreCase("VIP")){
                count++;
            }
        }
        return count;
    }

    public void sapXepTangDanTheoMaPhong() {
        Collections.sort(ds, Comparator.comparing(phong -> phong.getMaPhong()));
    }

    public void hienThiPhongNam2022() {
		System.out.printf("|%10s|%10s|%10s|%10s|%15s|%10s|%28s|", "Ma Phong", "Ngay To Chuc", "So Luong Ghe", "Loai Ghe", "Don Vi | Quoc Tich", "Thiet Bi", "Dat Chuan");
		System.out.println();
		System.out.println("============================================================================================================");
		for (PhongHoiNghi phongHoiNghi : ds) {
			if (phongHoiNghi.getNgayToChuc().getYear() == 2022) {
				System.out.println(phongHoiNghi);
			}
		}
	}
	
	public void inDanhSach() {
		System.out.printf("|%10s|%10s|%10s|%10s|%10s|%10s|%28s|", "Ma Phong", "Ngay To Chuc", "So Luong Ghe", "Loai Ghe", "Don Vi | Quoc Tich", "Thiet Bi", "Dat Chuan");
		System.out.println();
		System.out.println("============================================================================================================");
		for (PhongHoiNghi phongHoiNghi : ds) {
			System.out.println(phongHoiNghi);
		}
	}
}
