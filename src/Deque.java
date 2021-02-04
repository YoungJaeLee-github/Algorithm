import java.util.LinkedList;

public class Deque {
    private final LinkedList<Integer> deque;

    public Deque() {
        deque = new LinkedList<>();
    }

    public void push_back(int data) {
        deque.addLast(data);
    }

    public void push_front(int data) {
        deque.addFirst(data);
    }

    public int pop_front() {
            return empty() != 1 ? deque.removeFirst() : -1;
    }

    public int pop_back() {
        return empty() != 1 ? deque.removeLast() : -1;
    }

    public int empty() {
        return size() == 0 ? 1 : 0;
    }

    public int front() {
        return empty() == 1 ? -1 : deque.getFirst();
    }

    public int back() {
        return empty() == 1 ? -1 : deque.getLast();
    }

    public int size() {
        return deque.size();
    }
}