package Streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparatorex {
    public static void main(String [] args)
    {

    List<String> list =Arrays.asList("sneha","bahadur","aman","ashish","ratan");

     List<String> str = list.stream().sorted(Comparator.comparingInt(String::length).reversed()).toList();

     str.forEach(System.out::println);


    }
}
