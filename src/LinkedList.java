public class LinkedList {
    private class Node {
        private Object data;
        private Node next;

        private Node(Object data) {
            this.data = data;
            this.next = null;
        }

        public String toString() {
            return String.valueOf(this.data);
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    public LinkedList() {
    }

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
        if (newNode.next == null)
            tail = head;
    }

    public void addLast(Object data) {
        if (size == 0)
            addFirst(data);
        else {
            Node newNode = new Node(data);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public Node node(int index) {
        Node node = head;
        if (node == null)
            throw new NullPointerException();
        else {
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        }
    }

    public void add(int index, Object data) {
        if (index > size)
            throw new NullPointerException();
        if (index == 0)
            addFirst(data);
        else {
            Node newNode = new Node(data);
            Node previousNode = node(index - 1);
            Node nextNode = previousNode.next;
            previousNode.next = newNode;
            newNode.next = nextNode;
            size++;
            if (newNode.next == null)
                tail = newNode;
        }
    }

    public Object removeFirst() {
        Node node = head;
        if (node == null)
            throw new NullPointerException();
        else {
            head = node.next;
            Object returnData = node.data;
            node = null;
            size--;
            return returnData;
        }
    }

    public Object remove(int index) {
        if (index == 0)
            return removeFirst();
        Node previousNode = node(index - 1);
        Node deletedNode = previousNode.next;
        previousNode.next = previousNode.next.next;
        Object returnData = deletedNode.data;
        if (deletedNode == tail)
            tail = previousNode;
        deletedNode = null;
        size--;
        return returnData;
    }

    public Object removeLast() {
        return remove(size - 1);
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        return node(index).data;
    }

    public int indexOf(Object data) {
        Node node = head;
        int index;
        for (index = 0; index < size; index++) {
            if (node.data == data) {
                return index;
            } else {
                node = node.next;
            }
        }
        if (index == size)
            return -1;
        return index;
    }

    public String toString() {
        Node node = head;
        if (node == null)
            return "[]";

        String result = "[";
        while (node.next != null) {
            result += node.data + ", ";
            node = node.next;
        }
        result += node.data + "]";
        return result;
    }
}
