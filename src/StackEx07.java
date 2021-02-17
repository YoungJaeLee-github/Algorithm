import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//오큰수
public class StackEx07 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        int n = Integer.parseInt(bufferedReader.readLine());
        String[] numbers = bufferedReader.readLine().split(" ");
        int[] answer = new int[numbers.length];

        stack.push(0);
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && Integer.parseInt(numbers[stack.peek()]) < Integer.parseInt(numbers[i])) {
                answer[stack.peek()] = Integer.parseInt(numbers[i]);
                stack.pop();
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            answer[stack.peek()] = -1;
            stack.pop();
        }

        for (int i = 0; i < answer.length - 1; i++) {
            stringBuilder.append(answer[i]).append(" ");
        }
        stringBuilder.append(answer[answer.length - 1]);
        System.out.println(stringBuilder);
    }
}