// 커서를 기준으로 문자가 삽입/삭제/이동 되므로 2개의 Stack 또는 LinkedList로 구현할 수 있음.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackEx04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        String input = bufferedReader.readLine();
        for (int i = 0; i < input.length(); i++) {
            leftStack.push(input.charAt(i));
        }

        int M = Integer.parseInt(bufferedReader.readLine());
        while (M-- > 0) {
            String command = bufferedReader.readLine();
            switch (command) {
                case "L":
                    if (leftStack.isEmpty())
                        break;
                    else
                        rightStack.push(leftStack.pop());
                    break;
                case "D":
                    if (rightStack.isEmpty())
                        break;
                    else
                        leftStack.push(rightStack.pop());
                    break;
                case "B":
                    if (leftStack.isEmpty())
                        break;
                    else
                        leftStack.pop();
                    break;
                default:
                    String[] parse = command.split(" ");
                    leftStack.push(parse[1].charAt(0));
            }
        }
        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }
        StringBuilder stringBuilder = new StringBuilder();

        while (!rightStack.isEmpty()) {
            stringBuilder.append(rightStack.pop());
        }
        System.out.println(stringBuilder);
        bufferedReader.close();
    }
}
