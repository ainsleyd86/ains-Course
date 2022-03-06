package com.qa.Constructors;

public class Shirt {

    public static String colour;
    public static char size;

    Shirt() {}

    Shirt(String newColour, char newSize) {
        this.colour = newColour;
        this.size = newSize;

    }

    public static void putOn() {
        System.out.println("Shirt is on!");
    }

    public static void takeOff() {
        System.out.println("Shirt is off!");
    }

    public static void setColour( String newColour) {
        colour = newColour;
    }

    public static void setSize( char newSize) {
        size = newSize;
    }
}
