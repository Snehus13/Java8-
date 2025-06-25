package Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NamewiseSorting {

    public static List<Employee>getdata()
    {
        List<Employee>list=new ArrayList<Employee>();

        list.add(new Employee(101, "sneha", 23, "Female", "Hr", 2021, 45000));
        list.add(new Employee(102, "ashish", 33, "Male", "Hr", 2022, 35000));
        list.add(new Employee(103, "rakul", 29, "Female", "Hr", 2024, 40000));
        list.add(new Employee(104, "prerana", 33, "Female", "Hr", 2023, 55000));
        list.add(new Employee(105, "shree", 29, "Male", "Hr", 2026, 25000));
        list.add(new Employee(106, "kartik", 23, "Male", "Hr", 2022, 45000));
        list.add(new Employee(107, "ram", 27, "Male", "Hr", 2025, 35000));
        return list;
    }

    public static void main(String[] args)
    {
    List<Employee>ll=NamewiseSorting.getdata();

    //group the empoloyees by age
    Map<Integer, List<Employee>>empbyAge=ll.stream().collect(Collectors.groupingBy(Employee::getAge));

    System.out.println(empbyAge);

    //print the employee whose age is greater than 28

    System.out.println("printing the employees with age above 28");
    List<Employee>listemp=ll.stream().filter(e->e.getAge()>28).collect(Collectors.toList());
      System.out.println(listemp);
    }

    

}
