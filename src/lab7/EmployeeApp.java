package lab7;

import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Puriwat",
                "EMP001",
                "Programmer",
                15000.00,
                "puriwat.l@rmutsv.ac.th");


        System.out.println(emp1.toString());
        emp1.setName("Puriwat Lertkrai");
        System.out.println(emp1.toString());

        Employee emp2 = new Employee();

        emp2 = inputData(emp2);
        System.out.println(emp2.toString());

    }//main

    private static Employee inputData(Employee emp) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        emp.setName(sc.nextLine());
        System.out.print("Enter your position: ");
        emp.setPosition(sc.nextLine());
        System.out.print("Enter your id:");
        emp.setId(sc.nextLine());
        System.out.print("Enter your email: ");
        emp.setEmail(sc.nextLine());
        System.out.print("Enter your salary: ");
        emp.setSalary(sc.nextDouble());

        return emp;
    }
}//class
