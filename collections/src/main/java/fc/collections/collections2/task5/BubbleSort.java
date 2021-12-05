package fc.collections.collections2.task5;

public class BubbleSort {
    public <E extends Comparable<E>>
    E[] sortArray(E[] list) {
        E temp;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j].compareTo(list[j + 1]) > 0) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }
}