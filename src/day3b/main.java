package day3b;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
//        HinhChuNhat a = new HinhChuNhat();
//        a.chieuRong = 4;
//        a.chieuDai = 5;
//
//        System.out.println("Chu vi = "+ a.tinhChuVi());
//        System.out.println("Diện tích = "+ a.tinhDienTich());
//
//        HinhChuNhat hcn2 = new HinhChuNhat(5,6);
//        System.out.println("Chu vi = "+ hcn2.tinhChuVi());
//        System.out.println("Diện tích = "+ hcn2.tinhDienTich());
//
//        //tạo hcn 3 - với các dữ liệu nhập từ bàn phím -> in ra
//        HinhChuNhat hcn3 = new HinhChuNhat();
//        Scanner in = new Scanner(System.in);
//        System.out.println("Nhập chiều dài, chiều rộng: ");
//        hcn3.chieuDai = in.nextDouble();
//        hcn3.chieuRong = in.nextDouble();
//        System.out.println("Chu vi = "+ hcn3.tinhChuVi());
//        System.out.println("Diện tích = "+ hcn3.tinhDienTich());


        //Nhập vào 1 mảng các hình chữ nhật => in ra hình có diện tích lớn nhất
        int size;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng: ");
        size = in.nextInt();
        // khai báo mảng int[] arr = new int[3]
        HinhChuNhat[] arr = new HinhChuNhat[size];

        //nhập dữ liệu cho arr[i]
        for (int i = 0; i < size; i++){
            System.out.println("HCN thứ: " + i);
            System.out.println("Chiều dài: ");
            double chieuDai = in.nextDouble();
            System.out.println("Chiều rộng: ");
            double chieuRong = in.nextDouble();
            //tạo đối tượng hcn ở vị trí index 1
            arr[i] = new HinhChuNhat(chieuDai, chieuRong);
        }
        in.close();

        //in ra mảng
        for (int i = 0; i < size; i++){
            System.out.println(arr[i].toString());
        }

        //in ra hcn có diện tích lớn nhất
        double dtMax = arr[0].tinhDienTich();
        int vtMax = 0;

        for (int i = 1; i < arr.length; i++){
            if (dtMax < arr[i].tinhDienTich()) {
                dtMax = arr[i].tinhDienTich();
                vtMax = i;
            }
        }
        System.out.println("Hinh chu nhat co dien tich lon nhat la");
        System.out.println(arr[vtMax].toString());
        System.out.println("Dien tich max la " + dtMax);
    }
}
