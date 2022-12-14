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
    public static void Bai7(){
        int count = 0;
        for(int i = 0; i <= 1000; i++){
            if(i % 3 == 0) count++;
        }
        System.out.println("Co tat ca " + count + " so chia het cho 3 tu 0 den 1000");
    }
    public static void Bai8(){
        Scanner scanner = new Scanner(System.in);
        String[] arrMachine = {"keo", "bua", "bao"};
        int scoreMachine = 0;
        int scoreHuman = 0;
        while(true){
            int random = (int) (Math.random() + 1);
            System.out.print("Nhap lua chon cua ban la: ");
            String choice = scanner.next();
            System.out.println("Lua chon cua ban la: " + choice);
            System.out.println("Lua chon cua may la: " + arrMachine[random]);
            if(solveWinner(choice, arrMachine[random]) == -1) {
                System.out.println("Ket qua: May thang");
                System.out.println("Ti so giua nguoi va may: " + scoreHuman + " " + (++scoreMachine));
            }
            else if(solveWinner(choice, arrMachine[random]) == 0){
                System.out.println("Ket qua: Hoa");
                System.out.println("Ti so giua nguoi va may: " + scoreHuman + " " + scoreMachine);
            }
            else {
                System.out.println("Ket qua: Nguoi thang");
                System.out.println("Ti so giua nguoi va may: " + (++scoreHuman) + " " + scoreMachine);
            }
            System.out.print("Nhan mot so khac 0 de choi tiep: ");
            int selection = scanner.nextInt();
            if(selection == 0) {
                if(scoreMachine > scoreHuman) System.out.println("May thang nhieu hon");
                else if(scoreMachine < scoreHuman) System.out.println("Nguoi thang nhieu hon");
                else System.out.println("Hoa");
                return;
            }
            System.out.println();
        }

    }
    public static void Bai9(){
        int sum = 0;
        int count = 1;
        while(sum <= 10000){
            sum += count;
            count++;
        }
        System.out.println("So n la: " + count);
    }
    public static void Bai10(){
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
    public static void Bai11(){
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
    public static void Bai12(){
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
    public static void Bai13(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        int n = scanner.nextInt();
        int [] arr = new int [n];
        // Ham nhap
        for(int i = 0; i<  n; i++){
            System.out.print("Nhap 1 phan tu: ");
            arr[i] = scanner.nextInt();
        }
        System.out.println();
        //Ham xuat
        System.out.print("Cac phan tu cua mang la:  ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Tim so lon nhat va vi tri cua no trong mang
        int max = -1000000;
        int index = 0;
        for(int i = 0;i < n; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("So lon nhat la : " + max + " tai vi tri " + index);

        // Tim so am dau tien va vi tri cua no trong mang
        int soam = 1;
        int indexsoam = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                soam = arr[i];
                indexsoam = i;
                break;
            }
        }
        if(soam == 1) System.out.println("Khong co so am trong day");
        else System.out.println("So am dau tien la: " + soam + " tai vi tri " + indexsoam);

        // Tim so am lon nhat va vi tri cua no trong mang
        int soamlonnhat = -10000000;
        int indexsoamlonnhat = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] < 0 && arr[i] > soamlonnhat){
                soamlonnhat = arr[i];
                indexsoamlonnhat = i;
            }
        }
        if(soamlonnhat == -10000000) System.out.println("Khong co so am trong day");
        else System.out.println("So am lon nhat la: " + soamlonnhat + " tai vi tri " + indexsoamlonnhat);

        // Tinh tong cac so chan
        int sumEven =0;
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0) sumEven = sumEven + arr[i];
        }
        System.out.println("Tong cac so chan trong mang: " + sumEven);

        // Dem co bao nhieu so am
        int countNegative = 0;
        for(int i =0; i < n; i++){
            if(arr[i] < 0) countNegative++;
        }
        System.out.println("So so am trong mang: " + countNegative);

        //Tinh tong cac so am
        int sumNe = 0;
        for(int i = 0; i< n; i++){
            if(arr[i] < 0) sumNe += arr[i];
        }
        System.out.println("Tong cac so am trong mang: " + sumNe);

        // Tim x co trong mang hay khong
        System.out.print("Nhap so nguyen x can tim: ");
        int x = scanner.nextInt();
        boolean find = false;
        for(int i =0; i <n; i++){
            if(arr[i] == x){
                find = true;
                System.out.println("=> Tim thay gia tri x trong mang");
                break;
            }
        }
        if(!find) System.out.println("=>Khong tim thay gia tri x trong mang");
    }
    public static int solveWinner(String human, String machine) {
        if ((human.compareTo("bua") == 0  && machine.compareTo("keo") == 0 ) || (human.compareTo("keo") == 0 && machine.compareTo("bao")==0) || (human.compareTo("bao")== 0 && machine.compareTo("bua")==0)) {
            return 1; // human thang
        }
        else if ((machine.compareTo("bua") == 0  && human.compareTo("keo") == 0 ) || (machine.compareTo("keo") == 0 && human.compareTo("bao")==0) || (machine.compareTo("bao")== 0 && human.compareTo("bua")==0)) {
            return -1; // human thua
        }
        else return 0; // hoa
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
            case 7: {
                Bai7();
                break;
            }
            case 8: {
                Bai8();
                break;
            }
            case 9: {
                Bai9();
                break;
            }
            case 10:{
                Bai10();
                break;
            }
            case 11:{
                Bai11();
                break;
            }
            case 12: {
                Bai12();
                break;
            }
            case 13:{
                Bai13();
                break;
            }
            default:
                System.out.println("Nhap bai khac, khong ton tai bai da nhap");
        }
    }

}
