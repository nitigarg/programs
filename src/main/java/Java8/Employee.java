package Java8;

public class Employee {
    private String name;
    private int age;
    private String department;

    // Constructor
    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }

    // toString for easy printing
    @Override
    public String toString() {
        return name + " (" + age + ") - " + department;
    }
}
