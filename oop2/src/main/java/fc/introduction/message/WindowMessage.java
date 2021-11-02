package fc.introduction.message;

public class WindowMessage extends Message{

    @Override
    String getMessage() {
        String className = this.getClass().getSimpleName();
        System.out.println("This is class " + className);
        return className;
    }
}
