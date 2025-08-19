package Streamapi.Java8codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sortlist {
    public static void main(String [] args)
    {
        List<Integer>numbers = Arrays.asList(2,4,5,6,7,8,9,10);

        List<Integer>sortednum=numbers.stream().sorted().collect(Collectors.toList());

        System.out.println(sortednum);
    }
}
