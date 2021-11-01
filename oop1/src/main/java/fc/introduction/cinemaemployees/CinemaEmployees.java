package fc.introduction.cinemaemployees;

public class CinemaEmployees {
    public static void main(String[] args) {
        Manager manager1 = new Manager("John", "Smith", 2019);
        manager1.setBonus(810);

        TicketSeller ticketSeller1 = new TicketSeller("Mike", "Murphy", 2015);

        System.out.println();
        System.out.println(manager1.calculateMonthlySalary());
        System.out.println(manager1.getTimeEmployment());
        System.out.println();
        System.out.println(ticketSeller1.calculateMonthlySalary());
        System.out.println(ticketSeller1.getTimeEmployment());

    }
}
