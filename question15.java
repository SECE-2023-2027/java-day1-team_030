import java.util.Scanner;

public class question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean res = (a % 10 == b % 10) ||
                         (a % 10 == c % 10) ||
                         (b % 10 == c % 10);

        System.out.println("The result is: " + res);
    }
}