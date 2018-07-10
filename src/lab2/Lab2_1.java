package lab2;

import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        //1. create object for read data
        Scanner scanner = new Scanner(System.in);
        int number1,number2,number3,number4,number5,number6,number7,
                number8,number9,number10;
        //2. input data
        System.out.print("Enter a integer 1: ");
        number1 = scanner.nextInt();
        System.out.print("Enter a integer 2: ");
        number2 = scanner.nextInt();
        System.out.print("Enter a integer 3: ");
        number3 = scanner.nextInt();
        System.out.print("Enter a integer 4: ");
        number4 = scanner.nextInt();
        System.out.print("Enter a integer 5: ");
        number5 = scanner.nextInt();
        System.out.print("Enter a integer 6: ");
        number6 = scanner.nextInt();
        System.out.print("Enter a integer 7: ");
        number7 = scanner.nextInt();
        System.out.print("Enter a integer 8: ");
        number8 = scanner.nextInt();
        System.out.print("Enter a integer 9: ");
        number9 = scanner.nextInt();
        System.out.print("Enter a integer 10: ");
        number10 = scanner.nextInt();

        //3. find total and average value
        int total = number1+number2+number3+number4+number5+
                number6+number7+number8+number9+number10;
        double average = total / 10.0;

        //4. show output
        System.out.println("The total value is " + total);
        System.out.println("The average value is "+average);

    }

}
