import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stack {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int commandNumber = Integer.parseInt(bufferedReader.readLine());
        int[] stack = new int[100000];
        int size = 0;

        while (commandNumber != 0) {
            String input = bufferedReader.readLine();
            switch (input) {
                case "top":
                    if (size != 0)
                        System.out.println(stack[size - 1]);
                    else
                        System.out.println(-1);
                    break;
                case "size":
                    System.out.println(size);
                    break;
                case "empty":
                    System.out.println(size == 0 ? 1 : 0);
                    break;
                case "pop":
                    if (size != 0) {
                        System.out.println(stack[size - 1]);
                        stack[size - 1] = 0;
                        size--;
                    } else
                        System.out.println(-1);

                    break;
                default:
                    String[] parse = input.split(" ");
                    stack[size] = Integer.parseInt(parse[1]);
                    size++;
            }
            commandNumber--;
        }
    }
}
