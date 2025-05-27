import java.util.function.Function;
public class function {
    public static void main(String[] args) {
       String res = getText(n->"number is:"+n,10);
        System.out.println(res);
    }
    public static String getText(Function<Integer,String> func,Integer n)
    {
       return  func.apply(n);
    }
}
