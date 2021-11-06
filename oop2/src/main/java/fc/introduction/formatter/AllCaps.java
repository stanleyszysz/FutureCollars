package fc.introduction.formatter;

public class AllCaps implements TextFormatter{
    String text;

    @Override
    public String formatText(String text) {
        String changedText = text.toUpperCase();
        return changedText;
    }
}
