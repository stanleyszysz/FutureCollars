package fc.introduction.cinema;

public class CinemaHall {
    public static void main(String[] args) {

        Seating seating = new Seating(7, 7, true);


        if (seating.isTaken()) {
            chooseDifferentSeat();
        }
        else {
            makeReservation();
        }

    }

    private static void makeReservation() {
        System.out.println("The seat is free...");
    }

    private static void chooseDifferentSeat() {
        System.out.println("You have to choose another seat...");
    }
}
