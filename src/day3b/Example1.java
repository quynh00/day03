package day3b;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args){
        //tạo đối tượng
        Dog d1 = new Dog();
        d1.id = 1;
        d1.name = "pitbull";
        d1.color = "black";
        d1.age = 2;

        //hành vi
        d1.eat();
        d1.run();

        //tạo đối tượng d2 - dữ liệu nhập từ bàn phím
        //dùng các phương thức: run(), eat(), sleep()
        Scanner in = new Scanner(System.in);
        Dog d2 = new Dog();
        System.out.print("Nhập id: ");
        d2.id = Integer.parseInt(in.nextLine());
        System.out.print("Nhập tên: ");
        d2.name = in.nextLine();
        System.out.print("Nhập màu: ");
        d2.color = in.nextLine();

        d2.eat();
        d2.run();
        d2.sleep();

    }
}
