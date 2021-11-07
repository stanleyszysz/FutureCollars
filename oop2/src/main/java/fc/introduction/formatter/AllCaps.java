package fc.introduction.formatter;

public class AllCaps implements TextFormatter{

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
