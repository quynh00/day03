package day04.bt_kethua;

public class HinhChuNhat {
    private double chieuDai = 1.0;
    private double chieuRong = 1.0;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        if (chieuDai <= 0 || chieuRong <= 0) {
            throw  new RuntimeException("Cạnh phải là số dương");
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if (chieuDai > 0) {
            this.chieuDai = chieuDai;
        } else {
            throw  new RuntimeException("Cạnh phải là số dương");
        }
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if (chieuRong > 0) {
            this.chieuRong = chieuRong;
        } else {
            throw  new RuntimeException("Cạnh phải là số dương");
        }
    }

    public double chuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public double dienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                ", chuVi=" + chuVi() +
                ", dienTich=" + dienTich() +
                '}';
    }
}
