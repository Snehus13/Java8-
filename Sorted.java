package Streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorted {

    public static void main(String [] args){

        List<Integer>list=Arrays.asList(1,2,5,7,3,8,4,6);
        //sort elements in ascending order
        list.stream().sorted().forEach(System.out::println);

        //print the elements in descending order
    list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }
    
    

}
