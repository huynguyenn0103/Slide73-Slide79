import java.util.Scanner;

import static java.lang.Math.abs;

public class Slide48 {
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
    public static void MaxDistance(int[] arr, int x){
        int value = 0;
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i=0; i < arr.length; i++){
            if(Math.abs(arr[i] - x) > max){
                max = Math.abs(arr[i] -x);
                index = i;
                value = arr[i];
            }
        }
        System.out.println("Giá trị xa giá trị x nhất: " + value + " tại vị trí: " + index);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = input(scanner);
        display(arr);
        System.out.print("Nhập giá trị x: ");
        int x = scanner.nextInt();
        MaxDistance(arr,x);

    }
}
