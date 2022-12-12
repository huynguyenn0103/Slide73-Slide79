import java.util.Scanner;

public class Slide73 {
    public static double CalculateMoney(int firstKm, int nextKm, int lastKm, int costWait, double km, int timeWaiting) {
        double sum = 0;
        sum += timeWaiting / 3 * costWait;
        if (km <= 1) sum += km * firstKm;
        else if (km <= 19) sum += firstKm + (km - 1) * nextKm;
        else sum += firstKm + 19 * nextKm + (km - 20) * lastKm;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập loại xe: ");
        String type = scanner.nextLine();
        System.out.println();
        System.out.print("Nhập số KM đi đươc: ");
        double km = scanner.nextDouble();
        System.out.println();
        System.out.print("Thời gian chờ: ");
        int timeWaiting = scanner.nextInt();
        System.out.println();
        double totalMoney = 0;
        if (km < 0) System.out.println("Nhập lại số km >= 0");
        else if (timeWaiting < 0) System.out.println("Nhập lại thời gian chờ >= 0");
        else {
            switch (type) {
                case "GRAB CAR": {
                    totalMoney = CalculateMoney(8000, 7500, 7000, 2000, km, timeWaiting);
                    break;
                }
                case "GRAB SUV": {
                    totalMoney = CalculateMoney(9000, 8500, 8000, 3000, km, timeWaiting);
                    break;
                }
                case "GRAB BLACK": {
                    totalMoney = CalculateMoney(10000, 9500, 9000, 3500, km, timeWaiting);
                    break;
                }
                default:
                    System.out.println("Không tồn tại loại xe này, vui lòng nhập lại...");
            }
            System.out.println("Tổng số tiền phải trả là: " + totalMoney);
        }
    }
}
