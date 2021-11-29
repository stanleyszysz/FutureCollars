package fc.mock.task7;

public enum Rating {
    SMALL("Niska"),
    GOOD("Dobra"),
    VERY_GOOD("Bardzo dobra"),
    EXCELLENT("Doskonała"),
    ERROR("Nieprawidłowe wartości");

    private final String polishName;

    Rating(String polishName) {
        this.polishName = polishName;
    }

    @Override
    public String toString() {
        return polishName;
    }
}
