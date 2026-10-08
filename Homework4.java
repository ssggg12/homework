import java.util.Scanner;

public class Homework4 {

    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }

        int minVal = Math.min(m, n);
        int remainder = Math.max(m, n) % minVal;

        return gcd(minVal, remainder);
    }

    public static int gcdLoop(int m, int n) {
        int a = Math.max(m, n);
        int b = Math.min(m, n);

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 수를 입력하세요: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int result = gcd(num1, num2);

        System.out.println("두 수의 최대공약수는 " + result + "입니다.");

        scanner.close();
    }
}
