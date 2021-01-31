import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QueueEx {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
        Queue queue = new Queue();
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());
        while (N-- > 0) {
            String command = bufferedReader.readLine();
            switch (command) {
                case "front" :
                    stringBuilder.append(queue.front()).append("\n");
                    break;
                case "back" :
                    stringBuilder.append(queue.back()).append("\n");
                    break;
                case "pop" :
                    stringBuilder.append(queue.pop()).append("\n");
                    break;
                case "empty" :
                    stringBuilder.append(queue.empty()).append("\n");
                    break;
                case "size" :
                    stringBuilder.append(queue.size()).append("\n");
                    break;
                default:
                    String[] parse = command.split(" ");
                    queue.push(Integer.parseInt(parse[1]));
            }
        }
        System.out.print(stringBuilder);
        bufferedReader.close();
    }
}