package NhanVien;

public class DanhSachLuongNhanVien {
    private LuongNhanVien[] danhSach;
    private int soLuongHienCo; // Số lượng phần tử của LuongNhanVien
    // Khởi tạo mảng
    public DanhSachLuongNhanVien(int kichThuoc){
        danhSach = new LuongNhanVien[kichThuoc];
        soLuongHienCo = 0;
    }
    // Xuất danh sách lương Nhân viên
    public void xuatDanhSach() {
        for (int i = 0; i < soLuongHienCo; i++) {
            System.out.printf("STT: %-5d", (i + 1));
            System.out.println(danhSach[i].toString());
        }
    }
    // Thêm
    public boolean themNhanVien(LuongNhanVien luongNhanVien){
        // Kiểm tra trùng lặp
        for (int i = 0; i < soLuongHienCo; i++) {
            if (danhSach[i].getMaNV().equals(luongNhanVien.getMaNV()))
                return false; // Bị trùng lặp
        }
        
        danhSach[soLuongHienCo] = luongNhanVien;
        soLuongHienCo++;
        return true;
    }
    // Đếm số lượng lượng sản phẩm vượt Định mức
    public int demSoLuongVuotDinhMuc(int x, int y){
        int count = 0;
        for (int i = 0; i < soLuongHienCo; i++) {
            if (danhSach[i].getThang() == x && danhSach[i].getNam() == y && danhSach[i].getSoSanPham() > LuongNhanVien.DINH_MUC_SAN_PHAM){
                count++;
            }
        }
        return count;
    }
    // Sắp xếp lương tăng dần
    public void sapXepLuongTang(){
        for (int i = 0; i < soLuongHienCo; i++) {
            for (int j = i+1; j < soLuongHienCo; j++){
                if (danhSach[i].tinhLuong() > danhSach[j].tinhLuong()){
                    LuongNhanVien tam = danhSach[i];
                    danhSach[i] = danhSach[j];
                    danhSach[j] = tam;
                }
            }
        }
    }
    // Tổng số Nhân viên nhận lương
    public int tongNhanVien(){
        return soLuongHienCo;
    }
}

