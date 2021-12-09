package fc.stream.task3;

public class CinemaHall {
    private String name;
    private HallType hallType;

    public CinemaHall(String name, HallType hallType) {
        this.name = name;
        this.hallType = hallType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HallType getHallType() {
        return hallType;
    }

    public void setHallType(HallType hallType) {
        this.hallType = hallType;
    }

    @Override
    public String toString() {
        return name;

    }
}
