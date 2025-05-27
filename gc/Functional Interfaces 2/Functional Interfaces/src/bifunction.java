import java.util.function.*;
public class bifunction {
    public static void main(String[] args) {
        String res = getText((n1,n2)->n1+" "+n2,10, "Number is");
        System.out.println(res);
    }
    public static String getText(BiFunction<Integer,String,String> func,Integer n1,String n2)
    {
        return func.apply(n1,n2);
    }
}
