package com.epam;
import java.util.*;
public class perfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(perfect(n));

    }
    public static boolean perfect(int n)
    {
        int low = 1;
        int high = n;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            long square = (long)mid*mid;
            if(square==n)
            {
                return true;

            }
            else if(square<n)
            {
                low = mid+1;
            }
            else {
                high = mid-1;
            }

        }
        return false;
    }
}
