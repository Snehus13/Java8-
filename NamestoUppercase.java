package Streamapi.Java8codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NamestoUppercase {
    public static void main(String [] args)
    {
        List<String>names=Arrays.asList("snehal","payal","kirtani","shreaddha");

        List<String>Names=names.stream()
                  .map(String::toUpperCase)
                  .collect(Collectors.toList());

                  System.out.println(Names);
    }
}
