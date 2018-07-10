package lab2;

import java.util.Scanner;

public class Lab2_3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert F to C");
        System.out.print("Enter F degree: ");
        double f = scanner.nextDouble();
        double c = (5.0 / 9.0) * (f - 32.0);

        System.out.println("C degree is :"+c  );
    }
}
