package fc.introduction.cinema;

public class Seating {
    protected int seatNumber;
    protected int rowNumber;
    boolean taken;

    public Seating(int seatNumber, int rowNumber, boolean taken) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.taken = taken;

    }

    public void isTaken() {
        if (taken) {
            System.out.println("The seat " + seatNumber + " in row " + rowNumber + " is taken.");
        }
        else {
            System.out.println("The seat " + seatNumber + " in row " + rowNumber + " is free.");
        }
    }
}
