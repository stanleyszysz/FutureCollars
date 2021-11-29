package fc.collections.collections1.task4;

import java.util.Comparator;

public class Person implements Comparable<Person> {

    public static Comparator<Person> heightComparator = new Comparator<Person>() {
        @Override
        public int compare(Person firstPerson, Person secondPerson) {
            return Integer.compare(firstPerson.getHeight(), secondPerson.getHeight());
        }
    };

    public static Comparator<Person> weightComparator = new Comparator<Person>() {
        @Override
        public int compare(Person firstPerson, Person secondPerson) {
            return Integer.compare(secondPerson.getWeight(), firstPerson.getWeight());
        }
    };

    private final String name;
    private final String surname;
    private final int birthYear;
    private final int height;
    private final int weight;

    public Person(String name, String surname, int birthYear, int height, int weight) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(otherPerson.birthYear, this.birthYear);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

}
