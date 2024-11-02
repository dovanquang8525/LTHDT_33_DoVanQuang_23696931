package PhongHoc;

public class Test {
    public static void main(String[] args) {
		QuanLyPhongHoc ds = new QuanLyPhongHoc();
		
		PhongLyThuyet p1 = new PhongLyThuyet("PO01", "A", 50, 20, true);
		PhongMayTinh p2 = new PhongMayTinh("PO02", "B", 100, 5 , 40);
		PhongThiNghiem p3 = new PhongThiNghiem("PO03", "C", 200, 90, "Hoa Hoc", 150, true);
		
		ds.themPhongHoc(p1);
		ds.themPhongHoc(p2);
		ds.themPhongHoc(p3);
		System.out.println("Danh sach cac phong");
		ds.inDanhSach();
		// System.out.println("Danh sach phong dat chuan");
		// ds.inDanhSachDatChuan();
	}
}
