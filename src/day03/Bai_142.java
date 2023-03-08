package day03;
//Tìm “giá trị nhỏ nhất” trong mảng một chiều số thực (nhonhat)
public class Bai_142 {
    public static double minArr(double[] arr){
        double min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (min > arr[i]){{
                min = arr[i];
            }}
        }
        return min;
    }
    public static void main(String[] args){
        double[] arr1 = {1.0, 2.0, 4.6, 2.3, 20.4};
        System.out.println("Giá trị nhỏ nhất trong mảng: "+ minArr(arr1));
    }
}
