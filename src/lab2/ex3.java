package lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex3 {
    public static void main(String[] args) throws IOException {


        //using BufferedReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        //input
        //name
        System.out.print("What is your name?: ");
        String name = reader.readLine();
        //age
        System.out.print("How own are you?: ");
        int age = Integer.parseInt(reader.readLine());
        //weight
        System.out.print("What is your weight?: ");
        double weight = Double.parseDouble(reader.readLine());


        //output
        System.out.println("Hello, "+name);
        System.out.println("Your are "+age+" years old.");
        System.out.println("Your weigth "+weight);











    }//main


}//class
