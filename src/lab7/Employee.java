package lab7;
//properties
//1. name
//2. id
//3. position
//4. salary
//5. email

import java.util.StringTokenizer;

public class Employee {
    private String name;
    private String id;
    private String position;
    private double salary;
    private String email;

    //constructor

    public Employee() {
    }

    public Employee(String name, String id, String position, double salary, String email) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.salary = salary;
        this.email = email;
    }
    //getter and setter methods


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                '}';
    }
}
