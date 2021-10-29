package fc.introduction.cinema;

class Seating {
    private int seatNumber;
    private int rowNumber;
    boolean taken;

    public Seating(int seatNumber, int rowNumber, boolean taken) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.taken = taken;

    }

    public boolean isTaken() {
        return taken;
    }


}
