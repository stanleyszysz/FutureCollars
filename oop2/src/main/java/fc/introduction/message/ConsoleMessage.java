package fc.introduction.message;

public class ConsoleMessage extends Message{

    @Override
    String getMessage() {
        String className = this.getClass().getSimpleName();
        return className;
    }
}
