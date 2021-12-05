package fc.collections.collections2.task3;

public class OwnListImpl<E> implements OwnList<E> {

    private E[] data;
    private int currentSize = 0;

    public OwnListImpl() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public boolean add(E e) {
        if (data.length - currentSize == 0) {
            E[] newData = data;
            data = (E[]) new Object[currentSize + 10];
            for (int i = 0; i < currentSize; i++) {
                data[i] = newData[i];
            }
        }

        data[currentSize] = e;
        currentSize++;
        return true;
    }

    @Override
    public E get(int index) {
        if (index >= currentSize || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[index];
    }

    @Override
    public boolean remove(E o) {
        E[] newData = data;
        boolean notFoundYet = true;
        currentSize--;
        data = (E[]) new Object[currentSize];
        for (int i = 0, j = 0; i < currentSize; i++, j++) {
            if (newData[i] == o && notFoundYet) {
                j++;
                notFoundYet = false;
            }
            data[i] = newData[j];

        }
        return true;
    }

    @Override
    public int size() {
        return currentSize;
    }

}
