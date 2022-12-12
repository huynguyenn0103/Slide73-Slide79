import java.util.Scanner;

public class Slide79 {
    public static long calculate(long total) {
        if (total <= 60000000) total = total * 5 / 100;
        else if (total <= 120000000) total = total * 10 / 100;
        else if (total <= 210000000) total = total * 15 / 100;
        else if (total <= 384000000) total = total * 20 / 100;
        else if (total <= 624000000) total = total * 25 / 100;
        else if (total <= 960000000) total = total * 30 / 100;
        else total = total * 35 / 100;
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tổng thu nhập: ");
        long income = scanner.nextLong();
        System.out.print("Nhập số người phụ thuộc: ");
        long independent = scanner.nextLong();
        long total = income - 4000000 - independent * 1600000;
        if (total < 0) System.out.println("Thu nhập chịu thuế < 0");
        else {
            long result = calculate(total);
            System.out.println();
            System.out.println("Họ và tên: " + name);
            System.out.println("Thuế thu nhập cá nhân: " + result);
        }
    }
}
