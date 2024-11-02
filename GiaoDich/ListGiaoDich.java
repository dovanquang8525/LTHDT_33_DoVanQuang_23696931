package GiaoDich;

public class ListGiaoDich {
    private GiaoDichXD[] ds;
    private int soLuongHienCo;
    // khoi tao 
    public ListGiaoDich(int kichThuoc){
        ds = new GiaoDichXD[kichThuoc];
        soLuongHienCo = 0;
    }
    // them
    public boolean themGiaoDich(GiaoDichXD giaoDichXD) {
        // kiem tra
        for (int i = 0; i < soLuongHienCo; i++) {
            if (ds[i].getMaGD().equals(giaoDichXD.getMaGD())){
                System.out.println("Ma GD bi trung");
                return false;
            }
        }
        ds[soLuongHienCo] = giaoDichXD;
        soLuongHienCo++;
        return true;
    }
    // sap xep
    public void sapXepTangTHeoNgayNhap() {
        for (int i = 0; i < soLuongHienCo; i++){
            for (int j = i+1; j < soLuongHienCo; j++){
                if (ds[i].getNgayNhap().getDayOfMonth() > ds[j].getNgayNhap().getDayOfMonth()){
                    GiaoDichXD tam = ds[i];
                    ds[i] = ds[j];
                    ds[j] = tam;
                }
            }
        }
    }
    // tinh tong tien 
    public double tongTienGD() {
        double tongTien = 0;
        for (int i = 0; i < soLuongHienCo; i++){
            tongTien += ds[i].thanhTien();
        }
        return tongTien;
    }
    // tong tien theo xang
    public double tongTienGD_Xang() {
        double tongTien = 0;
        for (int i = 0; i < soLuongHienCo; i++) {
            if (ds[i].getLoai() == "xang"){
                tongTien += ds[i].thanhTien();
                System.out.println(ds[i].toString());
            }
        }
        return tongTien;
    }
    // in danh sach GD
    public void inDanhSachGD() {
        for (int i = 0; i < soLuongHienCo; i++) {
            System.out.println(ds[i].toString());
        }
    }
    // in danh sach GD nam 2022, 2023
    public void danhSachNam2022_2023() {
        for (int i = 0; i< soLuongHienCo; i++){
            if (ds[i].getNgayNhap().getYear() == 2022 || ds[i].getNgayNhap().getYear() == 2023){
                System.out.println(ds[i].toString());
            }
        }
    }
}
