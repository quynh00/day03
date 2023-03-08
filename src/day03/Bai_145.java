package day03;

public class Bai_145 {
    public static boolean sohoanthien(int n){
        int sum = 0;
        for (int i = 1 ; i < n; i++){
            if( n % i == 0){
                sum += i;
            }
        }
        if (sum == n){
            return true;
        }
        return false;
    }

    public static int sosohoanthienDauTienTrongMang(int[] arr){
        for(int i = 0; i < arr.length; i++){
            // Kiem tra tung arr[i]
            if(sohoanthien(arr[i]) == true){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 8, 4, -5, 9, 11, 13, 30}; //11
        int[] arr2 = {1, 4, 6, -4, 8, 10, 20};  // -1

        System.out.println(sosohoanthienDauTienTrongMang(arr1));
        System.out.println(sosohoanthienDauTienTrongMang(arr2));

    }

}
