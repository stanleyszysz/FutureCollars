package fc.collections.collections1.task4;

import java.util.*;

public class PersonSorter {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John", "Smith", 1966, 185, 99));
        personList.add(new Person("Emily", "Miller", 1959, 165, 61));
        personList.add(new Person("Jacob", "Johnson", 1941, 184, 79));
        personList.add(new Person("Emma", "Williams", 1938, 176, 58));
        personList.add(new Person("William", "Brown", 1972, 159, 80));
        personList.add(new Person("Michael", "Jones", 1985, 201, 122));

        Collections.sort(personList);
        PrintPerson.printPerson(personList);

        System.out.println();

        Collections.sort(personList, Person.heightComparator);
        PrintPerson.printPerson(personList);

        System.out.println();

        Collections.sort(personList, Person.weightComparator);
        PrintPerson.printPerson(personList);

    }
}
