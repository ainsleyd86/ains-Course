package com.qa.userInput;

import org.w3c.dom.ls.LSInput;

import javax.swing.*;
import java.util.Scanner;

public class Partay {
    //method                //Run code inside curly braces
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter pokemon 1:");
        String pokemon1 = scan.nextLine();
        System.out.println("Enter pokemon 2:");
        String pokemon2 = scan.nextLine();
        System.out.println("Enter pokemon 3:");
        String pokemon3 = scan.nextLine();
        System.out.println("Enter pokemon 4:");
        String pokemon4 = scan.nextLine();
        System.out.println("Enter pokemon 5:");
        String pokemon5 = scan.nextLine();
        System.out.println("Enter pokemon 6:");
        String pokemon6 = scan.nextLine();

        System.out.println("Here are your pokemon!");
        System.out.println(pokemon1);
        System.out.println(pokemon2);
        System.out.println(pokemon3);
        System.out.println(pokemon4);
        System.out.println(pokemon5);
        System.out.println(pokemon6);
    }
}

//https://www.youtube.com/watch?v=jK6NX9iyi-8&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=6
