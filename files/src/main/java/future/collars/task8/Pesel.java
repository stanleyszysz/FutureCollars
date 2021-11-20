package future.collars.task8;

class Pesel {

    public static void checkPesel(String pesel) {
        if (!pesel.matches("\\d+?")) {
            throw new WrongTypeOfDataException("Only digits are allowed.");
        }

        if (pesel.length() != 11) {
            throw new IllegalLengthException("PESEL should be exactly eleven digits.");
        }
    }

}
