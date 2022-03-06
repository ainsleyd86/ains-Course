package task.StringDemo;

public class StringDemo {
    public static void main(String args[]) {
        String strLiteral = "Hello World!";
        System.out.println(strLiteral); // output will be: Hello World!
        String strObject = new String("Hello World, again!");
        System.out.println(strObject); // output will be: Hello World, again!

        // Method 1
        String str1 = "I like strings";
        String str2 = "I like strings";
        System.out.println(str1 == str2); // output will be: true

        // Method 2
        String str3 = new String("I like strings");
        String str4 = new String("I like strings");
        System.out.println(str3 == str4); // output will be: false

        String str5 = new String("I like strings");
        String str6 = new String("I like strings");
        System.out.println(str5.equals(str6));  // output will be: true

        String myStr = "I like strings";
        int stringLength = myStr.length();
        System.out.println("String Length is " + stringLength);
        // output will be: String Length is 14

        char[] helloArray = {'H', 'e', 'l', 'l', 'o', '.'}; // an array of chars
        String helloString = new String(helloArray);
        System.out.println(helloString); // prints out Hello.

        //example 1
        String myStr1 = "My cat's name is ".concat("Copycat");
        System.out.println(myStr1);
        // output will be: My cat's name is Copycat

        //example 2
        String myStr2 = "Hello, " + "World" + "!";
        System.out.println(myStr2);
        // output will be: Hello, World!

        //example 2.5
        String myStr3 = "Hello," + "World" + "!"; // Be careful, don't forget to add spaces!
        System.out.println(myStr3);
        //output will be: Hello,World! because no spaces were included above

        //example 3
        String string1 = "Welcome ";
        String string2 = "to ";
        String string3 = "Java";
        String string4 = "!";
        System.out.println(string1 + string2 + string3 + string4);
        // output will be: Welcome to Java!

        String strA = "ThIsIsSoMeTeXt";
        String strB = "thisissometext";

        // Converts text to lowercase
        System.out.println(strA.toLowerCase());// output will be: thisisometext

        // Converts text to UPPERCASE
        System.out.println(strA.toUpperCase()); // output will be: THISISSOMETEXT

        // Returns the character at the specified index
        System.out.println(strA.charAt(3)); // output will be: s

        // Returns the first position of the character specified.
        System.out.println(strA.indexOf("I")); // output will be: 2

        // Returns true or false if the string ends with the specified character
        System.out.println(strA.startsWith("t")); // output will be: false

        // Returns true or false if the string ends with the specified character
        System.out.println(strA.endsWith("t")); // output will be: true

        // Returns true or false if the string contains the specified characters
        System.out.println(strA.contains("So")); // output will be: true

        // Returns a new string that is a substring of this string.
        // start index is inclusive and endindex is exclusive
        System.out.println(strA.substring(1, 3)); // output will be: hIs

        // Checks if the values of two strings are the same:
        System.out.println(strA.equals(strB)); // output will be: false

        // Compares two strings ignoring case considerations:
        System.out.println(strA.equalsIgnoreCase(strB)); // output will be: true

        //Searches a string for a specified value and then replaces it with another value
        System.out.println(strA.replace("SoMe", "SOMEREALLYFUN"));
        //output will be: ThIsIsSOMEREALLYFUNTeXt


        String substring1 = strLiteral.substring(0, 4);
        String substring2 = strObject.substring(6, 10);

        System.out.println(substring1 + substring2);
    }
}
//https://qa-community.co.uk/~/_/learning/java-beginner/java--string-manipulation

