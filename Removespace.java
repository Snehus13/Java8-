package Streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Removespace {
          
    public static void main(String [] args)
    {
        List<String>list =Arrays.asList("sneha", " ad vik","sneh  a","ki yan");

        List<String> spaceremoved =list.stream().map(s->s.replaceAll("\\s","")).collect(Collectors.toList());

        System.out.println(spaceremoved);
    }

}
