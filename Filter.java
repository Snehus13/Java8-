package Streamapi;

import java.util.Arrays;
import java.util.List;

public class Filter {

    public static void main(String [] args){
    
    List<Integer>list =Arrays.asList(1,2,3,4,5,6,7,8,11,12,24);

    List<String>str =Arrays.asList("snehal","ashish","sharvi");

    list.stream().filter(e->e%2==0).forEach(System.out::println);
    str.stream().filter(e->e=="sharvi").forEach(System.out::println);


}
}
