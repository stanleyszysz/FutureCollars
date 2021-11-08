package future.collars.text;

class Text {
    private final String textToCheck;

    public Text(String textToCheck) {
        this.textToCheck = textToCheck;
        if (textToCheck.length() == 0) throw new RuntimeException();
    }

    public boolean checkIsPalindrom() {
        boolean isPalindrom = true;
        int fromFront = 0;
        int fromEnd = textToCheck.length() - 1;

        while (fromFront < fromEnd) {
            if (textToCheck.charAt(fromFront) != textToCheck.charAt(fromEnd)) {
                isPalindrom = false;
                break;
            }
            fromFront++;
            fromEnd--;
        }
        return isPalindrom;
    }

    public int calculateLength() {
        return textToCheck.length();
    }
}
