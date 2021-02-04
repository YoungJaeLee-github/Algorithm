import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx02 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split(" ");
        int N, K;
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);
        StringBuilder answer = new StringBuilder();
        answer.append("<");

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                queue.add(queue.remove());
            }
            answer.append(queue.remove()).append(", ");
        }
        answer.append(queue.remove()).append(">");
        System.out.print(answer);
        bufferedReader.close();
    }
}
