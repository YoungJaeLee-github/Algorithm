import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DequeEx {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Deque deque = new Deque();
        StringBuilder answer = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        while (N-- > 0) {
            String[] command = bufferedReader.readLine().split(" ");
            switch (command[0]) {
                case "push_back" :
                    deque.push_back(Integer.parseInt(command[1]));
                    break;
                case "push_front" :
                    deque.push_front(Integer.parseInt(command[1]));
                    break;
                case "front" :
                    answer.append(deque.front()).append("\n");
                    break;
                case "back" :
                    answer.append(deque.back()).append("\n");
                    break;
                case "pop_front" :
                    answer.append(deque.pop_front()).append("\n");
                    break;
                case "pop_back" :
                    answer.append(deque.pop_back()).append("\n");
                    break;
                case "empty" :
                    answer.append(deque.empty()).append("\n");
                    break;
                case "size" :
                    answer.append(deque.size()).append("\n");
                break;
                default:
            }
        }
        System.out.print(answer);
        bufferedReader.close();
    }
}
