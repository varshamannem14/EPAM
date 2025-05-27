//Descending sorting using streams

import java.util.*;
import java.util.stream.*;
public class sort{
public static void main(String[] args)
{
   Integer[] arr = {1,3,5,7,9,11};
    Arrays.stream(arr).sorted((a,b)->b.compareTo(a)).mapToInt(Integer::intValue).forEach(System.out::println);
}
}
   