package fc.collections.collections1.task1;

import java.util.*;

public class ListOfNames {


    public static void main(String[] args) {

        List<String> names = Arrays.asList("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr");

        List<String> listWithoutDuplicates = removeDuplicateNames(names);
        printList(listWithoutDuplicates);

        reverseNamesOrder(names);
        printList(names);

        changeName(names, "Anna", "Joanna");
        printList(names);

    }

    private static void printList(List<String> list) {
        System.out.println(String.join(", ", list));
    }

    private static List<String> removeDuplicateNames(List<String> names) {
        return new ArrayList<>(new HashSet<>(names));
    }

    private static void reverseNamesOrder(List<String> names) {
        Collections.reverse(names);
    }

    private static void changeName(List<String> names, String oldName, String newName) {
        Collections.replaceAll(names, oldName, newName);
    }

}
