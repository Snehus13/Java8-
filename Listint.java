package Streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Listint {
     
     public static void main(String [] args){
      List<Integer> list = new ArrayList<>();
list.add(2);
list.add(12);
list.add(34);
list.add(10);
list.add(18  );
list.add(5);

//filtering elements from list using streampi

List <Integer> ls = list.stream().filter(i->i%2==0).collect(Collectors.toList());
System.out.println(ls);

List<Integer> ll =list.stream().filter(i->i>=10).collect(Collectors.toList());
System.out.println(ll);

//sum and count operation OBJECT to Primitive date printing
int summ =list.stream().mapToInt(Integer::intValue).sum();
System.out.println(summ);
//int max =list.stream().mapToInt(Integer::intValue).max();
//int min =list.stream().mapToInt(Integer::intValue).min();
long countt =list.stream().mapToInt(Integer::intValue).count();
System.out.println(countt);

List<Integer> numbers = Arrays.asList(1,3,4,12,123,45,78,10,100,1000,15);

List<Integer>startingWithone =numbers.stream().filter(n->String.valueOf(n).startsWith("1")).collect(Collectors.toList());

System.out.println(startingWithone);

}
}