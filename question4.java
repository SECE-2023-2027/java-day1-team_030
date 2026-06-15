import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String binary1 = sc.next();
        String binary2 = sc.next();

        int n1 = Integer.parseInt(binary1, 2);
        int n2 = Integer.parseInt(binary2, 2);

        int sum = n1 + n2;

        System.out.println(Integer.toBinaryString(sum));
    }
}