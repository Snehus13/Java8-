package Streamapi.Java8codes;

import java.util.Arrays;
import java.util.List;

public class Sum {
    
    public static void main(String args[])
    {
        List<Integer> numbers=Arrays.asList(10,23,45,6,4,5,7,8);
        int sum = numbers.stream()
             .mapToInt(Integer::intValue)
             .sum();

             System.out.println(sum);
    }
}
