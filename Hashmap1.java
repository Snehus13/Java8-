package Streamapi;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class Hashmap1 {
    public static void main (String [] args){
        Map <String, Integer> hm = new HashMap <>();

    hm.put("snehal",1);
    hm.put("sharvi",2);
    hm.put("rudra",3);
    hm.put("ashish",4);

    //iterating through each value 
    hm.entrySet().forEach(entry ->System.out.println("id"+entry.getKey()+"value"+entry.getValue()));
    
    //filter entries with value greter then 2
    Map<String ,Integer>filteredvalues =hm.entrySet().stream().filter(entry->entry.getValue()>2).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
    System.out.println("filtered values =  "+filteredvalues);
}
}
