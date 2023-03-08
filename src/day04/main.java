package day04;

public class main {
    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat();
        hcn1.setChieudai(0);
        hcn1.setChieurong(4);
        System.out.println("chu vi hcn1: "+ hcn1.chuVi() + " , Diện tích hcn 1: "+ hcn1.dienTich());

        HinhChuNhat hcn2 = new HinhChuNhat();
        hcn2.setChieudai(1.5);
        hcn2.setChieurong(3);
        System.out.println("chu vi hcn2: "+ hcn2.chuVi() + " , Diện tích hcn 2: "+ hcn2.dienTich());

    }
}
