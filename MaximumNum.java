package Streamapi.Java8codes;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumNum {

    public static void main(String [] args)
    {
        List<Integer> num= Arrays.asList(2,5,78,45,34,67,88,9);
        //The max method takes a comparator and returns the maximum element wrapped in an optional.

        Optional<Integer> number =num.stream().max(Integer::compare);

        System.out.println(number);
    }
}
