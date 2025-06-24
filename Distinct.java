package Streamapi;

import java.util.Arrays;
import java.util.List;

public class Distinct {
    public static void main(String [] args){

        List<Integer>list =Arrays.asList(1,2,3,4,4,5,6,6,7);
         //filter out duplicate elements 
        list.stream().distinct().forEach(System.out::println);
        
    }
    
}
