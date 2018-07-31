package lab3;

public class Quiz1_1 {

    public static void main(String[] args) {

        int count=0;
        int sum=0;

        for (int i = 500; i <= 1000; i++) {
            if (i % 3 == 0 && i % 6 == 0) {
                System.out.print(i+" ");
                count++;
                sum +=i; // sum = sum+i;
            }
        }

        System.out.println("\nNumber of value is "+count);
        System.out.println("The summation is "+sum);
        System.out.println("The average value is "+(sum/count));
    }//main
}//class
