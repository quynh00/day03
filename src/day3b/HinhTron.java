package day3b;

public class HinhTron {
    double r;

    public HinhTron(double r){
        this.r = r;
    }
    public double tinhChuVi(){
        return 2*r*Math.PI;
    }
    public double tinhDienTich(){
        return Math.PI*r*r;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "r=" + r +
                '}';
    }
}
