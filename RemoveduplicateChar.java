package Streamapi;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveduplicateChar {
    public static void main(String[] args) {
        
        String str="rainbowcolor";

      
             // Calculate frequency of characters
        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the result
        frequencyMap.forEach((character, frequency) ->
                System.out.println(character + ": " + frequency));

       //remove duplicate characters and print the result string
             String input = "programming";
        String result = input.chars()
                             .distinct()
                             .mapToObj(c -> String.valueOf((char) c))
                             .collect(Collectors.joining());
        System.out.println("Result: " + result);
    }
}

