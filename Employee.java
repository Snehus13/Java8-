package Streamapi;

import java.util.ArrayList;
import java.util.List;

public class Employee { 
   private int id;
    private String name;
    private int age;
    private long salary;
    private String gender;
    private String deptname;
    private String city;
    private int yearofjoining;

     public Employee(int id, String name, int age, long salary, String gender, String deptname, String city,
            int yearofjoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.deptname = deptname;
        this.city = city;
        this.yearofjoining = yearofjoining;
    }

    
    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public long getSalary() {
        return salary;
    }


    public String getGender() {
        return gender;
    }


    public String getDeptname() {
        return deptname;
    }


    public String getCity() {
        return city;
    }


    public int getYearofjoining() {
        return yearofjoining;
    }


    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", gender=" + gender
                + ", deptname=" + deptname + ", city=" + city + ", yearofjoining=" + yearofjoining + "]";
    }


    public static void main (String [] args)
    {
        List<Employee>list =new ArrayList<Employee>();

        list.add(new Employee(101,"aniket", 24, 1000, "Male", "developer", "Sangli", 2021));
        list.add(new Employee(102, "Ashish", 29, 2000, "Male", "Tester", "kolhapur", 2023));
        list.add(new Employee(101,"ankita", 24, 1000, "Female", "developer", "Sangli", 2021));
        list.add(new Employee(102, "Ashvin", 25, 2000, "Male", "Tester", "kolhapur", 2022));
        list.add(new Employee(101,"snehal", 24, 1000, "Female", "Javadeveloper", "Sangli", 2021));
        list.add(new Employee(102, "sarthak", 27, 2000, "Male", "Tester", "kolhapur", 2024));
        list.add(new Employee(101,"tanaya", 28, 1000, "Female", "developer", "Sangli", 2025));
        list.add(new Employee(102, "Ashish", 26, 2000, "Male", "Tester", "kolhapur", 2022));


        //list of all employee names and ages
        List<String>nameandAge= list.stream().map(emp-> emp.getName()+" "+emp.getAge()).toList();
        System.out.println(nameandAge);

        //list by gender and city of all employee
        List<String>genderandcity =list.stream().map(emp-> emp.getName()+" "+emp.getGender()+" "+emp.getCity()).toList();
        System.out.println(genderandcity);

        //get unique department name
        List<String>uniquedepartments =list.stream().map(Employee::getDeptname).distinct().toList();
        System.out.println(uniquedepartments);

        //gwt unique city names
        List<String>citynames=list.stream().map(Employee::getCity).distinct().toList();
        System.out.println(citynames);
        
    }


}

