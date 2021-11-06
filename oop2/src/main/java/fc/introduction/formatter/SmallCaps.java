package fc.introduction.formatter;

public class SmallCaps implements TextFormatter{
    String text;

    @Override
    public String formatText(String text) {
        String changedText = text.toLowerCase();
        return changedText;
    }
}
