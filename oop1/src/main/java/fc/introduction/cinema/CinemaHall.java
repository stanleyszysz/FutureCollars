package fc.introduction.cinema;

public class CinemaHall {
    public static void main(String[] args) {

        Seating seating1 = new Seating(7, 7, false);
        Seating seating2 = new Seating(1, 11, true);
        Seating seating3 = new Seating(2, 11, true);

        seating1.isTaken();
        seating2.isTaken();
        seating3.isTaken();
    }
}
