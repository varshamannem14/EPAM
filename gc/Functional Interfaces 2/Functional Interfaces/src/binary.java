import java.util.function.*;
public class binary {
    public static void main(String[] args) {
        Float res = getText((a,b)->a+b,10,20);
        System.out.println(res);



    }
    public static float getText(BinaryOperator<Integer>func,Integer a,Integer b)
    {
        return func.apply(a,b);
    }
}
