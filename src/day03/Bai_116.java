package day03;

import java.util.Scanner;

//Viết chương trình nhập n và tính tổng
//        S(n) = 1 + 2 + 3 + … + n
public class Bai_116 {
    public static int Sum(int n){
        if (n <= 0){
            return -1;
        }
        int s = 0;
        for (int i = 1; i <= n; i++){
            s += i;
        }
        return s;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = in.nextInt();
        if ( n != -1){
            System.out.println("Tổng S(n) = "+ Sum(n) );
        }else {
            System.out.println("n không hợp lệ");
        }
    }
}
