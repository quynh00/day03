package day05.BT1;

public class HinhLucGiacDeu extends HinhHoc{
    private double canh = 1;

    public HinhLucGiacDeu() {
    }

    public HinhLucGiacDeu(double canh) {
        this.canh = canh;
    }

    public HinhLucGiacDeu(String mauSac, double canh) {
        super(mauSac);
        this.canh = canh;
    }

    @Override
    public double tinhChuVi() {
        return 6*canh;
    }

    @Override
    public double tinhDienTich() {
        return 3*Math.sqrt(3)*canh*canh/2;
    }

    @Override
    public String toString() {
        return "HinhLucGiacDeu[" + super.toString() +
                ", canh=" + canh +
                ']';
    }
}
