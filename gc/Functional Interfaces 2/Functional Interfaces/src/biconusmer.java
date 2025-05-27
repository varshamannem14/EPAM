import java.util.function.BiConsumer;
public class biconusmer {
    public static void main(String[] args) {
        getText((text, n) -> System.out.println(text + " " + n),"Kotlin Langauge",2);

    }
    public static void getText(BiConsumer<String,Integer> func,String text, Integer n)
    {
        func.accept(text,n);
    }

}
