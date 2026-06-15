import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println("Hexadecimal number: " + Integer.toHexString(num).toUpperCase());
    }
}
