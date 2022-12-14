import java.util.Scanner;

public class Slide19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random()*999 + 1);
        while(true){
            System.out.print("Nhập lựa chọn của bạn từ 1 đến 1000:  ");
            int result = scanner.nextInt();
            if(result < random) System.out.println("Số của bạn nhỏ hơn số bí mật.");
            else if(result > random) System.out.println("Số của bạn lớn hơn số bí mật.");
            else{
                System.out.println("Số bí mật là: " +random +". Game ket thuc!!!");
                break;
            }
            System.out.println();
        }
    }
}
