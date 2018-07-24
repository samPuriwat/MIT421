package lab3;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //int x=0;
        System.out.print("Enter an integer: ");
        while (input.nextInt() != 100) {
            System.out.print("Enter an integer: ");

        }

        System.out.println("Good bye.");
    }//main
}//class
