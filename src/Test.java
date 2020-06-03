import javafx.beans.binding.ObjectExpression;

public class Test {
    public static void main(String[] args) {
        Runnable var = () -> System.err.println("1");
        new Thread(var).start();
        System.err.println("123");
        System.err.println("456");

    }


}
