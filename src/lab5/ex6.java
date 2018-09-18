package lab5;

import java.util.StringTokenizer;

public class ex6 {
    public static void main(String[] args) {
        //StringBuffer
        StringBuffer strBuf = new StringBuffer("I am at RUTS");
        strBuf.insert(0, "MT: ");
        System.out.println(strBuf);
        System.out.println(strBuf.reverse());
        //StringBuilder
        StringBuilder strBui = new StringBuilder("I am at RUTS");
        strBui.append(" :MT");
        System.out.println(strBui);
        System.out.println(strBui.reverse());
        //StringTokenizer
        StringTokenizer strTok = new StringTokenizer("I am at RUTS");

        System.out.println("Word count in message = " + strTok.countTokens());

        while (strTok.hasMoreTokens()) {
            System.out.println(strTok.nextToken());
        }


    }//main


}//class
