package fc.collections.collections1.task2;

public class OwnListImplementation implements OwnList {

    private final int DEFAULT_CAPACITY = 10;
    private int[] data;
    private int currentSize = 0;

    public OwnListImplementation() {
        data = new int[DEFAULT_CAPACITY];
    }

    public int getCapacity() {
        return data.length;
    }

    public void printData() {
        for (int datum : data) {
            System.out.print(datum + ", ");
        }
        System.out.println();
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public void add(Integer element) {

        if (data.length - currentSize == 0) {
            int[] newData = data;
            data = new int[currentSize + 10];
            for (int i = 0; i < currentSize; i++) {
                data[i] = newData[i];
            }
        }

        data[currentSize] = element;
        currentSize++;
    }


    @Override
    public Integer get(int i) {

        if (i >= currentSize || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[i];
    }

    @Override
    public void add(int index, Integer element) {

        if (index > currentSize || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int[] newData = data;
        currentSize++;
        data = new int[currentSize];
        for (int i = 0, j = 0; i < currentSize; i++) {
            if (index == i) {
                data[i] = element;
            } else {
                data[i] = newData[j];
                j++;
            }
        }
    }

    @Override
    public Integer remove(int index) {
        if (index > currentSize || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int[] newData = data;
        currentSize--;
        data = new int[currentSize];
        for (int i = 0, j = 0; i < currentSize; i++, j++) {
            if (index == j) {
                j++;
            }
            data[i] = newData[j];
        }
        return null;
    }

}
