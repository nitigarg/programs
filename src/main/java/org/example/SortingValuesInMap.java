package org.example;

import java.util.*;

public class SortingValuesInMap {
    public static void main(String args[]){
        Map<Character,Integer> map=new HashMap<>();
        map.put('d',4);
        map.put('e',5);
        map.put('a',1);
        map.put('z',26);
        //sorting in natural order, we can get all values of map using map.values()
        List<Integer> list=new ArrayList<>(map.values());
        System.out.println("Original Values in Map : "+list);
        System.out.println("Ascending order");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Descending order");
        Collections.sort(list,(a,b)->b-a);
        System.out.println(list);
        //When we have to sort Keys and return them
        //Similarly we can also get values from map using map.keySet() which returns key
        List<Character> list1=new ArrayList<>(map.keySet());
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println("Descending order");
        Collections.sort(list1,(a1,b1)->b1-a1);
        System.out.println(list1);

    }
}
