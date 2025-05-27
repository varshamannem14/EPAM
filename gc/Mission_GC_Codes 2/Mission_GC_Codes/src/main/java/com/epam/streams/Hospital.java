package com.epam.streams;
import java.util.*;

public class Hospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(hospital(arr));

    }
    public static int hospital(int[][] arr)
    {
        int n = arr.length;
        int m = arr[0].length;
        HashMap<Integer,Set<Integer>> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                HashSet<Integer> set = new HashSet<>();
                if(map.get(arr[i][j])==null)
                {
                    set.add(i);
                    map.put(arr[i][j],set);
                }
                else{
                    Set<Integer> set1 = map.get(arr[i][j]);
                    set1.add(i);
                    map.put(arr[i][j],set1);
                }

            }
        }
        for(Map.Entry<Integer,Set<Integer>> mp : map.entrySet())
        {
            if(mp.getValue().size()>1)
            {
                count++;
            }
        }
        return count;
    }
}
