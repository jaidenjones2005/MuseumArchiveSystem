public class LinkedCollection<T> implements CollectionInterface<T> {

    private LLNode<T> head;
    private int numElements;

    public LinkedCollection() {
        head = null;
        numElements = 0;
    }

    // Finds and returns the node containing the target
    private LLNode<T> find(T target) {
        LLNode<T> location = head;

        while (location != null) {
            if (location.getInfo().equals(target)) {
                return location;
            }

            location = location.getLink();
        }

        return null;
    }

    @Override
    public boolean add(T element) {
        LLNode<T> newNode = new LLNode<>(element);

        // Insert new node at the head for O(1) insertion
        newNode.setLink(head);
        head = newNode;

        numElements++;
        return true;
    }

    @Override
    public T get(T target) {
        LLNode<T> location = find(target);

        if (location == null) {
            return null;
        }

        return location.getInfo();
    }

    @Override
    public boolean contains(T target) {
        return find(target) != null;
    }

    @Override
    public boolean remove(T target) {
        LLNode<T> location = head;
        LLNode<T> previous = null;

        while (location != null) {

            if (location.getInfo().equals(target)) {

                // Target is the first node
                if (location == head) {
                    head = head.getLink();
                } else {
                    // Skip over the target node
                    previous.setLink(location.getLink());
                }

                numElements--;
                return true;
            }

            previous = location;
            location = location.getLink();
        }

        return false;
    }

    @Override
    public boolean isFull() {
        return false;
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