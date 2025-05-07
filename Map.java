package Streamapi;

import java.util.Arrays;
import java.util.List;

public class Map {
    public static void main(String [] args)
    {
         List<String>list= Arrays.asList("Sneha","naina","rucha","Chetana");

         //convert the elements to uppercase
         list.stream().map(String::toUpperCase).forEach(System.out::println);
         
    }
}
