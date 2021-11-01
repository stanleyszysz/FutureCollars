package fc.introduction.cinemaemployees;

abstract class BaseEmployee {
    private String name;
    private String surname;
    private final int BASE_SALARY;
    private final int YEAR_OF_EMPLOYMENT;

    BaseEmployee(String name, String surname, int yearEmployment, int BASE_SALARY) {
        this.name = name;
        this.surname = surname;
        this.YEAR_OF_EMPLOYMENT = yearEmployment;
        this.BASE_SALARY = BASE_SALARY;
    }

    public abstract int calculateMonthlySalary();

    public int getTimeEmployment() {
        return (2021 - YEAR_OF_EMPLOYMENT);
    }

    public int getBASE_SALARY() {
        return BASE_SALARY;
    }
}
