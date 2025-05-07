package Streamapi;

import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String [] args)
    {
        List<Integer>list =Arrays.asList(1,2,3,4,5);
     //print the sum of given integers .
        Integer sum =list.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
