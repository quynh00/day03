package day05.BT1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HinhHoc[] arr = new HinhHoc[4];
        arr[0] = new HinhTron(3);
        arr[1] = new HinhVuong(4);
        arr[2] = new HinhTron(10);
        arr[3] = new HinhLucGiacDeu(3);

        //Diện tích lơn nhất
        HinhHoc hinhHocMax = null;
        double dtMax = 0;
        for (HinhHoc h: arr){
            if (h.tinhDienTich() > dtMax){
                dtMax = h.tinhDienTich();
                hinhHocMax = h;
            }
        }
        System.out.println("hình có diện tích lớn nhất là: "+ hinhHocMax);

        //Chu vi bé nhất
        HinhHoc hinhHocMin = null;
        double cvMin = arr[0].tinhChuVi();
        for (HinhHoc h: arr){
            if (h.tinhChuVi() < cvMin){
                cvMin = h.tinhChuVi();
                hinhHocMin = h;
            }
        }
        System.out.println("hình có chu vi nhỏ nhất là: "+ hinhHocMin);
    }
}
