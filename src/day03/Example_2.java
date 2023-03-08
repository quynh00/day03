package day03;

import java.util.Random;

public class Example_2 {
    //1. hàm không có giá trị trả về và không có tham số

    public static void  sayHello(){
        System.out.println("Hello, welcome to ");
    }
    //2. hàm k có giá trị trả về và có tham số
    public static void  sayHello(String language){
        System.out.println("Hello, welcome to " + language);
    }
    //3. hàm có giá trị trả về và không có tham số
    public static int getRandomNumber(){
        return new Random().nextInt(1000);
    }

    //4. hàm có giá trị trả về và có tham số

    public static double sumAB(double a, double b){
        return (a+b);
    }
    public  static void main(String[] args){
        sayHello();
        sayHello("php");

        //những hàm có giá trị trả về
        //in ra tổng
        int number_1 = getRandomNumber();
        int number_2 = getRandomNumber();
        int t = number_1 + number_2;
        System.out.println(number_1 +", "+ number_2 +" tổng: "+ t);

        //tính tổng 3 số x,y,z
        double x=1.5, y=2.5, z=10.5;
        double k = sumAB(sumAB(x,y),z);

    }
}
