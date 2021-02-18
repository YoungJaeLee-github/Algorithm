public class ArrayList {
    private int size = 0;
    private Object[] elements = new Object[10];

    public void addFirst(Object element) {
        add(0, element);
    }

    public void add(int index, Object element) {
        if (size == elements.length) {
            allocate();
        }

        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public void addLast(Object element) {
        add(size, element);
    }

    public Object remove(int index) {
        Object removed = elements[index];
        for (int i = index + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        elements[size - 1] = null;
        size--;
        return removed;
    }

    public Object removeFirst() {
        return remove(0);
    }

    public Object removeLast() {
        return remove(size - 1);
    }

    public Object get(int index) {
        return elements[index];
    }

    public int size() {
        return size;
    }

    public int indexOf(Object element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++) {
            str += elements[i];
            if (i < size - 1) {
                str += ", ";
            }
        }
        return str += "]";
    }

    private void allocate() {
        int capacity = elements.length << 1;
        Object[] newArray = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
    }

    public ListIterator listIterator() {
        return new ListIterator();
    }

    class ListIterator {
        private int nextIndex = 0;
        public boolean hasNext() {
            return nextIndex < size();
        }
        public Object next() {
            return elements[nextIndex++];
        }
        public boolean hasPrevious() {
            return nextIndex > 0;
        }
        public Object previous() {
            return elements[--nextIndex];
        }
        public void add(Object element) {
            ArrayList.this.add(nextIndex++, element);
        }
        public void remove() {
            ArrayList.this.remove(nextIndex - 1);
            nextIndex--;
        }
    }
}
