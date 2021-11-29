package fc.collections.collections1.task4;

import java.util.List;

class PrintPerson {

    public static void printPerson(List<Person> personList) {
        for (Person person : personList) {
            System.out.println(person.getName() + " " + person.getSurname() + " " + person.getBirthYear() + " " +
                    person.getHeight() + " " + person.getWeight());
        }
    }

}