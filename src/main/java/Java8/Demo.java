package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main (String args[]){
//create List of Employees
        List<Employee> list=Arrays.asList(
                new Employee("Ram",25,"Engineering"),
                new Employee("Shyam",40,"Engineering"),
                new Employee("Mohan",50,"Engineering"),
                new Employee("Reeta",65,"CA"),
                new Employee("Geeta",25,"CA"));
        //Filter those who are older than 30 and return their names in uppercase.
       List<String>result= list.stream().filter(e->e.getAge()>30).map(emp->emp.getName()
                .toUpperCase()).collect(Collectors.toList());
        result.forEach(System.out::println);

        //Similary if we need these names in lowercase
        list.stream().filter(e->e.getAge()>30).map(emp->emp.getName().toLowerCase())
                .collect(Collectors.toList());
        // return employee object whose age is greater than 30
        List<Employee>resultOfEmployee=list.stream().filter(a->a.getAge()>30)
                .collect(Collectors.toList());
        resultOfEmployee.forEach(System.out::println);
//filter and then sort by NAme
        list.stream().filter(e->e.getAge()>30).map(emp->emp.getName())
                .sorted((e1,e2)->e1.compareTo(e2))
                .collect(Collectors.toList());

        //filter by department Engineering & by age greater than 30 and then sort by age
        list.stream().filter(e->e.getDepartment().equals("Engineering")& e.getAge()>30)
                .sorted(Comparator.comparing(Employee::getAge))
                .collect(Collectors.toList());

        //Get names of all employees older than 30 in uppercase, sorted alphabetically
        list.stream()
                .filter(e->e.getAge()>30)
                .map(emp->emp.getName().toUpperCase())
                .sorted()//here sort is perfomed on String and not on employee object so no need for
        //any expression as we are doing natural sortinh
                .collect(Collectors.toList()).forEach(System.out::println);

        //group employees by department
        //With each department there can be several employees so We will have kwy value pair
        //where key will be department which is String
        //value will be list of employees

       Map<String,List<Employee>> resultOfGrouping= list.stream()
               .collect(Collectors.groupingBy(Employee::getDepartment));
        resultOfGrouping.forEach((k,v)->System.out.println(k+","+v));
//note in line 54 we cannot use forEach directly because we are collecting result as Map and then
        //we need to iterate over that map
        //if i want to use forEach inline then we should assign result in map
        list.stream().collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((key,value)->System.out.println(key +","+value));

        //count number of employees in each Department
        list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//What if we don't remember Collectors.counting()
        //one way is we got map as Key as Department and we know that value is List so size
        //of list is basically the count of employees in that particular department


        Map<String,List<Employee>> grouped=list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        Map<String,Integer>resultMap=new HashMap<>();
        grouped.forEach((k,v)->resultMap.put(k,v.size()));
        //Use Case	Code
        //Sum of ages per department	   Collectors.summingInt(Employee::getAge)
        //Average age per department	   Collectors.averagingInt(Employee::getAge)
        //Find max age employee per dept	Collectors.maxBy(Comparator.comparing(Employee::getAge))
        //Collect employee names per dept	Collectors.mapping(Employee::getName, Collectors.toList())

        //Get age of employee with maximum age
      list.stream().map(emp->emp.getAge())
                .max(Integer::compareTo);
      //but if we need employee object or employee with maximum age
        list.stream().max(Comparator.comparing(Employee::getAge));

        //Get the names of top 2 oldest employees
        List<String> topOldest =  list.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).limit(2)
                .map(emp->emp.getName())
                .collect(Collectors.toList());

        //Partition employees into two groups: age > 30 and age <= 30
        Map<Boolean,List<Employee>>group=list.stream()
                .collect(Collectors.partitioningBy(emp->emp.getAge()>30));
        System.out.println(group);

        //Join names of all employees older than 30 into a comma-separated string
        list.stream().filter(e->e.getAge()>30).
                map(Employee::getName)
                .collect(Collectors.joining(","));

        //Create a Set of distinct departments
       Set<String>departments= list.stream().map(Employee::getDepartment).collect(Collectors.toSet());
            departments.forEach(System.out::println);
            // Check if all employees are older than 18
       boolean allAdults= list.stream().allMatch(emp->emp.getAge()>18);
       //Check if any employee belongs to "HR" department
        boolean HRDepartment=list.stream().anyMatch(emp->emp.getDepartment().equals("HR"));

        // Check if no employee is younger than 20
        list.stream().noneMatch(emp->emp.getAge()<20);
        // Convert List<Employee> to List<EmployeeSummary> with only name and department
            class EmployeeSummary{
                private String name;
                private String department;
                public EmployeeSummary(String name , String department){
                    this.name=name;
                    this.department=department;
                }
                List<EmployeeSummary> summaries=list.stream()
                        .map(emp->new EmployeeSummary(emp.getName(),emp.getDepartment()))
                        .collect(Collectors.toList());
            }
            //Filter employees by age > 30, convert to new Employee with name in uppercase
        List<Employee> employees=list.stream().filter(e->e.getAge()>30)
                .map(e->new Employee(e.getName().toUpperCase(),e.getAge(),e.getDepartment()))
                .collect(Collectors.toList());
            //Get average age of employees
        //.average()
        //
        //Operates on the IntStream.
        //
        //Returns an OptionalDouble representing the average value of the elements.
        list.stream().mapToInt(e->e.getAge())
                .average().orElse(0);

        //List of employees sorted by age and then by name
        list.stream()
                .sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getName))
                .collect(Collectors.toList());

        //Get list of employee names who are in the Finance department
        list.stream().filter(e->e.getDepartment().equals("Finance"))
                .map(e->e.getName()).collect(Collectors.toList());
        //Debug stream pipeline using peek()
        List<String> debug = list.stream().peek(e-> System.out.println("Before filtering "+e))
                .filter(emp->emp.getAge()>30)
                .peek(e->System.out.println("After filtering "+e))
                .map(Employee::getName)
                .collect(Collectors.toList());

    }



}
