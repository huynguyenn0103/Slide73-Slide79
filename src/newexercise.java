import java.util.Scanner;

public class newexercise {
    public static void solveEquation(double a, double b){
        if(a == 0){
            if(b == 0) System.out.println("Phương trình có vô số nghiệm");
            else System.out.println("Phương trình vô nghiệm");
        }
        else System.out.println("Nghiệm của phương trình là: " + (-b/a));
    }
    public static void solveEquation2(double a, double b, double c){
        if( a == 0) solveEquation(b,c);
        else{
            double delta = b * b - 4 * a * c;
            if(delta >= 0) {
                double x1 = (-b + Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta))/(2*a);
                if(x1 == x2) System.out.println("Phương trình có nghiệm kép: " + x1);
                else System.out.println("Phương trình có 2 nghiệm: " + x1 + " và " + x2);
            }
            else System.out.println("Phương trình vô nghiệm");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Nhập a = -1 và b = -1 và c == -1 để dừng");
            System.out.print("Nhập số a: ");
            double a = scanner.nextDouble();
            System.out.print("Nhập số b: ");
            double b = scanner.nextDouble();
            System.out.print("Nhập số c: ");
            double c = scanner.nextDouble();
            if(a == -1 && b == -1 && c ==  -1) break;
            System.out.print("Lựa chọn của bạn 1(Phương trình bậc nhất) và 2(Phương trình bậc 2): ");
            int choice = scanner.nextInt();
            if(choice == 1)
            solveEquation(a, b);
            else if(choice == 2)
                solveEquation2(a,b,c);
            System.out.println();
        }
    }
}
