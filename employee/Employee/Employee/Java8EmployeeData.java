package Employee;

import java.util.ArrayList;
import java.util.List;

public class Java8EmployeeData {
    
    //static method that can be directly called by using class name
    public static List<Employee> getEmployeeData(){
        
        List<Employee> employeeList  = new ArrayList<Employee>();

        employeeList.add(new Employee(101, "snehal", 32, "female","HR",2011, 20500));
        employeeList.add(new Employee(102, "pratik", 24, "male","TD",2014, 20000));
        employeeList.add(new Employee(103, "ashish", 27, "female","FS",2013, 30500));
        employeeList.add(new Employee(104, "chanchal", 29, "male","HR",2019, 50500));
        employeeList.add(new Employee(105, "kartik", 26, "female","TD",2011, 20400));
        employeeList.add(new Employee(106, "snehal", 35, "female","FS",2014, 20300));
    
       return employeeList;
    }
    

}


