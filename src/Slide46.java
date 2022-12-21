import java.sql.SQLOutput;
import java.util.Scanner;

public class Slide46 {
    public static int[] input(Scanner scanner){
        System.out.print("Nhập số phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] arr = new int [size];
        for(int i = 0; i < size; i++){
            System.out.print("Nhập số thứ " + (i) + ": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static void display(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }
    public static void Max(int[] arr){
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Số lớn nhất trong mảng: " +max);
        System.out.println("Tại vị trí: " + index);
    }
    public static void FirstNegative(int[]arr){
        int number = -1;
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                number = arr[i];
                index = i;
                break;
            }
        }
        if(index != -1) {
            System.out.println("Số âm đầu tiên trong mảng: " + number);
            System.out.println("Tại vị trí: " + index);
        }
        else System.out.println("Không tồn tại số âm trong mảng.");
    }
    public static void MaxNegative(int[]arr){
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max && arr[i] < 0) {
                max = arr[i];
                index = i;
            }
        }
        if(index != -1) {
            System.out.println("Số âm lớn nhất trong mảng: " + max);
            System.out.println("Tại vị trí: " + index);
        }
        else System.out.println("Không tồn tại số âm trong mảng.");
    }
    public static void SumEven(int[]arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0) sum += arr[i];
        }
        System.out.println("Tổng các số chẵn: " + sum);
    }
    public static void CountNegative(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0) count++;
        }
        System.out.println("Đếm số âm: " + count);
    }
    public static void SumNegative(int[] arr){
        int sum = 0;
        for(int i = 0;i < arr.length; i++){
            if(arr[i] < 0) sum += arr[i];
        }
        System.out.println("Tổng các số âm: " + sum);
    }
    public static void Find(int[] arr, int x){
        boolean find = false;
        for(int i =0; i <arr.length; i++){
            if(arr[i] == x){
                find = true;
                System.out.println("=> Tìm thấy giá trị x trong mảng.");
                break;
            }
        }
        if(!find) System.out.println("Không tìm thấy giá trị x trong mảng.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = input(scanner);
        while(true) {
            System.out.println("-------MENU-------");
            System.out.println("0. Thoát");
            System.out.println("1. Tìm số lớn nhất và vị trí của nó trong mảng.");
            System.out.println("2. Tìm số âm đầu tiên và vị trí của nó trong mảng. ");
            System.out.println("3. Tìm số âm lớn nhất và vị trí của nó trong mảng. ");
            System.out.println("4. Tính tổng các số chẵn");
            System.out.println("5. Đếm có bao nhiêu số âm");
            System.out.println("6. Tổng các số âm");
            System.out.println("7. Cho người dùng nhập x và tìm x có trong mảng đó hay không.");
            System.out.println("-----------------");
            System.out.print("Các phần tử trong mảng: ");
            display(arr);
            System.out.print("Nhập sự lựa chọn của bạn: ");
            int choice = scanner.nextInt();

            switch(choice){
                case 0:{
                    return;
                }
                case 1:{
                    Max(arr);
                    break;
                }
                case 2:{
                    FirstNegative(arr);
                    break;
                }
                case 3:{
                    MaxNegative(arr);
                    break;
                }
                case 4:{
                    SumEven(arr);
                    break;
                }
                case 5:{
                    CountNegative(arr);
                    break;
                }
                case 6:{
                    SumNegative(arr);
                    break;
                }
                case 7: {
                    System.out.print("Nhập số x cần tìm: ");
                    int x = scanner.nextInt();
                    Find(arr,x);
                    break;
                }
                default:
                    System.out.println("Không tồn tại lựa chọn này. Nhập lựa chọn khác");
            }
            System.out.println();
        }
    }
}
