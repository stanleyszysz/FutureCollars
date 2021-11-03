package fc.introduction.cinemaemployees;

class TicketSeller extends BaseEmployee {


    TicketSeller(String name, String surname, int yearOfEmployment) {
        super(name, surname, yearOfEmployment, 3000);

    }

    @Override
    public int calculateMonthlySalary() {
        return getBaseSalary();
    }
}
