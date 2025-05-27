import java.util.function.*;
public class unary {
    public static void main(String[] args) {
        Integer res = getText(n->n+1,6);
        System.out.println(res);

    }
    public static int getText(UnaryOperator<Integer> func,Integer n)
    {
        return func.apply(n);
    }
}
