import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        getText(()-> "Kotlin language");

    }

    public static void getText(Supplier<String> text)
    {
        System.out.println(text.get());
    }

}