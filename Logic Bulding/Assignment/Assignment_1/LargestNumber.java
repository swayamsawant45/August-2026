import java.util.Scanner;

public class LargestNumber {
    public static void main(String args[]) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        a = scanner.nextInt();

        System.out.println("b: ");
        b = scanner.nextInt();

        System.out.println("c: ");
        c = scanner.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("a is largest");
            } else {
                System.out.println("c is largest");
            }
        } else {
            if (b > c) {
                System.out.println("b is largest");
            } else {
                System.out.println("c is largest");
            }
        }
    }
}