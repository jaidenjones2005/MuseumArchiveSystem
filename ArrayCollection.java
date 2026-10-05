public class ArrayCollection<T> implements CollectionInterface<T> {

    protected T[] elements;
    protected int numElements;
    protected static final int DEFAULT_CAPACITY = 100;

    @SuppressWarnings("unchecked")
    public ArrayCollection() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
        numElements = 0;
    }

    // Finds the index of the target element
    private int find(T target) {
        for (int i = 0; i < numElements; i++) {
            if (elements[i].equals(target)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public boolean add(T element) {
        if (isFull()) {
            return false;
        }

        elements[numElements] = element;
        numElements++;
        return true;
    }

    @Override
    public T get(T target) {
        int location = find(target);

        if (location == -1) {
            return null;
        }

        return elements[location];
    }

    @Override
    public boolean contains(T target) {
        return find(target) != -1;
    }

    @Override
    public boolean remove(T target) {
        int location = find(target);

        if (location == -1) {
            return false;
        }

        // Swap the target with the last element
        elements[location] = elements[numElements - 1];

        // Clear the old last position
        elements[numElements - 1] = null;

        numElements--;
        return true;
    }

    @Override
    public boolean isFull() {
        return numElements == elements.length;
    }

    @Override
    public boolean isEmpty() {
        return numElements == 0;
    }

    @Override
    public int size() {
        return numElements;
    }
}