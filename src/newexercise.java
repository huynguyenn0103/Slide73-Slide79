import java.util.Scanner;

public class newexercise {
    public static void solveEquation(double a, double b){
        if(a == 0){
            if(b == 0) System.out.println("Phương trình có vô số nghiệm");
            else System.out.println("Phương trình vô nghiệm");
        }
        else System.out.println("Nghiệm của phương trình là: " + (-b/a));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Nhập a = -1 và b = -1 để dừng");
            System.out.print("Nhập số a: ");
            double a = scanner.nextDouble();
            System.out.print("Nhập số b: ");
            double b = scanner.nextDouble();
            if(a == -1 && b == -1) break;
            solveEquation(a, b);
            System.out.println();
        }
    }
}
