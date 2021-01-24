import java.io.*;
import java.util.ArrayList;

public class StackEx {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bufferedReader.readLine());
        while (testCase != 0) {
            String input = bufferedReader.readLine();
            input += '\n';
            MyStack myStack = new MyStack();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ' || input.charAt(i) == '\n') {
                    while (!myStack.isEmpty()) {
                        result.append(myStack.pop());
                    }
                    result.append(input.charAt(i));
                } else {
                    myStack.push(input.charAt(i));
                }
            }
            System.out.print(result);
            testCase--;
        }
        bufferedReader.close();
    }
}

class MyStack {
    private final ArrayList<Object> stack;
    private int size;

    public MyStack() {
        stack = new ArrayList<>();
        size = 0;
    }

    public void push(Object n) {
        stack.add(n);
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Object pop() {
        if (!isEmpty()) {
            Object result = stack.get(size - 1);
            stack.remove(size - 1);
            size--;
            return result;
        } else
            return "Empty";
    }

    public Object top() {
        if (!isEmpty()) {
            return stack.get(size - 1);
        } else {
            return "Empty";
        }
    }

    public int size() {
        return size;
    }
}
