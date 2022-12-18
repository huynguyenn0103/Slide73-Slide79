import java.sql.SQLOutput;
import java.util.Scanner;

public class Slide47Bai1 {
    public static void SumOfPositive(int[] arr){
        int sum = 0;
        for(int i = 0;i < arr.length; i++){
            if(arr[i] > 0) sum += arr[i];
        }
        System.out.println("Tổng các số dương: " + sum);
    }
    public static void SumOfOdd(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0) sum += arr[i];
        }
        System.out.println("Tổng các số lẻ: " + sum);
    }
    public static void CountPositive(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0) count++;
        }
        System.out.println("Đếm số dương: " + count);
    }
    public static void Min(int[] arr){
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Số nhỏ nhất trong mảng: " +min);
        System.out.println("Tại vị trí: " + index);
    }
    public static void LastEven(int[] arr){
        int number = -1;
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                number = arr[i];
                index = i;
            }
        }
            System.out.println("Số chẵn cuối cùng trong mảng: " + number);
            if(index != -1) {
                System.out.println("Tại vị trí: " + index);
            }
    }
    public static void FirstEven(int[] arr){
        int number = -1;
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                number = arr[i];
                index = i;
                break;
            }
        }
        System.out.println("Số chẵn đầu tiên trong mảng: " + number);
        if(index != -1) {
            System.out.println("Tại vị trí: " + index);
        }
    }
    public static void PrimeNumber(int[] arr){
        int number = -1;
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(checkPrime(arr[i])){
                number = arr[i];
                index = i;
                break;
            }
        }
        System.out.println("Số nguyên tố đầu tiên trong mảng: " + number);
        if(index != -1) {
            System.out.println("Tại vị trí: " + index);
        }
    }
    public static boolean checkPrime(int a){
        if(a <= 1) return false;
        else if(a == 2) return true;
        else{
            for(int i= 2; i < a; i++){
                if(a % i == 0) return false;
            }
            return true;
        }
    }
    public static void LastPositive(int[] arr){
        int number = -1;
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                number = arr[i];
                index = i;
            }
        }
        System.out.println("Số dương cuối cùng trong mảng: " + number);
        if(index != -1) {
            System.out.println("Tại vị trí: " + index);
        }
    }
    public static void MinEven(int[] arr){
        int min = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        if(index != -1) {
            System.out.println("Tại vị trí: " + index);
            System.out.println("Số nhỏ nhất trong mảng: " +min);
        }
        else{
            System.out.println("Số nhỏ nhất trong mảng: " + (-1));
        }
    }
    public static void display(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] arr = new int [size];
        for(int i = 0; i < size; i++){
            System.out.print("Nhập số thứ " + (i) + ": ");
            arr[i] = scanner.nextInt();
        }
        while(true) {
            System.out.println("-------MENU-------");
            System.out.println("0. Thoát");
            System.out.println("1. Tổng các số dương");
            System.out.println("2. Tổng các số lẻ");
            System.out.println("3. Đếm có bao nhiêu số dương");
            System.out.println("4. Số nhỏ nhất trong mảng");
            System.out.println("5. Số chẵn cuối cùng. Nếu không có trả về -1");
            System.out.println("6. Số chẵn đầu tiên. Nếu không có trả về -1");
            System.out.println("7. Số nguyên tố đầu tiên. Nếu không có trả về -1");
            System.out.println("8. Số dương cuối cùng. Nếu không có trả về -1");
            System.out.println("9. Số chẵn nhỏ nhất. Nếu không có trả về -1");
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
                    SumOfPositive(arr);
                    break;
                }
                case 2:{
                    SumOfOdd(arr);
                    break;
                }
                case 3:{
                    CountPositive(arr);
                    break;
                }
                case 4:{
                    Min(arr);
                    break;
                }
                case 5:{
                    LastEven(arr);
                    break;
                }
                case 6:{
                    FirstEven(arr);
                    break;
                }
                case 7: {
                    PrimeNumber(arr);
                    break;
                }
                case 8:{
                    LastPositive(arr);
                    break;
                }
                case 9:{
                    MinEven(arr);
                    break;
                }
                default:
                    System.out.println("Không tồn tại lựa chọn này. Nhập lựa chọn khác");
            }
            System.out.println();
        }
    }
}
