import java.util.function.Predicate;
public class predicate {
    public static void main(String[] args) {
       boolean res = getText(n->n>5,6);
        System.out.println(res);
        
    }
    public static boolean getText(Predicate<Integer> func,Integer n)
    {
       return  func.test(n);
    }
}
