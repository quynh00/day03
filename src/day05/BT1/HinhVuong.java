package day05.BT1;

public class HinhVuong extends HinhHoc{
    private double canh = 1.0;

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public HinhVuong(String mauSac, double canh) {
        super(mauSac);
        this.canh = canh;
    }

    public HinhVuong(String mauSac) {
        super(mauSac);
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        if (canh <= 0){
            throw new RuntimeException("cạnh không hợp lệ");
        }
        this.canh = canh;
    }

    @Override
    public double tinhChuVi() {
        return 4*canh;
    }

    @Override
    public double tinhDienTich() {
        return canh*canh;
    }

    @Override
    public String toString() {
        return "HinhVuong[" + super.toString() +
                ", canh=" + canh +
                ']';
    }
}
