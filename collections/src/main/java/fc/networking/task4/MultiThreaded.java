package fc.networking.task4;

import java.util.Arrays;
import java.util.List;

public class MultiThreaded {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8, 14, 5, 99, 87, 4, 65, 22, 11);

        System.out.println("Sum of elements in list: " + sumListParallel(list));
        System.out.println("Mean of elements in list: " + meanParallel(list));
    }

    public static int sumListParallel(List<Integer> list) {
        int[] partialSums = new int[2];
        Runnable firstTask = () -> {
            for (int i = 0; i < list.size() / 2; i++) {
                partialSums[0] += list.get(i);
            }
        };

        Runnable secondTask = () -> {
            for (int i = list.size() / 2; i < list.size(); i++) {
                partialSums[1] += list.get(i);
            }
        };

        Thread firstThread = new Thread(firstTask);
        Thread secondThread = new Thread(secondTask);

        firstThread.start();
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException exception) {
            System.out.println("Something went wrong.");
        }
        return partialSums[0] + partialSums[1];
    }

    public static double meanParallel(List<Integer> list) {
        return sumListParallel(list) / (double) list.size();
    }
}