package fc.introduction.cinemaemployees;

class TicketSeller extends BaseEmployee {


    TicketSeller(String name, String surname, int yearEmployment) {
        super(name, surname, yearEmployment, 3000);

    }

    @Override
    public int calculateMonthlySalary() {
        return getBASE_SALARY();
    }
}
