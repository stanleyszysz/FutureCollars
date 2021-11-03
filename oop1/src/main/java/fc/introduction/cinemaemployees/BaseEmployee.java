package fc.introduction.cinemaemployees;

abstract class BaseEmployee {
    private String name;
    private String surname;
    private final int baseSalary;
    private final int yearOfEmployment;

    BaseEmployee(String name, String surname, int yearOfEmployment, int baseSalary) {
        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = yearOfEmployment;
        this.baseSalary = baseSalary;
    }

    public abstract int calculateMonthlySalary();

    public int getTimeEmployment() {
        return (2021 - yearOfEmployment);
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}
