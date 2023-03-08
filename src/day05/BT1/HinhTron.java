package day05.BT1;

public class HinhTron extends HinhHoc{
    private double banKinh = 1.0;

    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron(String mauSac, double banKinh) {
        super(mauSac);
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if ( banKinh <= 0){
            throw new RuntimeException("bán kinh không hợp lệ");
        }
        this.banKinh = banKinh;
    }
    @Override
    public double tinhChuVi() {
        return 2*Math.PI*banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*banKinh*banKinh;
    }

    @Override
    public String toString() {
        return "HinhTron[" + super.toString() +
                ", banKinh=" + banKinh +
                ']';
    }
}
