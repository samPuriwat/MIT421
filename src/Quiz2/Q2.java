package Quiz2;

import java.util.Scanner;

public class Q2 {
    private static final double PI = 3.1414;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int select = 0;
        do {


            System.out.println("Please select the volumetric geometry following: ");
            System.out.println("1.Sphere");
            System.out.println("2.Cylinder");
            System.out.println("3.Cone");
            System.out.println("4.Exit");
            System.out.print("Select: ");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    sphereVolume();
                    break;
                case 4:
                    System.out.println("Good bye !!!");
                    System.exit(1);
                    break;
            }
        } while (select != 4);


    }//main

    private static void sphereVolume() {
        double r, v;
        System.out.print("Input the Radius (r) in centimeters: ");
        r = sc.nextDouble();
        v = (4 / 3) * PI * (r * r * r);

        System.out.println("The volume of Sphere :  " + v);
    }
}//class
