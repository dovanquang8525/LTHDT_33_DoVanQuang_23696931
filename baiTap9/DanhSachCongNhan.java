package baiTap9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachCongNhan {
    private ArrayList<CongNhan> ds;
    private int maxSize;

    //constructor
    public DanhSachCongNhan(int maxSize) {
        this.ds = new ArrayList<>();
        this.maxSize = maxSize;
    }

    //Method add cong nhan vao danh sanh
    public void themCongNhan(CongNhan congnhan){
        if (ds.size() < maxSize) {
            ds.add(congnhan);
        } else {
            System.out.println("Cannot add more workers, list is full!");
        }
    }

    //Method in thong tin cong nhan
    public void inThongTin() {
        for (CongNhan cn : ds) {
            System.out.println(cn);
        }
    }

    //Method dem so cong nhan
    public int soLuongCongNhan() {
        return ds.size();
    }

    //Method dem so luong cong nhan lam tren 200 sp
    public int soCongNhanTren200SP() {
        int count = 0;
        for (CongNhan cn : ds) {
            if (cn.getmSoSp() > 200){
                count++;
            }
        }
        return count;
    }
    
    //Method sap sep cong nhan theo so sp giam dan
    public void sapXepCongNhan() {
        Collections.sort(ds, new Comparator<CongNhan>() {
            @Override
            public int compare(CongNhan cn1, CongNhan cn2) {
                return Integer.compare(cn2.getmSoSp(), cn1.getmSoSp());
            }
        });
    }
}
