package day03;

public class bai143 {
    public static int soChanDautien(int[] arr){
        int n = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                n = arr[i];
                break;
            }
            else {
                n = -1;
            }
        }
        return n;
    }
    public static void main(String[] args){
        int[] arr1 = {1, 3, 8, 7, 11, 9, 7};
        System.out.println(soChanDautien(arr1));
    }
}
