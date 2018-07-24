package lab3;

import java.util.Scanner;

public class calGrade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score;
        //do-while
        do {
            System.out.print("Enter your score: ");
            score = input.nextInt();
            if (score <= 100 && score >= 0) {
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
                else
                    System.out.println("Your grade is A.");
            } else {
                System.out.println("Please enter your score between 0-100.");
            }
        } while (score > 100 || score < 0);


        System.out.println("Good bye.");
    }
}//class
