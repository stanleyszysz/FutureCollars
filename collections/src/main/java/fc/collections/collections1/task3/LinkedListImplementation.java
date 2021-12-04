package fc.collections.collections1.task3;

public class LinkedListImplementation implements LinkedListInterface {

    private Node nodeHead;
    private Node nodeTail;
    private int currentSize = 0;

    public LinkedListImplementation() {
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public void add(String element) {
        addTail(element);
    }

    @Override
    public void insert(int index, String element) {
        if (index < 0 || index > currentSize) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (index == 0) {
            addHead(element);
            return;
        } else if (index == currentSize) {
            addTail(element);
            return;
        }
        Node prevNode = nodeHead;

        for (int i = 0; i < index - 1; i++) {
            prevNode = prevNode.next;
        }

        Node nextNode = prevNode.next;
        Node node = new Node(element);

        node.next = nextNode;
        node.previous = prevNode;
        prevNode.next = node;
        nextNode.previous = node;
        currentSize++;
    }

    @Override
    public void remove(int index) {
        if (currentSize == 0) {
            return;
        }

        if (index < 0 || index >= currentSize) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (index == 0) {
            removeHead();
            return;
        } else if (index == currentSize - 1) {
            removeTail();
            return;
        }

        Node prevNode = nodeHead;
        for (int i = 0; i < index - 1; i++) {
            prevNode = prevNode.next;
        }

        Node node = prevNode.next;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.previous = prevNode;

    }


    private void addHead(String element) {
        Node node = new Node(element);
        node.next = nodeHead;
        if (nodeHead != null) {
            nodeHead.previous = node;
        }
        nodeHead = node;

        if (currentSize == 0) {
            nodeTail = nodeHead;
        }

        currentSize++;
    }


    private void addTail(String element) {
        if (currentSize == 0) {
            addHead(element);
            return;
        }
        Node node = new Node(element);
        nodeTail.next = node;
        node.previous = nodeTail;
        nodeTail = node;
        currentSize++;
    }

    public void removeHead() {
        if (currentSize == 0) {
            return;
        }

        nodeHead = nodeHead.next;
        if (nodeHead != null) {
            nodeHead.previous = null;
        }
        currentSize--;
    }

    public void removeTail() {
        if (currentSize == 0) {
            return;
        }
        if (currentSize == 1) {
            removeHead();
            return;
        }

        nodeTail = nodeTail.previous;
        nodeTail.next = null;

        currentSize--;
    }

}
