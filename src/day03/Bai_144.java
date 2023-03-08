package day03;
//4.Tìm “số nguyên tố đầu tiên” trong mảng một chiều các số nguyên
//        (nguyentodau). Nếu mảng không có số nguyên tố thì trả về giá trị -1
public class Bai_144 {

    public static boolean kiemTraNguyenTo(int n){
        // Nguyên tố - true, ko nguyên tố là false
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static int soNguyenToDauTienTrongMang(int[] arr){
        for(int i = 0; i < arr.length; i++){
            // Kiem tra tung arr[i]
            if(kiemTraNguyenTo(arr[i]) == true){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 8, 4, -5, 9, 11, 13, 30}; //11
        int[] arr2 = {1, 4, 0, -4, 8, 10, 20};  // -1

        System.out.println(soNguyenToDauTienTrongMang(arr1));
        System.out.println(soNguyenToDauTienTrongMang(arr2));

    }
}
