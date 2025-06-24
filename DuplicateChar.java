package Streamapi;

import java.util.stream.Collectors;
import java.util.Map;

public class DuplicateChar{

    public static void main(String [] args){

    //find the duplicate chracters from given string

    String inputString ="welcometohome";
    Map<Character, Long>charcounts=inputString.chars()
    .mapToObj(c->(char) c).collect(Collectors.groupingBy(c->c, Collectors.counting()));

    System.out.println("duplicate  characters in "+inputString);

    charcounts.entrySet().stream().filter(entry -> entry.getValue()>1)
      .forEach(entry -> System.out.println(entry.getKey() +" "+entry.getValue()+" "));

    
}
    
}
