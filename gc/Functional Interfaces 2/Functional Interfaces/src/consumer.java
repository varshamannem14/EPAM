import java.util.function.Consumer;
public class consumer {
    public static void main(String[] args) {
        acceptText(System.out::println, "Kotlin language");

    }
    public static void acceptText(Consumer<String> func, String text)
    {
        func.accept(text);
    }
}
