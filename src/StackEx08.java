import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//오등큰수
public class StackEx08 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        String[] parse = bufferedReader.readLine().split(" ");
        int max = Integer.parseInt(parse[0]);
        for (int i = 1; i < N; i++) {
            max = Integer.parseInt(parse[i]) > max ? Integer.parseInt(parse[i]) : max;
        }
        Stack<Integer> stack = new Stack<>();
        int[] frequency = new int[max];
        int[] answer = new int[N];

        for (int i = 0; i < N; i++) {
            frequency[Integer.parseInt(parse[i]) - 1]++;
        }

        stack.push(0);
        for (int i = 1; i < N; i++) {
            while (!stack.isEmpty() && frequency[Integer.parseInt(parse[stack.peek()]) - 1] < frequency[Integer.parseInt(parse[i]) - 1]) {
                answer[stack.pop()] = Integer.parseInt(parse[i]);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        for (int i = 0; i < N; i++) {
            if (i < N - 1) {
                stringBuilder.append(answer[i]).append(" ");
            }
        }
        stringBuilder.append(answer[parse.length - 1]);
        System.out.println(stringBuilder);
        bufferedReader.close();
    }
}