package JavaExceptions;

import java.util.ArrayList;

public class Exceptions {
  public static void main(String[] args) {
      //..out of bounds exceptions
     // String [] pets = {"dog", "cat", "monkey"};
     // System.out.println(pets [3]);

     // int i = "Ains";

     // ArrayList<String> list = new ArrayList<String>();
     // list.get(0);

      //..null pointer exception
      // ArrayList<String> list = null;
      //list.get(0);
      //..to fix you put something in the list
      ArrayList<String> list = new ArrayList<String>();
      list.add("book");
      System.out.println(list.get(0));

      // https://www.youtube.com/watch?v=sQwTGB6gW-8


    }
}
