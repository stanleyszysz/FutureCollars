package future.collars.text;

public class Main {

    public static void main(String[] args) {
        Text text = new Text("Java avaJ");
        boolean isPalindrom = text.checkIsPalindrom();
        System.out.println(isPalindrom);

        int lengthText = text.calculateLength();
        System.out.println(lengthText);

    }
}
