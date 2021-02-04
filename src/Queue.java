import java.util.ArrayList;

public class Queue {
    private final ArrayList<Integer> queue;

    public Queue() {
        queue = new ArrayList<>();
    }

    public void push(int data) {
        queue.add(data);
    }

    public int pop() {
        return empty() == 0 ? queue.remove(0) : -1;
    }

    public int empty() {
        return queue.size() == 0 ? 1 : 0;
    }

    public int size() {
        return queue.size();
    }

    public int front() {
        return empty() == 1 ? -1 : queue.get(0);
    }

    public int back() {
        return empty() == 1 ? -1 : queue.get(queue.size() - 1);
    }
}