package day04;

public class HinhChuNhat {
    private double chieudai = 1.0;
    private double chieurong = 1.0;

    public HinhChuNhat() {

    }

    public double getChieudai() {
        return chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }
    public void setChieudai(double chieudai) {
        if (chieudai > 0){
            this.chieudai = chieudai;
        }else {
            System.out.println("Chiều dài không hợp lệ");
        }
    }
    public void setChieurong(double chieurong) {
        if (chieurong > 0){
            this.chieurong = chieurong;
        }else {
            System.out.println("Chiều rộng không hợp lệ");
        }
    }

    public HinhChuNhat(double chieudai, double chieurong) {
        this.chieurong = chieurong;
        this.chieudai = chieudai;
    }
    public double chuVi(){
        return (chieudai + chieurong)*2;
    }
    public double dienTich(){
        return chieudai*chieurong;
    }


    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieudai=" + chieudai +
                ", chieurong=" + chieurong +
                '}';
    }
}
