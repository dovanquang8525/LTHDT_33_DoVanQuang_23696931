package baiTap9;

public class CongNhan {
    private String maCN;
    private String mHo;
    private String mTen;
    private int mSoSp;
    // dong goi
    public String getmTen() {
        return mTen;
    }
    public void setmTen(String mTen) {
        this.mTen = mTen;
    }
    public String getMaCN() {
        return maCN;
    }
    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }
    public String getmHo() {
        return mHo;
    }
    public void setmHo(String mHo) {
        this.mHo = mHo;
    }
    public int getmSoSp() {
        return mSoSp;
    }
    public void setmSoSp(int mSoSp) throws Exception {
        if (mSoSp < 0){
            throw new Exception("San pham khong the nho hon 0");
        }
        else {
            this.mSoSp = mSoSp;
        }
    }
    // constructor
    public CongNhan(String maCN, String mHo, String mTen, int mSoSp) throws Exception {
        this.maCN = maCN;
        this.mHo = mHo;
        if (mSoSp < 0){
            throw new Exception("San pham khong the nho hon 0");
        }
        else {
            this.mSoSp = mSoSp;
        }
        this.mTen = mTen;
    }
    //Phuong thuc
    public double getTinhLuong() {
        double tinhTongLuong = 0;
        if (getmSoSp() < 200) {
            tinhTongLuong = getmSoSp() * 0.5;
        } else if (getmSoSp() < 400) {
            tinhTongLuong = (getmSoSp() - 199) * 0.55 + 199 * 0.5;
        } else if (getmSoSp() < 600) {
            tinhTongLuong = (getmSoSp() - 399) * 0.6 + 200 * 0.55 + 199 * 0.5;
        } else if (getmSoSp() >= 600){
            tinhTongLuong = (getmSoSp() - 599) * 0.65 + 200 * 0.6 + 200 * 0.55 + 199 * 0.5;
        }
        return tinhTongLuong;
    }
    //mau in soString()
    @Override
    public String toString() {
        return "ID: " + getMaCN() + " |Ho: " + getmHo() + " |Ten: " + getmTen() + " |soSanPham: " + getmSoSp() + " |Luong: " + getTinhLuong();
    } 
}
