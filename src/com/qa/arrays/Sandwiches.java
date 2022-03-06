package com.qa.arrays;

import java.util.ArrayList;
import java.util.List;

public class Sandwiches{
    public static void main(String[] args){
        List<String> sandwiches = new ArrayList<>();

        sandwiches.add("bread sandwich");
        sandwiches.add("pop tart");
        sandwiches.add("hot dog");

        System.out.println(sandwiches);
        System.out.println(sandwiches.get(1));
//Each element in an ArrayList is assigned a unique index (starting at 0) based on its position, much like in a normal array.
//We can access an item in the ArrayList by using the get() method and passing in the index of the element:
        sandwiches.set(0, "ice cream taco");
        System.out.println(sandwiches);
//We can modify an ArrayList element by passing the index of the element to the set() method, along with whatever we want it to be set to:
//When we access the sandwiches again, we can see this change is immediate:
        sandwiches.remove(0);
        System.out.println(sandwiches);

        sandwiches.size();

        sandwiches.clear();
        System.out.println(sandwiches);
        //REMOVE
//with the remove() method (passing in the index of the element), or all of them with the clear() method.

//https://qa-community.co.uk/~/_/learning/java-beginner/java--arraylist
    }
}