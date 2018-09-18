package lab5;

import java.util.ArrayList;

public class ex4 {
    public static void main(String[] args) {


        ArrayList myList = new ArrayList();
        myList.add("Sam");
        System.out.println(myList);
        myList.add("Ton");
        myList.add("Bow");
        myList.add("Ji");
        myList.add("Keaw");
        System.out.println(myList);
        myList.add(2, "Ann");
        System.out.println(myList);
        //remove
        myList.remove(4);
        System.out.println(myList);
        myList.remove("Ton");
        System.out.println(myList);
        //indexof()
        System.out.println(myList.indexOf("Bow"));
        //size
        System.out.println(myList.size());


    }//main

}//class
