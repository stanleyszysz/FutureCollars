package fc.introduction.formatter;

public class SmallCaps implements TextFormatter{

    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
