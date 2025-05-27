import java.util.*;
public class Main {
    public static void main(String[] args) {
       /* ArrayList<String> list = new ArrayList<>();//After declaring this an empty array is added to the memory
        list.add("apple");//default internally it will assign the array size as 10
        // for example if the size is n and if you want to increase the size further then it will
        // it will take the size as n+n/2+1
        list.add("grape");
        System.out.println(list);
        list.add(2,"mango");
        System.out.println(list);
        List<String> list1 = new ArrayList<>();//created another list
        list1.add("Main");
        list1.add("java");
        list.addAll(list1);//it will add all the elements in to the first list
        System.out.println(list);
        System.out.println(list1.get(1));//to retrieve the element from the specific index*/

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println(list);

       /* list.remove(2);//removes the specified index
        System.out.println(list);
        list.remove(Integer.valueOf(60));//removes the specified value from the list
        System.out.println(list);
        list.clear();//removes all the values from the list
        System.out.println(list);

    //for removing the element from the arraylist it takes O(n) because of shifting
        //for insertion it will also take O(n)
*/
        list.set(2,1000);//want to change the position number
        System.out.println(list);
        System.out.println(list.contains(1000));







    }
}