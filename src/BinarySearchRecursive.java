import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {
    public static int binarySearch(int[] array, int left, int right, int value) {
        //Neu left vuot qua right, khong tim thay phan tu
        if (left > right) {
            return -1; //Khong tim thay
        }
        //Tinh chi so trung binh
        int middle = (left + right) / 2;
        //Kiem tra neu phan tu o vi tri middle bang gia tri can tim
        if (array[middle] == value) {
            return middle;
        }
        //Neu gia tri can tim lon hon gia tri tai middle, tim o nua phai
        if (value > array[middle]) {
            return binarySearch(array, middle + 1, right, value);
        }
        //Neu gia tri can tim nho hon gia tri tai middle, tim o nua trai
        return binarySearch(array, left, middle - 1, value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nhap so luong phan tu trong mang
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        //Khoi tao mang va nhap cac phan tu
        int[] array = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        //Sap xep mang theo thu tu tang dan
        Arrays.sort(array);
        //Hien thi mang da sap xep
        System.out.println("Mang sau khi sap xep " + Arrays.toString(array));
        //Nhap gia tri can tim kiem
        System.out.print("Nhap gia tri can tim: ");
        int value = sc.nextInt();
        //Tim kiem gia tri trong mang
        int result = binarySearch(array, 0, array.length - 1, value);
        //Hien thi ket qua tim kiem
        if (result != -1) {
            System.out.println("Gia tri " + value + " duoc tim thay tai chi so " + result);
        } else {
            System.out.println("Khong tim thay trong mang!");
        }
    }
}
