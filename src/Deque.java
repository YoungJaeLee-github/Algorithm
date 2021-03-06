
public class Deque {
    LinkedList deque;
    public Deque() {
        deque = new LinkedList();
    }

    public void push_back(int data) {
        deque.addLast(data);
    }

    public void push_front(int data) {
        deque.addFirst(data);
    }

    public int pop_front() {
            return empty() != 1 ? (int)deque.removeFirst() : -1;
    }

    public int pop_back() {
        return empty() != 1 ? (int)deque.removeLast() : -1;
    }

    public int empty() {
        return size() == 0 ? 1 : 0;
    }

    public int front() {
        return empty() == 1 ? -1 : (int)deque.get(0);
    }

    public int back() {
        return empty() == 1 ? -1 : (int)deque.get(size() - 1);
    }

    public int size() {
        return deque.size();
    }
}