package lab3;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        System.out.print("Enter your score: ");
        score = scanner.nextInt();

        //test condition
        if (score >= 0 && score <= 49)
            System.out.println("Your grade is F.");
        else if (score >= 50 && score <= 54)
            System.out.println("Your grade is D.");
        else if (score >= 55 && score <= 59)
            System.out.println("Your grade is D+.");
        else if (score >= 60 && score <= 64)
            System.out.println("Your grade is C.");
        else if (score >= 65 && score <= 69)
            System.out.println("Your grade is C+.");
        else if (score >= 70 && score <= 74)
            System.out.println("Your grade is B.");
        else if (score >= 75 && score <= 79)
            System.out.println("Your grade is B+.");
        else if (score >= 80 && score <= 100)
            System.out.println("Your grade is A.");
        else System.out.println("กรุณากรอกคะแนนให้อยู่ระหว่าง (0-100)");

    }//main
}//main
