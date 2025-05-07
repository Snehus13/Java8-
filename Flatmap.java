package Streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Flatmap {
    public static void main(String [] args){
       //print all the variables to uppercase
        List<List<String>>list=Arrays.asList(
            Arrays.asList("a","b"),
            Arrays.asList("c","d"),
            Arrays.asList("e","f"));

            list.stream().flatMap(Collection::stream).map(String::toUpperCase).forEach(System.out::println);
    }
    
}
