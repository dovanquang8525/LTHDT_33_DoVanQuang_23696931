package baiTap9;

public class CongNhanMain {
    public static void main(String[] args) throws Exception {
        CongNhan cn1 = new CongNhan("CN01", "Nguyen", "Van A" , 150);
        CongNhan cn2 = new CongNhan("CN01", "Pham", "Thi B", 250);
        CongNhan cn3 = new CongNhan("CN03", "Dao", "Xuan C", 365);

        DanhSachCongNhan ds = new DanhSachCongNhan(5);

        // Thêm các công nhân vào danh sách
        ds.themCongNhan(cn1);
        ds.themCongNhan(cn2);
        ds.themCongNhan(cn3);

        // In thông tin các công nhân
        ds.inThongTin();

        // In tổng số công nhân
        System.out.println("Tong so cong nhan: " + ds.soLuongCongNhan());

        // In số công nhân có số sản phẩm trên 200
        System.out.println("So cong nhan co tren 200 san pham: " + ds.soCongNhanTren200SP());

        // Sắp xếp và in danh sách công nhân theo số sản phẩm giảm dần
        ds.sapXepCongNhan();
        System.out.println("Danh sach cong nhan sau khi sap xep theo so san pham:");
        ds.inThongTin();
    }
}

