package Employee;
import java.util.*;
import java.util.stream.Collectors;

/*
 * write java program to count the male and female employees of the organization 
 * how many male and female employees are there in the organization
 */

public class MaleFemaleEmployee {

    public static void main(String [] args)
    {
        List<Employee> empList = Java8EmployeeData.getEmployeeData();
        
        Map<String,Long> malefemaleCount = empList.stream()
                    .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));

        System.out.println(malefemaleCount);

        //avg salary for each department
        //grouping the data department wise
        //averaging depty salary
        Map<String,Double> deptAvgSalary =empList.stream()
                                      .collect(Collectors.groupingBy(Employee::getDepartment,
                                      Collectors.averagingDouble(Employee::getSalary)));


        for(Map.Entry<String,Double> entry :deptAvgSalary.entrySet()){
        System.out.println(entry.getKey()+" "+entry.getValue());
        }

        //find the department with highest average salary
         Map<String,Double> avgDeptSalary =empList.stream()
                                      .collect(Collectors.groupingBy(Employee::getDepartment,
                                      Collectors.averagingDouble(Employee::getSalary)));

        Optional<Map.Entry<String, Double>>highestavgsalaryDepartment =avgDeptSalary.entrySet().stream()
                             .max(Map.Entry.comparingByValue());

        highestavgsalaryDepartment.ifPresent(entry -> System.out.println(entry.getKey()+" "+entry.getValue()));
        

    }
}
