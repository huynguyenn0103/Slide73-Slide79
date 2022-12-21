import java.util.Scanner;

public class Slide33 {
    public static int solveWinner(String human, String machine) {
        if ((human.compareTo("bua") == 0  && machine.compareTo("keo") == 0 ) || (human.compareTo("keo") == 0 && machine.compareTo("bao")==0) || (human.compareTo("bao")== 0 && machine.compareTo("bua")==0)) {
            return 1; // human thang
        }
        else if ((machine.compareTo("bua") == 0  && human.compareTo("keo") == 0 ) || (machine.compareTo("keo") == 0 && human.compareTo("bao")==0) || (machine.compareTo("bao")== 0 && human.compareTo("bua")==0)) {
            return -1; // human thua
        }
        else return 0; // hoa
    }
    public static void Bai1(){
        Scanner scanner = new Scanner(System.in);
        String[] arrMachine = {"keo", "bua", "bao"};
        int scoreMachine = 0;
        int scoreHuman = 0;
        while(true){
            int random = (int) (Math.random()*2);
            System.out.print("Nhập lựa chọn của bạn là(keo-bua-bao): ");
            String choice = scanner.next();
            System.out.println("Lựa chọn của bạn là: " + choice);
            System.out.println("Lựa chọn của máy là: " + arrMachine[random]);
            if(solveWinner(choice, arrMachine[random]) == -1) {
                System.out.println("Kết quả: Máy thắng");
                System.out.println("Tỉ số giữa người và máy: " + scoreHuman + " " + (++scoreMachine));
            }
            else if(solveWinner(choice, arrMachine[random]) == 0){
                System.out.println("Kết quả: Hòa");
                System.out.println("Tỉ số giữa người và máy: " + scoreHuman + " " + scoreMachine);
            }
            else {
                System.out.println("Kết quả: Người thắng");
                System.out.println("Tỉ số giữa người và máy: " + (++scoreHuman) + " " + scoreMachine);
            }
            System.out.print("Nhập một số khác 0 để chơi tiếp ");
            int selection = scanner.nextInt();
            if(selection == 0) {
                if(scoreMachine > scoreHuman) System.out.println("Máy thắng nhiều hơn");
                else if(scoreMachine < scoreHuman) System.out.println("Người thắng nhiều hơn");
                else System.out.println("Hòa");
                return;
            }
            System.out.println();
        }

    }
    public static void Bai2(){
        int sum = 0;
        int count = 1;
        while(sum <= 10000){
            sum += count;
            count++;
        }
        System.out.println("So n la: " + count);
    }
    public static void Bai3(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        int n = scanner.nextInt();
        while(n <= 0){
            System.out.print("Nhap lai gia tri n > 0: ");
            n = scanner.nextInt();
        }
        int sum = 0;
        for(int i = 1; i < n; i++){
            if(i % 2 != 0) sum = sum + i;
        }
        System.out.println("Tong cac so le nguyen duong nho hon n: " + sum);
    }
    public static void Bai4(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri n: ");
        double n = scanner.nextDouble();
        System.out.print("Nhap gia tri x: ");
        double x = scanner.nextDouble();
        double sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + Math.pow(x,i);
        }
        System.out.println("Tong can tim la: " + sum);
    }
    public static void Bai5(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tien anh X gui: ");
        long sotien = scanner.nextLong();
        System.out.print("Nhap so tien anh X muon co trong tuong lai: ");
        long sotientuonglai = scanner.nextLong();
        System.out.print("Nhap lai suat %: ");
        double laisuat = scanner.nextDouble();
        int soNam = 0;
        while(sotien * Math.pow(1 + laisuat / 100,soNam)< sotientuonglai){
            soNam++;
        }
        System.out.println("So nam it nhat can gui: " + soNam);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bài muốn thực hiện: ");
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

            default:
                System.out.println("Nhập bài khác, không tồn tại bài đã nhập.");
        }
    }
}
