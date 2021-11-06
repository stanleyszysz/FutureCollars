package fc.introduction.cinemaemployees;

class Manager extends BaseEmployee {
    private int bonus = 500;

    Manager(String name, String surname, int yearOfEmployment) {
        super(name, surname, yearOfEmployment, 5000);

    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int calculateMonthlySalary() {
        return getBaseSalary() + bonus;
    }
}
