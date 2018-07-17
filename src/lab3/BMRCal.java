package lab3;

import java.util.Scanner;

public class BMRCal {
    public static void main(String[] args) {

        char g;
        int a, h;
        double w;
        Scanner sc = new Scanner(System.in);
        //input
        System.out.print("ระบุเพศ ชาย พิมพ์ (m) หรือ หญิง พิมพ์ (f): ");
        g = sc.next().charAt(0);
        System.out.print("ความสูง: ");
        h = sc.nextInt();
        System.out.print("น้ำหนัก: ");
        w = sc.nextDouble();
        System.out.print("อายุ: ");
        a = sc.nextInt();
        // test condition
        double BMR;
        if (g == 'm') {
            BMR = 66 + (13.7 * w) + (5 * h) - (6.8 * a);
        } else {
            BMR = 655 + (9.6 * w) + (1.8 * h) - (4.7 * a);
        }
        System.out.println("Your BMR : " + BMR);


    }//main
}//class
