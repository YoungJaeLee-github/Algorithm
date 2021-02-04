import java.io.*;
import java.util.Stack;

public class StackEx03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(bufferedReader.readLine());
        int temp = 0;
        StringBuilder result = new StringBuilder();

        while (n != 0) {
            int number = Integer.parseInt(bufferedReader.readLine());
            if (temp < number) {
                while (temp < number) {
                    stack.push(++temp);
                    result.append("+\n");
                }
                stack.pop();
                result.append("-\n");
            } else {
                boolean found = false;
                if (!stack.isEmpty()) {
                    result.append("-\n");
                    if (stack.pop() == number) {
                        found = true;
                    }
                }
                if (!found) {
                    System.out.print("NO");
                    return;
                }
            }
            n--;
        }
        System.out.print(result);
        bufferedReader.close();
    }
}
