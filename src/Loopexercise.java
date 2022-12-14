import java.util.Scanner;

public class Loopexercise {
    public static void Bai1() {
        int count = 1;
        while (count < 5) {
            System.out.println("Hello world");
            count++;
        }
    }

    public static void Bai2() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        while (true) {
            System.out.print("Nhap so nguyen > 0: ");
            double num = scanner.nextDouble();
            if (num <= 0) break;
            sum += num;
        }
        System.out.println("Tong cac so vua nhap la: " + sum);
    }

    public static void Bai3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------MENU-----------");
        System.out.println("1. Tinh tong");
        System.out.println("2. Tinh hieu");
        System.out.println("3. Tinh nhan");
        System.out.println("4. Tinh chia");
        System.out.println("0. Thoat");
        System.out.println("Tat ca nhung truong hop con lai la khong hop le.");
        while (true) {
            System.out.print("Nhap hai so a va b: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.print("Nhap lua chon cua ban: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0: return;
                case 1: {
                    System.out.println("Tinh tong a va b: " + (a + b));
                    break;
                }
                case 2: {
                    System.out.println("Tinh hieu a va b: " + (a - b));
                    break;
                }
                case 3: {
                    System.out.println("Tinh tich a va b: " + (a* b));
                    break;
                }
                case 4: {
                    System.out.println("Tinh chia a va b: " + (a/b));
                    break;
                }
                default:
                    System.out.println("Lua chon cua ban la khong hop le");
            }
            System.out.println();
        }
    }
    public static void Bai4(){
        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random()*999 + 1);
        while(true){
            System.out.print("Nhap lua chon cua ban tu 1 den 1000: ");
            int result = scanner.nextInt();
            if(result < random) System.out.println("So cua ban nho hon so can tim.");
            else if(result > random) System.out.println("So cua ban lon hon so can tim.");
            else{
                System.out.println("So cua ban bang so can tim: " +random +". Game ket thuc!!!");
                break;
            }
            System.out.println();
        }
    }
    public static void Bai5(){
        System.out.print("Cac so chan nho hon 100 la: ");
        for(int i = 0; i < 100; i ++){
            if(i % 2== 0) System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Cac so le nho hon 100 la: ");
        int count = 0;
        while(count <= 100){
            if(count % 2 != 0){
                System.out.print(count + " ");
            }
            count++;
        }
    }
    public static void Bai6(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n = scanner.nextInt();
        int sum= 0;
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0) sum = sum + i;
        }
        System.out.println("Tong cac so chan nho hon n la: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bai muon thuc hien: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                Bai1();
                break;
            }
            case 2: {
                Bai2();
                break;
            }
            case 3: {
                Bai3();
                break;
            }
            case 4: {
                Bai4();
                break;
            }
            case 5:{
                Bai5();
                break;
            }
            case 6:{
                Bai6();
                break;
            }
            default:
                System.out.println("Nhap bai khac, khong ton tai bai da nhap");
        }
    }

}
