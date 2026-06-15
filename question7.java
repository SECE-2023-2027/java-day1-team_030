import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimal = sc.nextInt();

        String octal = Integer.toOctalString(decimal);

        System.out.println("Octal number: " + octal);

        sc.close();
    }
}