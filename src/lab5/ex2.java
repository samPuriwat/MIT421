package lab5;
//1. create method to find maximum  value in array
//2. create method to find minimum  value in array
//3. create method to find average  value in array
//4. create method to sorting data in array (low->high)****


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Please, enter integers number:");

        //input
        for (int i = 0; i < num.length; i++) {
            System.out.print("enter integer " + (i + 1) + ":");
            num[i] = scanner.nextInt();

        }

        //output
//        System.out.println("\n Data in Array following: ");
//        for (int i = 0; i < num.length; i++) {
//            System.out.print(num[i]+" ");
//
//        }
        //output2

        showData(num);
        findMaxData(num);
        findAverageData(num);
        sortingData(num);

    }//main

    private static void sortingData(int[] num) {

        Arrays.sort(num);
        System.out.println("Sorting data: \n");
        showData(num);
    }

    private static void findAverageData(int[] num) {
        int total = 0;
        for (int val : num) {
            total += val;
        }
        System.out.println("\nThe average value is: " + (total / num.length));
    }

    private static void findMaxData(int[] num) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i])
                max = num[i];
        }
        System.out.println("\nThe maximum value is: " + max);
    }

    private static void showData(int[] num) {
        System.out.println("\nData in Array following: ");
        for (int val : num) {
            System.out.print(val + " ");
        }
    }
}//class
