import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int A, B;
            A = scanner.nextInt();
            B = scanner.nextInt();
            System.out.println(A + B);
        }
    }
}
