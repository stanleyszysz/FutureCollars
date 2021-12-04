package fc.collections.collections2.task2;

public class OwnQueueImplementation implements OwnQueue {

    private Node front;
    private Node back;
    private int currentSize = 0;

    @Override
    public boolean add(Integer e) {
        Node node = new Node(e);
        if (currentSize == 0) {
            node.next = null;
            front = node;
            back = front;
        } else {
            back.next = node;
            back = node;
        }
        currentSize++;
        return true;
    }

    public int size() {
        return currentSize;
    }

    @Override
    public Integer remove() {
        if (currentSize == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Integer element = front.data;
        front = front.next;
        currentSize--;
        return element;
    }

    @Override
    public Integer element() {
        if (currentSize == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return front.data;
    }

}
