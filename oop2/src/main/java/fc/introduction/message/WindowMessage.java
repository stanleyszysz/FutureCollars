package fc.introduction.message;

public class WindowMessage extends Message{

    @Override
    String getMessage() {
        String className = this.getClass().getSimpleName();
        return className;
    }
}
