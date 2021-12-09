package fc.stream.task3;

public enum HallType {
    DD("2D"),
    DDD("3D"),
    DDDD("4D");

    private final String correctHallName;

    HallType(String correctHallName) {
        this.correctHallName = correctHallName;
    }

    @Override
    public String toString() {
        return correctHallName;
    }
}
