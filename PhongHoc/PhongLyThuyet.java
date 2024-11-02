package PhongHoc;

public class PhongLyThuyet extends PhongHoc {
    private boolean coMayChieu;

    public boolean isCoMayChieu() {
        return coMayChieu;
    }

    public void setCoMayChieu(boolean coMayChieu) {
        this.coMayChieu = coMayChieu;
    }

    public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.coMayChieu = coMayChieu;
    }

    public boolean kiemTraDatChuan() {
        return (isCoMayChieu() && duAnhSang()) ? true : false;
    }

    @Override
    public String toString() {
        String datChuan = kiemTraDatChuan() ? "Dat" : "Khong Dat";
        String mayChieu = isCoMayChieu() ? "Co May Chieu" : "Khong Co May Chieu";
        String s = "" ;
        s += s.format("|%18s|%20s|", mayChieu, datChuan);
        return super.toString() + s;
    }
}
