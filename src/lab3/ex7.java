package lab3;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        //do-while
        do {
            System.out.print("Enter an integer: ");
            x = input.nextInt();
        } while (x != 100);

        System.out.println("Good bye.");


    }


}//class
