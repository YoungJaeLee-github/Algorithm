import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackEx05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        String S = bufferedReader.readLine();
        Stack<Character> stack = new Stack<>();
        boolean tag = false;
        S += '\n';
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '<') {
                tag = true;
                while (!stack.isEmpty()) {
                    stringBuilder.append(stack.pop());
                }
                stringBuilder.append(S.charAt(i));
            } else if (S.charAt(i) == '>') {
                tag = false;
                stringBuilder.append(S.charAt(i));
            } else if (tag) {
                stringBuilder.append(S.charAt(i));
            } else {
                if (S.charAt(i) == ' ' || S.charAt(i) == '\n') {
                    while (!stack.isEmpty()) {
                        stringBuilder.append(stack.pop());
                    }
                    stringBuilder.append(S.charAt(i));
                } else {
                    stack.push(S.charAt(i));
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
