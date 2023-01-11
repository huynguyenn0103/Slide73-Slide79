import java.util.Scanner;

public class BinarySearch {

    public static int[] Sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] input(int size){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Nhập số thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println();
        return arr;
    }
    public static void output(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int binarySearch(int[] arr,int l, int r, int x){
        if(r >= l){
            int mid = (r+l)/2;
            if(arr[mid] == x) return mid;
            if(arr[mid] > x) return binarySearch(arr,l,mid-1,x);
            if(arr[mid] < x) return binarySearch(arr,mid+1,r,x);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Số phần tử của mảng (nhập 0 để thoát): ");
            int size = scanner.nextInt();
            if(size == 0)break;
            int[] arr = input(size);
            System.out.print("Nhập phần tử x cần tìm: ");
            int x = scanner.nextInt();
            arr =  Sort(arr);
            int check = binarySearch(arr,0,size-1,x);
            System.out.print("Mảng sau khi sắp xếp: ");
            output(arr);
            if(check == -1) System.out.println("Không tồn tại giá trị x trong mảng");
            else{
                System.out.println("Tồn tại x tại vị trí " + check);
            }
            System.out.println();
        }

    }
}
