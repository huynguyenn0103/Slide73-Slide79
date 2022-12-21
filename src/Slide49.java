import com.sun.nio.sctp.SctpServerChannel;

import java.util.Scanner;

public class Slide49 {
    public static double[] input(Scanner scanner){
        System.out.print("Nhập số phần tử của mảng: ");
        int size = scanner.nextInt();
        double[] arr = new double [size];
        for(int i = 0; i < size; i++){
            System.out.print("Nhập số thứ " + (i) + ": ");
            arr[i] = scanner.nextDouble();
        }
        return arr;
    }
    public static void display(double[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }
    public static double Max(double[] arr){
        double max = Double.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static double Min(double[] arr){
        double min = Double.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void Bai1(double[] arr){
        System.out.println("Khoảng giá trị chứa tất cả phần tử trong mảng là: [" + Min(arr) + "," + Max(arr) + "]");
    }
    public static void Bai2(double[]arr){
        boolean exist = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 2018){
                System.out.println("Số đầu tiên lớn hơn giá trị 2018 là: " + arr[i] + " tại vị trí: " + i);
                exist = true;
            }
        }
        if(!exist) System.out.println("Không có giá trị nào lớn hơn 2018 => -1");
    }
    public static void Bai3(double[] arr){
        int index = -1;
        double value = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > -1 && arr[i] < 0){
                index = i;
                value = arr[i];
            }
        }
        if(index != -1) System.out.println("Giá trị âm cuối cùng lớn hơn giá trị -1: " + value + " tại vị trí: " + index);
        else
        System.out.println("Không tồn tại số thỏa => -1");
    }
    public static void Bai4(double[] arr){
        System.out.print("Các giá trị âm: ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr = input(scanner);
        while(true) {
            System.out.println("-------MENU-------");
            System.out.println("0. Thoát");
            System.out.println("1. Tìm đoạn giá trị chứa tất cả phần tử trong mảng.");
            System.out.println("2. Tìm giá trị đầu tiên lớn hơn giá trị 2018. Nếu không có trả về -1.");
            System.out.println("3. Tìm giá trị âm cuối cùng lớn hơn giá trị -1. Nếu không có trả về -1. ");
            System.out.println("4. Xuất ra các giá trị âm.");
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
                    Bai1(arr);
                    break;
                }
                case 2:{
                    Bai2(arr);
                    break;
                }
                case 3:{
                    Bai3(arr);
                    break;
                }
                case 4:{
                    Bai4(arr);
                    break;
                }
                default:
                    System.out.println("Không tồn tại lựa chọn này. Nhập lựa chọn khác");
            }
            System.out.println();
        }
    }
}
