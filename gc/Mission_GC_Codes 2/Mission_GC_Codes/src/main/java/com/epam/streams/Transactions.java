package com.epam.streams;
import java.util.Map;
import java.util.HashMap;

public class Transactions {
    static class pair{
        int amount;
        int count;

        public pair(int amount, int count) {
            this.amount = amount;
            this.count = count;
        }

        @Override
        public String toString() {
            return "pair{" +
                    "amount=" + amount +
                    ", count=" + count +
                    '}';
        }
    }
    public static int transaction(int[] arr,String[] date)
    {
        Map<Integer,pair>map = new HashMap<>();
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                sum+=arr[i];
            }
            else {
                sum+=arr[i];
                String dateString = date[i];
                int month = Integer.parseInt(dateString.substring(5,7));
                if(map.containsKey(month))
                {
                    pair occured = map.get(month);
                    int amount = occured.amount+arr[i];
                    int count = occured.count+1;
                    map.put(month,new pair(amount,count));
                }
                else {
                    map.put(month,new pair(arr[i],1));
                }

            }
        }
        int months=0;
        for(Map.Entry<Integer,pair> mp : map.entrySet())
        {
            if(mp.getValue().amount<=(-100) || mp.getValue().count>=3)
            {
                months++;
            }
        }
        int calc = 12-months;
        return sum-(calc*5);


    }
    public static void main(String[] args) {
        int[] transactions = {10,-10,-100,-10};
        String[] date = {"2020-12-31","2020-12-22","2020-12-03","2020-12-29"};
        System.out.println(transaction(transactions,date));

    }
}
