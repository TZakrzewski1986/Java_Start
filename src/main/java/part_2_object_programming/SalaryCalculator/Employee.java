package part_2_object_programming.SalaryCalculator;

public class Employee {

    private String name;
    private String lastname;
    private double salary;

    public Employee(String name, String lastname, double salary) {
        this.name = name;
        this.lastname = lastname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }
}
