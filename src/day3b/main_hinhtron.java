package day3b;

import java.util.Scanner;

public class main_hinhtron {
    public static void main(String[] args) {
        int size;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng: ");
        size = in.nextInt();

        HinhTron[] arr = new HinhTron[size];

        //nhập dữ liệu cho arr[i]
        for (int i = 0; i < size; i++) {
            System.out.println("Hình tròn thứ: " + i);
            System.out.println("Bán kính: ");
            double r = in.nextDouble();
            arr[i] = new HinhTron(r);
        }
        in.close();

        //in ra mảng
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i].toString());
        }

        //in ra hình tròn có chu vi lớn nhất
        double cvMax = arr[0].tinhChuVi();
        int vtMax = 0;

        for (int i = 1; i < arr.length; i++) {
            if (cvMax < arr[i].tinhChuVi()) {
                cvMax = arr[i].tinhChuVi();
                vtMax = i;
            }
        }
        //in ra hình có diện tích bé nhất
        double dtMin = arr[0].tinhDienTich();
        int vtMin = 0;

        for (int i = 1; i < arr.length; i++) {
            if (dtMin > arr[i].tinhDienTich()) {
                dtMin = arr[i].tinhDienTich();
                vtMin = i;
            }
        }
        //Tính trung bình của chu vi các hình tròn.
        double cvSum = 0;
        double cvTB = 0;
        for (int i = 1; i < arr.length; i++) {
            cvSum += arr[i].tinhChuVi();

            cvTB = (double) (cvSum/ arr.length);
        }

        //Có bao nhiêu hình có chu vi lớn hơn trung bình cộng chu vi
        int dem = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i].tinhChuVi() > cvTB)
                dem++;
        }

        //sắp xếp nổi bọt



        System.out.println("Hình tròn có chu vi lớn nhất là : " + arr[vtMax].toString());
        System.out.println("Chu vi max là " + cvMax);

        System.out.println("Hình tròn có diện tích bé nhất là : " + arr[vtMin].toString());
        System.out.println("Diện tích bé nhất là " + dtMin);

        System.out.println("Trung bình chu vi các hình tròn là : "+ cvTB);
        System.out.println(dem);


    }
}
